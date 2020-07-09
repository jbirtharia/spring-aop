package com.spring.demo.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.demo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	SessionFactory factory;
	
	public List<Customer> getAll() {
		List customers = factory.getCurrentSession().createQuery("from Customer").getResultList();
		if(customers!=null && !customers.isEmpty())
			return customers;
		else
			throw new RuntimeException("Customer Not Found !!!!!!");
	}

	public Customer save(Customer customer) {
		if(customer.getFirstName() == null)
			throw new RuntimeException("Exception occurred during save..");
		factory.getCurrentSession().save(customer);
		return customer;
	}

	public void demoMethod() {
		System.out.println("Demo Method..");
	}
}
