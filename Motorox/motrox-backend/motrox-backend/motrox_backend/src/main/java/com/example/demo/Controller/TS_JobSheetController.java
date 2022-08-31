package com.example.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.TS_JobSheet;
import com.example.demo.Repository.TS_JobSheetRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class TS_JobSheetController {

	@Autowired
	private TS_JobSheetRepository jobSheetRepository;
	
	//get all job sheets
	@GetMapping("/jobSheets")
	public List<TS_JobSheet> getAllJobSheets(){
		return jobSheetRepository.findAll();
	}
	
	//create a job Sheet
	@PostMapping("/jobSheets")
	public TS_JobSheet createJobSheet(@RequestBody TS_JobSheet jobSheet) {
		return jobSheetRepository.save(jobSheet);
	}
	
	//get job sheet y id
	@GetMapping("jobSheets/{id}")
	public ResponseEntity<TS_JobSheet> getJobSheetById(@PathVariable Long id) {
		TS_JobSheet jobSheet = jobSheetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job Sheet not Exixting with id:" + id));
		return ResponseEntity.ok(jobSheet);
	}
	
	//update job Sheet
	@PutMapping("jobSheets/{id}")
	public ResponseEntity<TS_JobSheet> updateJobSheet(@PathVariable Long id,@RequestBody TS_JobSheet jobSheetDetails){
		TS_JobSheet jobSheets = jobSheetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job Sheet not Exixting with id:" + id));
		jobSheets.setCustomerName(jobSheetDetails.getCustomerName());
		jobSheets.setCustomerNIC(jobSheetDetails.getCustomerNIC());
		jobSheets.setVehicelId(jobSheetDetails.getVehicelId());
		jobSheets.setContactNumber(jobSheetDetails.getContactNumber());
		jobSheets.setDate(jobSheetDetails.getDate());
		jobSheets.setTime(jobSheetDetails.getTime());
		jobSheets.setFrontUsable(jobSheetDetails.getFrontUsable());
		jobSheets.setFrontReplace(jobSheetDetails.getFrontReplace());
		jobSheets.setRearUsable(jobSheetDetails.getRearUsable());
		jobSheets.setRearReplace(jobSheetDetails.getRearReplace());
		jobSheets.setlRUsable(jobSheetDetails.getlRUsable());
		jobSheets.setlRReplace(jobSheetDetails.getlRReplace());
		jobSheets.setTopUsable(jobSheetDetails.getTopUsable());
		jobSheets.setTopReplace(jobSheetDetails.getTopReplace());
		jobSheets.setEngineRUsable(jobSheetDetails.getEngineRUsable());
		jobSheets.setEngineRReplace(jobSheetDetails.getEngineRReplace());
		jobSheets.setBottomUsable(jobSheetDetails.getBottomUsable());
		jobSheets.setBottomReplace(jobSheetDetails.getBottomReplace());
		
		TS_JobSheet updatedJobSheet = jobSheetRepository.save(jobSheets);
		return ResponseEntity.ok(updatedJobSheet);
	}
	
	//Delete Job Sheet
	@DeleteMapping("/jobSheets/{id}")
	public ResponseEntity< Map<String,Boolean>> deleteJobSheet(@PathVariable Long id){
		TS_JobSheet jobSheet = jobSheetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job Sheet not Exixting with id:" + id));
		
		jobSheetRepository.delete(jobSheet);
		Map<String,Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		
		return ResponseEntity.ok(response);
	}
	
}
