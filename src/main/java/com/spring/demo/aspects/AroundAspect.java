package com.spring.demo.aspects;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import com.spring.demo.entity.Customer;

@Component
@Aspect
public class AroundAspect {

    private Logger logger = Logger.getLogger(AroundAspect.class);

    //It will run before and after target object
    @Around("execution(public java.util.List com.spring.demo.dao.CustomerDAOImpl.getAll())")
    public List<Customer> aroundGetAll(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj;
        try {
            obj = joinPoint.proceed();
            return (List<Customer>) obj;
        } catch (Exception e) {
            logger.info("Exception Occurred");
            logger.info(e.getMessage());
            return new ArrayList<>();
        }
    }

    //It will run before and after target object
    @Around("execution(* com.spring.demo.dao.CustomerDAOImpl.save(*))")
    public Customer aroundSave(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj;
        try {
            obj = joinPoint.proceed();
            return (Customer) obj;
        } catch (Exception e) {
            logger.info("Exception Occurred");
            logger.info(e.getMessage());
            return new Customer();
        }
    }

}
