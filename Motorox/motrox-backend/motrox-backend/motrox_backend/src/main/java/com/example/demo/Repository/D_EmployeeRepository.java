package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.D_Employee;

@Repository
public interface D_EmployeeRepository extends JpaRepository<D_Employee, Long>{
	
	List<D_Employee> findByEmployeeNameContaining(String employeeName);

}
