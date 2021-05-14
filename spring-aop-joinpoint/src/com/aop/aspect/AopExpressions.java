package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Aspect class with pointcuts to reuse
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Aspect
public class AopExpressions {
	
	/**
	 * Pointcut for all methods in package com.aop.dao with any return type and any number of parameters
	 */
	@Pointcut("execution(* com.aop.dao.*.*(..))")
	public void forDaoPackage() {}

}
