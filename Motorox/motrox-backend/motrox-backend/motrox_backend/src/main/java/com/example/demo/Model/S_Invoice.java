package com.example.demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Invoice")
public class S_Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoicId;
	
	//auto generated number 
	@Column(name="Invoice_Number")
	private String invoiceNumber;
	
	@Column(name="Vehical_Number")
	private String vehicalNumber;
	
	@Column(name="Invoice_Date")
	private String Date;
	
	@Column(name="TotalAmount")
	private int totalAmount;
	
	@OneToMany(targetEntity = S_BillItems.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Invoice_Number",referencedColumnName= "invoicId")
	private List<S_BillItems> BillItemObj;
	
	public S_Invoice() {
		
	}

	public S_Invoice(String invoiceNumber, String vehicalNumber, String date, int totalAmount,
			List<S_BillItems> billItemObj) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.vehicalNumber = vehicalNumber;
		Date = date;
		this.totalAmount = totalAmount;
		BillItemObj = billItemObj;
	}

	public int getInvoicId() {
		return invoicId;
	}

	public void setInvoicId(int invoicId) {
		this.invoicId = invoicId;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<S_BillItems> getBillItemObj() {
		return BillItemObj;
	}

	public void setBillItemObj(List<S_BillItems> billItemObj) {
		BillItemObj = billItemObj;
	}
	
	
	
}
