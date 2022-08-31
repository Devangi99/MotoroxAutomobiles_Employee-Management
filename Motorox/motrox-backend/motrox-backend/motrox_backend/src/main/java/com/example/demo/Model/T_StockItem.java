package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Stock")
public class T_StockItem {
	
	@Id
	@Column(name="Item_Code")
	private String itemcode;
	
	@Column(name="Item_Name")
	private String itemname;
	
	@Column(name="Quantity")
	private int qty;
	
	@Column(name="Received_Qty")
	private int receivedqty;
	
	@Column(name="Sold_Qty")
	private int soldqty;
	
	@Column(name="Damage_Qty")
	private int damageqty;
	
	@Column(name="Return_Qty")
	private int returnqty;
	
	@Column(name="Price")
	private String price;
	
	public T_StockItem() {
		
	}
	
	
	
	public T_StockItem(String itemname, int qty, int receivedqty, int soldqty, int damageqty, int returnqty,
			String price) {
		super();
		this.itemname = itemname;
		this.qty = qty;
		this.receivedqty = receivedqty;
		this.soldqty = soldqty;
		this.damageqty = damageqty;
		this.returnqty = returnqty;
		this.price = price;
	}


	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getReceivedqty() {
		return receivedqty;
	}
	public void setReceivedqty(int receivedqty) {
		this.receivedqty = receivedqty;
	}
	public int getSoldqty() {
		return soldqty;
	}
	public void setSoldqty(int soldqty) {
		this.soldqty = soldqty;
	}
	public int getDamageqty() {
		return damageqty;
	}
	public void setDamageqty(int damageqty) {
		this.damageqty = damageqty;
	}
	public int getReturnqty() {
		return returnqty;
	}
	public void setReturnqty(int returnqty) {
		this.returnqty = returnqty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
