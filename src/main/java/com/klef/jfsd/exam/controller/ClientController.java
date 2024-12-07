package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
public class ClientController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String home() {
		
		return "Customer with JPA Mapping";
		
	}
	
	@PostMapping("add")
	public String addcustomer(@RequestBody Customer customer) {
		
		return service.insertCustomer(customer);
		
	}
	
	@GetMapping("viewall")
	public ModelAndView viewcustomers(Model model)
	{
		ModelAndView mv = new ModelAndView("viewallcustomers");
		 
		model.addAttribute("customerdata", service.viewAllCustomers());
		  
	    return mv;
	}
	
}