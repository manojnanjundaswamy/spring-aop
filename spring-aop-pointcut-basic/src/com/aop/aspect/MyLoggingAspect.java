package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
	
	//Match on method Wildcards:	
	/**
	 * Advice on any addAccount method 
	 */
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("===> Executing @Before advice on any addAccount method<===");
	}
	/**
	 * Advice addAccount method in AccountDAO class
	 */
	@Before("execution(public void com.aop.dao.AccountDAO.addAccount())")
	public void beforeAccountDAOAddAccountAdvice() {
		System.out.println("===> Executing @Before advice on AccountDAO.addAccount() method<===");
	}
	/**
	 * Advice on any method starts with "add" and return type void
	 */
	@Before("execution(public void add*())")
	public void beforeAnyMethodStartsWithAddAdvice() {
		System.out.println("===> Executing @Before advice on any method starts with \"add\" method<===");
	}
	
	/**
	 * Advice on any method starts with "add" with any return type
	 */
	@Before("execution(* add*())")
	public void beforeAnyMethodStartsWithAddWithAnyReturnType() {
		System.out.println("===> Executing @Before advice on any method starts with \"add\" with any return type<===");
	}
	
	
	//Match on Parameter Pattern Wildcards:	
	/**
	 * Advice on any method starts with "add" with "Account" object as parameter and any return type
	 */
	@Before("execution(* add*(com.aop.entity.Account))")
	public void beforeAnyMethodStartsWithAddWithAnyReturnTypeWithAccountAsArg() {
		System.out.println("===> Executing @Before advice on any method starts with \"add\" with any return type with \"Account\" obj as arg<===");		
	}
	
	/**
	 * Advice on any method starts with "add" with "Account" object and any arguments as parameter and any return type
	 */
	@Before("execution(* add*(com.aop.entity.Account, ..))")
	public void beforeAnyMethodStartsWithAddWithAnyReturnTypeWithAccountAndManyArgs() {
		System.out.println("===> Executing @Before advice on any method starts with \"add\" with any return type with \"Account\" obj and other as args<===");		
	}
	
	/**
	 * Advice on any method starts with "add" with any number of arguments as parameters and any return type
	 */
	@Before("execution(* add*(..))")
	public void beforeAnyMethodStartsWithAddWithAnyReturnTypeWithAnyNumberOfArgs() {
		System.out.println("===> Executing @Before advice on any method starts with \"add\" with any return type with any number of args<===");		
	}
	
	
	//Match on methods in a package:
	/**
	 * Advice on any method in package "com.aop.dao" with any number of parameters and any return type
	 */
	@Before("execution(* com.aop.dao.*.*(..))")
	public void beforeAnyMethodInGivenPackageWithAnyReturnTypeWithAnyNumberOfArgs() {
		System.out.println("===> Executing @Before advice on any method in \"com.aop.dao\" package with any return type with any number of args<===");		
	}
}
