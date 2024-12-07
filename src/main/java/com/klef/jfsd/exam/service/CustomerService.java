package com.klef.jfsd.exam.service;

import java.util.List;

import com.klef.jfsd.exam.model.Customer;

public interface CustomerService {
	
	public String insertCustomer(Customer c);
	public List<Customer> viewAllCustomers();
	
}