package com.spring.demo.dao;

import java.util.List;

import com.spring.demo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getAll();
	
	public Customer save(Customer customer);
}
