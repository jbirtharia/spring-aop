package com.spring.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dao.CustomerDAO;
import com.spring.demo.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO dao;
	
	@Transactional
	public List<Customer> getCustomers() {
		return dao.getAll();
	}

	@Transactional
	public Customer saveCustomer(Customer customer) {
		return dao.save(customer);
	}
}
