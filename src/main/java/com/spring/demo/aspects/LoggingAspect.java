package com.spring.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	//private Logger logger = Logger.getLogger(LoggingAspect.class);
	
	/*
	
	//@Before("execution(* com.spring.demo.dao.CustomerDAOImpl.getAll())")
	@Before("execution(public java.util.List com.spring.demo.dao.CustomerDAOImpl.getAll())")
	public void beforeGetAll() {
		logger.info("Logging before Dao....");
	}
	
	//@Before("execution(* com.spring.demo.controllers.MainController.showCustomers())")
	@Before("execution(public java.util.List com.spring.demo.controllers.MainController.showCustomers())")
	public void beforeShowCustomers() {
		logger.info("Logging before Controller....");
	}
	
	//Predicate Expression for a single any type of argument
	//@Before("execution(public void com.spring.demo.dao.CustomerDAOImpl.save(*))")
	//Predicate Expression for n number of argument and any type
	//@Before("execution(public void com.spring.demo.dao.CustomerDAOImpl.save(..))")
	@Before("execution(public void com.spring.demo.dao.CustomerDAOImpl.save(com.spring.demo.entity.Customer))")
	public void beforeSave(JoinPoint point) {
		logger.info("Logging before Dao....");
		for (Object object : point.getArgs()) {
			logger.info("Customer Details : "+object);
		}
	}
	
	*/
	
	/*
	//Predicate Expression for all methods with any return type in a class and for n numbers of parameters 
	@Before("execution(* com.spring.demo.dao.CustomerDAOImpl.*(..))")
	public void addLog(JoinPoint point) {
		logger.info("Logging before Dao....");
		for (Object object : point.getArgs()) {
			logger.info("Customer Details : "+object);
		}
	}
	*/
	
	
	//Setting Pointcut for all logging in a single class
	//It can be used at many locations where same predicate expressions needed
	
}
