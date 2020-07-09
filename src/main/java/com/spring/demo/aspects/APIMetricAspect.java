package com.spring.demo.aspects;
/*
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class APIMetricAspect {

	private Logger logger = Logger.getLogger(APIMetricAspect.class);
	
	@Pointcut("execution(* com.spring.demo.dao.CustomerDAOImpl.*(..))")
	private void loggingForDao() {}
	
	@Around("loggingForDao()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by "+joinPoint+" is "+ timeTaken);
	}

}
*/