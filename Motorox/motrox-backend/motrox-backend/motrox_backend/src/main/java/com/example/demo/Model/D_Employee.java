package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class D_Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;//
	
	@Column//(name = "Employee_Name")
	private String employeeName;//
	
	@Column//(name = "Employee_NIC")
	private String employeeNIC;//
	
	@Column//(name = "Employee_Address")
	private String employeeAddress;
	
	@Column//(name = "Employee_Phone")
	private String employeePhone;
	
	@Column//(name = "Employee_Email")
	private String employeeEmail;//
	
	@Column//(name = "Employee_Join_Date")
	private String employeeJoinDate;//
	
	@Column//(name = "Basic_Salary")
	private String basicSalary;//
	
	@Column//(name = "Employee_Type")
	private String employeeType;//
	
	@Column//(name = "Employee_Category")
	private String employeeCategory;//
	
	public D_Employee() {
		
	}
	
	public D_Employee(String employeeName, String employeeNIC, String employeeAddress, String employeePhone,
			String employeeEmail, String employeeJoinDate, String basicSalary, String employeeType,
			String employeeCategory) {
		super();
		this.employeeName = employeeName;
		this.employeeNIC = employeeNIC;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.employeeEmail = employeeEmail;
		this.employeeJoinDate = employeeJoinDate;
		this.basicSalary = basicSalary;
		this.employeeType = employeeType;
		this.employeeCategory = employeeCategory;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeNIC() {
		return employeeNIC;
	}
	public void setEmployeeNIC(String employeeNIC) {
		this.employeeNIC = employeeNIC;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeJoinDate() {
		return employeeJoinDate;
	}
	public void setEmployeeJoinDate(String employeeJoinDate) {
		this.employeeJoinDate = employeeJoinDate;
	}
	public String getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getEmployeeCategory() {
		return employeeCategory;
	}
	public void setEmployeeCategory(String employeeCategory) {
		this.employeeCategory = employeeCategory;
	}
	
	

}
