package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Sh_Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long supplierId;
	
	@Column(name = "Supplier_Name")
	private String supplierName;
	
	@Column(name = "Supplier_Phone")
	private String supplierPhone;
	
	@Column(name = "Supplier_Address")
	private String supplierAddress;
	
	@Column(name = "Supplier_Email")
	private String supplierEmail;
	
	@Column(name = "Item_Description")
	private String itemDescription;
	
	@Column(name = "Supplier_JoinDate")
	private String supplierJoinDate;
	
	@Column(name = "Payment_Method")
	private String paymentMethod;
	
	public Sh_Supplier() {
		
	}

	public Sh_Supplier(String supplierName, String supplierPhone, String supplierAddress, String supplierEmail,
			String itemDescription, String supplierJoinDate, String paymentMethod) {
		super();
		this.supplierName = supplierName;
		this.supplierPhone = supplierPhone;
		this.supplierAddress = supplierAddress;
		this.supplierEmail = supplierEmail;
		this.itemDescription = itemDescription;
		this.supplierJoinDate = supplierJoinDate;
		this.paymentMethod = paymentMethod;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getSupplierJoinDate() {
		return supplierJoinDate;
	}

	public void setSupplierJoinDate(String supplierJoinDate) {
		this.supplierJoinDate = supplierJoinDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	

}
