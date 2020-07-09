package com.spring.demo.aspects;

/*
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import com.spring.demo.entity.Customer;

@Component
@Aspect
public class AfterReturnAspect {

	private Logger logger = Logger.getLogger(AfterReturnAspect.class);
	
	
	//It will run if target object executes successfully
	@AfterReturning(
			pointcut = "execution(public java.util.List com.spring.demo.dao.CustomerDAOImpl.getAll())",
			returning = "result")
	public void afterReturnAllCustomers(JoinPoint point, List<Customer> result) {
		logger.info("Method Name : "+point.getSignature().toShortString());
		
		//This can be dangerous, because when you set data in customer object
		//it will also update data in database.
		if(result!=null && !result.isEmpty()) 
			result.stream().forEachOrdered(customer -> {
			customer.setFirstName(customer.getFirstName().toUpperCase());
			customer.setLastName(customer.getLastName().toUpperCase());
			});
		
		logger.info("Result : "+result);
	}
	
	
	//It will run when exception comes into target object.
	@AfterThrowing(
			pointcut = "execution(public java.util.List com.spring.demo.dao.CustomerDAOImpl.getAll())",
			throwing = "exception")
	public void afterGettingException(JoinPoint point, Throwable exception) {
		logger.info("Method Name : "+point.getSignature().toShortString());
		
		logger.info("Exception : "+exception);
	}
	
	//It will run whether exception comes or not. It will run before @AfterReturning
	@After("execution(public java.util.List com.spring.demo.dao.CustomerDAOImpl.getAll())")
	public void afterFinallyForDao(JoinPoint point) {
		logger.info("Method Name in after annotation: "+point.getSignature().toShortString());
	}
	
	//It will run before and after target object
	@Around("execution(public java.util.List com.spring.demo.dao.CustomerDAOImpl.getAll())")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by "+joinPoint+" is "+ timeTaken);
	}
}
*/