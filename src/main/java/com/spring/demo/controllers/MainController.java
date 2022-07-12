package com.spring.demo.controllers;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.Customer;
import com.spring.demo.service.CustomerService;

@RestController
public class MainController {
	
	@Autowired
	CustomerService customerService;

    private Logger logger = Logger.getLogger(MainController.class);


    @GetMapping("/customer")
	public List showCustomers() {
        return customerService.getCustomers();
	}
	
	@PostMapping("/customer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
