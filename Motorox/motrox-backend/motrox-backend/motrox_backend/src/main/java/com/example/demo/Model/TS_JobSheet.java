package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobSheet")
public class TS_JobSheet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobSheetId;
	
	@Column(name = "CustomerName")
	private String customerName;
	
	@Column(name = "CustomerNIC")
	private String customerNIC;
	
	@Column(name = "VehicleId")
	private String vehicelId;
	
	@Column(name = "ContactNumber")
	private String contactNumber;
	
	@Column(name = "Date")
	private String date;
	
	@Column(name = "Time")
	private String time;
	
	@Column(name = "Front_Usable")
	private String frontUsable;
	
	@Column(name = "Front_Replace")
	private String frontReplace;
	
	@Column(name = "Rear_Usable")
	private String rearUsable;
	
	@Column(name = "Rear_Replace")
	private String rearReplace; 
	
	@Column(name = "LR_Usable")
	private String lRUsable;
	
	@Column(name = "LR_Replace")
	private String lRReplace;
	
	@Column(name = "Top_Usable")
	private String topUsable;
	
	@Column(name = "Top_Replace")
	private String topReplace;
	
	@Column(name = "EngineRoom_Usable")
	private String engineRUsable;
	
	@Column(name = "EngineRoom_Replace")
	private String engineRReplace;
	
	@Column(name = "Bottom_Usable")
	private String bottomUsable;
	
	@Column(name = "Bottom_Replace")
	private String bottomReplace;
	
	public TS_JobSheet() {
		
	}
	
	public TS_JobSheet(String customerName, String customerNIC, String vehicelId, String contactNumber, String date,
			String time, String frontUsable, String frontReplace, String rearUsable, String rearReplace,
			String lRUsable, String lRReplace, String topUsable, String topReplace, String engineRUsable,
			String engineRReplace, String bottomUsable, String bottomReplace) {
		super();
		this.customerName = customerName;
		this.customerNIC = customerNIC;
		this.vehicelId = vehicelId;
		this.contactNumber = contactNumber;
		this.date = date;
		this.time = time;
		this.frontUsable = frontUsable;
		this.frontReplace = frontReplace;
		this.rearUsable = rearUsable;
		this.rearReplace = rearReplace;
		this.lRUsable = lRUsable;
		this.lRReplace = lRReplace;
		this.topUsable = topUsable;
		this.topReplace = topReplace;
		this.engineRUsable = engineRUsable;
		this.engineRReplace = engineRReplace;
		this.bottomUsable = bottomUsable;
		this.bottomReplace = bottomReplace;
	}
	public long getJobSheetId() {
		return jobSheetId;
	}
	public void setJobSheetId(long jobSheetId) {
		this.jobSheetId = jobSheetId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNIC() {
		return customerNIC;
	}
	public void setCustomerNIC(String customerNIC) {
		this.customerNIC = customerNIC;
	}
	public String getVehicelId() {
		return vehicelId;
	}
	public void setVehicelId(String vehicelId) {
		this.vehicelId = vehicelId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFrontUsable() {
		return frontUsable;
	}
	public void setFrontUsable(String frontUsable) {
		this.frontUsable = frontUsable;
	}
	public String getFrontReplace() {
		return frontReplace;
	}
	public void setFrontReplace(String frontReplace) {
		this.frontReplace = frontReplace;
	}
	public String getRearUsable() {
		return rearUsable;
	}
	public void setRearUsable(String rearUsable) {
		this.rearUsable = rearUsable;
	}
	public String getRearReplace() {
		return rearReplace;
	}
	public void setRearReplace(String rearReplace) {
		this.rearReplace = rearReplace;
	}
	public String getlRUsable() {
		return lRUsable;
	}
	public void setlRUsable(String lRUsable) {
		this.lRUsable = lRUsable;
	}
	public String getlRReplace() {
		return lRReplace;
	}
	public void setlRReplace(String lRReplace) {
		this.lRReplace = lRReplace;
	}
	public String getTopUsable() {
		return topUsable;
	}
	public void setTopUsable(String topUsable) {
		this.topUsable = topUsable;
	}
	public String getTopReplace() {
		return topReplace;
	}
	public void setTopReplace(String topReplace) {
		this.topReplace = topReplace;
	}
	public String getEngineRUsable() {
		return engineRUsable;
	}
	public void setEngineRUsable(String engineRUsable) {
		this.engineRUsable = engineRUsable;
	}
	public String getEngineRReplace() {
		return engineRReplace;
	}
	public void setEngineRReplace(String engineRReplace) {
		this.engineRReplace = engineRReplace;
	}
	public String getBottomUsable() {
		return bottomUsable;
	}
	public void setBottomUsable(String bottomUsable) {
		this.bottomUsable = bottomUsable;
	}
	public String getBottomReplace() {
		return bottomReplace;
	}
	public void setBottomReplace(String bottomReplace) {
		this.bottomReplace = bottomReplace;
	}
	
	
	
}
