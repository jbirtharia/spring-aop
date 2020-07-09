package com.spring.demo.aspects;
/*
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.jboss.logging.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingToColudAspect {

	private Logger logger = Logger.getLogger(LoggingToLocalAspect.class);

	@Pointcut("execution(* com.spring.demo.dao.CustomerDAOImpl.*(..))")
	private void loggingForDao() {}
	
	//Exclude method methodExcludeInDao() for logging
		@Before("loggingForDao()")
		public void addLog(JoinPoint point) {
			logger.info("Logging before Dao....");
			MethodSignature signature = (MethodSignature) point.getSignature();
			logger.info("Method Name : "+signature);
			for (Object object : point.getArgs()) {
				logger.info("Customer Details : "+object);
			}
		}
}
*/