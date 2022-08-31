package com.example.demo.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class N_Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long vehicleId;
	
	@Column(name = "NameOfTheOwner")
	private String nameOfTheOwner;
	
	@Column(name = "YearOFManufacture")
	private String yearOfManufacture;
	
	@Column(name = "ChassisNo")
	private String chassisNo;
	
	@Column(name = "EngineNo")
	private String engineNo;
	
	@Column(name = "SeatingCapacity")
	private String seatingCapacity;
	
	@Column(name = "Make")
	private String make;
	
	@Column(name = "Model")
	private String model;
	
	@Column(name = "TypeOfFuel")
	private String typeOfFuel;
	
	@Column(name = "TypeOfBody")
	private String typeOfBody;
	
	@Column(name = "CylinderCapacity")
	private String cylinderCapacity;
	
	@Column(name = "DateOfRegistration")
	private String dateOfRegistration;
	
	@Column(name = "ClassOfVehicle")
	private String classOfVehicle;
	
	@Column(name = "Colour")
	private String colour;
	
	
	
	public N_Vehicle() {
		
	}
	
	
	public N_Vehicle(String nameOfTheOwner, String yearOfManufacture, String chassisNo, String engineNo,
			String seatingCapacity, String make, String model, String typeOfFuel, String typeOfBody,
			String cylinderCapacity, String dateOfRegistration, String classOfVehicle, String colour) {
		super();
		this.nameOfTheOwner = nameOfTheOwner;
		this.yearOfManufacture = yearOfManufacture;
		chassisNo = chassisNo;
		engineNo = engineNo;
		this.seatingCapacity = seatingCapacity;
		this.make = make;
		this.model = model;
		this.typeOfFuel = typeOfFuel;
		this.typeOfBody = typeOfBody;
		this.cylinderCapacity = cylinderCapacity;
		this.dateOfRegistration = dateOfRegistration;
		this.classOfVehicle = classOfVehicle;
		this.colour = colour;
	}
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getNameOfTheOwner() {
		return nameOfTheOwner;
	}
	public void setNameOfTheOwner(String nameOfTheOwner) {
		this.nameOfTheOwner = nameOfTheOwner;
	}
	public String getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		chassisNo = chassisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		engineNo = engineNo;
	}
	public String getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTypeOfFuel() {
		return typeOfFuel;
	}
	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}
	public String getTypeOfBody() {
		return typeOfBody;
	}
	public void setTypeOfBody(String typeOfBody) {
		this.typeOfBody = typeOfBody;
	}
	public String getCylinderCapacity() {
		return cylinderCapacity;
	}
	public void setCylinderCapacity(String cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
}
