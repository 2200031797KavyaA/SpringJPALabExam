package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
    private CustomerRepository customer;
	
	@Override
	public String insertCustomer(Customer c) {
		
		customer.save(c);
		return "Customer Added Successfully";
		
	}

	@Override
	public List<Customer> viewAllCustomers() {
		
		return customer.findAll();
		
	}

}