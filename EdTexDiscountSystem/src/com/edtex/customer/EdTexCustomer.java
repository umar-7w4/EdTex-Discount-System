package com.edtex.customer;

public class EdTexCustomer {
	
	private int customerId;
	private String customerName;
	private String customerNeed;
	private String membership;
	
	public EdTexCustomer() {
		
	}
	
	public EdTexCustomer(int customerId, String customerName, String customerNeed, String membership) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerNeed = customerNeed;
		this.membership = membership;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNeed() {
		return customerNeed;
	}

	public void setCustomerNeed(String customerNeed) {
		this.customerNeed = customerNeed;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

}
