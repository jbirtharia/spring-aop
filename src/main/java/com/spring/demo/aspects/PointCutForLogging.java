package com.spring.demo.aspects;
/*
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCutForLogging {

	private Logger logger = Logger.getLogger(PointCutForLogging.class);

	@Pointcut("execution(* com.spring.demo.dao.CustomerDAOImpl.*(..))")
	private void loggingForDao() {}
	
	@Pointcut("execution(* com.spring.demo.dao.CustomerDAOImpl.demoMethod())")
	private void methodExcludeInDao() {}
	
	
	//Exclude method methodExcludeInDao() for logging
	@Before("loggingForDao() && !(methodExcludeInDao())")
	public void addLog(JoinPoint point) {
		logger.info("Logging before Dao....");
		for (Object object : point.getArgs()) {
			logger.info("Customer Details : "+object);
		}
	}
}
*/