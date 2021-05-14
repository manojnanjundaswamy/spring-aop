package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
	 * Pointcut expression to match any method in package "com.aop.dao" with any number of parameters and any return type
	 */
	@Pointcut("execution(* com.aop.dao.*.*(..))")
	public void forDaoPackage() {}
	
	//Reuse the declared pointcut
	/**
	 * Advice reusing forDaoPackage() pointcut method
	 */
	@Before("forDaoPackage()")
	public void beforeAnyMethodInGivenPackageWithAnyReturnTypeWithAnyNumberOfArgs() {
		System.out.println("===> Executing @Before advice on any method in \"com.aop.dao\" package with any return type with any number of args<===");		
	}
	
	//Reuse the declared pointcut
	/**
	 * Advice reusing forDaoPackage() pointcut method
	 */
	@Before("forDaoPackage()")
	public void logStartTime() {
		System.out.println("===> Date-Time: "+new java.util.Date()+" <===");
	}
}
