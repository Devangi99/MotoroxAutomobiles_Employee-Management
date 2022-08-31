package com.example.demo.Controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.D_Employee;
import com.example.demo.Repository.D_EmployeeRepository;
import com.example.demo.Service.D_EmployeeService;

import net.sf.jasperreports.engine.JRException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class D_EmployeeController {
	
	@Autowired
	private D_EmployeeRepository employeeRepository;
	
	@Autowired
	private D_EmployeeService service;
	
	//report
	@GetMapping("/employees/report/{format}")
	public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
		return service.exportReport(format);
	}
	
	//search and get all employees
	@GetMapping("/employees")
	public ResponseEntity<List<D_Employee>> getAllEmployees(@RequestParam(required = false) String employeeName){
		try {
			List<D_Employee> d_Employee =new ArrayList<D_Employee>();
			
			if(employeeName == null)
				employeeRepository.findAll().forEach(d_Employee::add); 
			else
				employeeRepository.findByEmployeeNameContaining(employeeName).forEach(d_Employee::add); 
			/*
			if(d_Employee.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);   
			}   */
			return new ResponseEntity<>(d_Employee, HttpStatus.OK);
			
		}catch (Exception e){
			
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//get all employees
	//@GetMapping("/employees")
	//public List<D_Employee> getAllEmployees(){
		//return employeeRepository.findAll();
	//}
	
	//create employee rest api
	@PostMapping("/employees")
	public D_Employee createEmployee(@RequestBody D_Employee d_Employee) {
		return employeeRepository.save(d_Employee);
	}
	
	//get employee by id
	@GetMapping("/employees/{id}")
	public ResponseEntity<D_Employee> getEmployeeById(@PathVariable Long id) {
		D_Employee d_Employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found" + id));
		return ResponseEntity.ok(d_Employee);
	}
	
	
	//update employee
	@PutMapping("/employees/{id}")
	public ResponseEntity<D_Employee> updateEmployee(@PathVariable Long id, @RequestBody D_Employee employeedetails){
		D_Employee d_Employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found" + id));
			
		d_Employee.setEmployeeName(employeedetails.getEmployeeName());
		d_Employee.setEmployeeNIC(employeedetails.getEmployeeNIC());
		d_Employee.setEmployeeAddress(employeedetails.getEmployeeAddress());
		d_Employee.setEmployeePhone(employeedetails.getEmployeePhone());
		d_Employee.setEmployeeEmail(employeedetails.getEmployeeEmail());
		d_Employee.setEmployeeJoinDate(employeedetails.getEmployeeJoinDate());
		d_Employee.setBasicSalary(employeedetails.getBasicSalary());
		d_Employee.setEmployeeType(employeedetails.getEmployeeType());
		d_Employee.setEmployeeCategory(employeedetails.getEmployeeCategory());
			
		D_Employee updatedemployee = employeeRepository.save(d_Employee);
		return ResponseEntity.ok(updatedemployee);
			
	}
		
		
	//delete employee
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		D_Employee d_Employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found" + id));			
		employeeRepository.delete(d_Employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
