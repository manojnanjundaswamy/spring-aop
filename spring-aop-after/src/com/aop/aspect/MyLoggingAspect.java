package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyLoggingAspect {
	
	
	
	@After("execution(* com.aop.dao.AccountDAO.findAccounts(..))")
	public void afterFindAccountAdvice(JoinPoint theJoinPoint) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("===>Executing @After on method "+method+"<===");
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.aop.dao.AccountDAO.findAccounts(..))",
			throwing = "theExc"
			)
	public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint, Throwable theExc) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("===>Executing @AfterThrowing on method "+method+"<===");
		
		System.out.println("===>The Exception is: "+theExc+"<===");
	}
	
	
}
