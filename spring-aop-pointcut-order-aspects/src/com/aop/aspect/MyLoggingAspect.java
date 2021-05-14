package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Aspect class with advices with order 1
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Aspect
@Component
@Order(1)
public class MyLoggingAspect {
	
	/**
	 * Before using forDaoPackageNoGetterSetter() for methods package com.aop.dao
	 */
	@Before("com.aop.aspect.AopExpressions.forDaoPackage()")
	public void beforeAnyMethodInGivenPackageWithAnyReturnTypeWithAnyNumberOfArgs() {
		System.out.println("===> Executing @Before advice on any method in \"com.aop.dao\" package with any return type with any number of args<===");		
	}
}
