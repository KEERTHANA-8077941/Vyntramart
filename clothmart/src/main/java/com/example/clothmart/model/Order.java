package com.example.clothmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
	
	private long orderid;
    private Date orderDate;
    private int orderNum;
    private double amount;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;
    
    public Order() {
    	
    }
    
    public Order(Date orderDate,int orderNum,double amount,String customerName, String customerAddress, String customerEmail,String customerPhone) {
		this.orderDate = orderDate;
		this.orderNum = orderNum;
		this.amount = amount;
		this.customerName=customerName;
	    this.customerAddress=customerAddress;
	    this.customerEmail=customerEmail;
	    this.customerPhone=customerPhone;
    }
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 
    public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	
	@Column(name = "Order_Date", nullable = false)
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Column(name = "Order_Number", nullable = false)
	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	@Column(name = "Amount", nullable = false)
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
 @Column(name = "Customer_Name", length = 255, nullable = false)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

    @Column(name = "Customer_Address", length = 255, nullable = false)
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

    @Column(name = "Customer_Email", length = 128, nullable = false)
	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}
	 @Column(name = "Customer_Phone", length = 128, nullable = false)
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
    
}
