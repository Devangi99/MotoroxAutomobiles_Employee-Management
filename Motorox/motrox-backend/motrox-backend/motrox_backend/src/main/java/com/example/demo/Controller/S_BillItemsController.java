package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.S_BillItems;
import com.example.demo.Repository.S_BillItemsRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")
public class S_BillItemsController {

	@Autowired
	private S_BillItemsRepository S_BillItemsRepositoryObj;
	
	
	//get all billItems
	@GetMapping("/billitems")
	public List<S_BillItems> getAllemail(){
		return S_BillItemsRepositoryObj.findAll();
	}

	//get billitems by id
	@GetMapping("/billitems/{id}")
	public ResponseEntity<S_BillItems> getEmailById(@PathVariable int id) {
		S_BillItems S_BillItemsobj2 = S_BillItemsRepositoryObj.findById(id).orElseThrow(() -> new ResourceNotFoundException("emp not fount"));
		return ResponseEntity.ok(S_BillItemsobj2);
	}
	
	
}
