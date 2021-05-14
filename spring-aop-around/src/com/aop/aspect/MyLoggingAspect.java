package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Aspect class with advices
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Aspect
@Component
public class MyLoggingAspect {
	
	/**
	 * Around Advice "FortuneService.getTodaysFortune" method in "com.aop.service" with any number of paraments and arguments
	 * with ProceedingJoinPoint to get paraments and return result of the method
	 */
	@Around("execution(* com.aop.service.FortuneService.getTodaysFortune(..))")
	public Object aroundGetTodaysFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		
		String method = theProceedingJoinPoint.getSignature().toShortString();
		System.out.println("===>Executing @Around on method "+method+"<===");
		
		
		long begin =System.currentTimeMillis();
		
		Object result = null;
		try {
			result = theProceedingJoinPoint.proceed();
		} catch (Throwable ex) {
			System.out.println("==> Exp Message: "+ex.getMessage()+" <==");
			//Rethrow exception
			/* throw ex; */
			//Or Handle exception
			result = "Be careful for today";
		}
		
		long end =System.currentTimeMillis();
		
		long duration = end - begin;
		
		System.out.println("===> Duration: "+duration/1000+" seconds");
		
		return result; 
	}	
}
