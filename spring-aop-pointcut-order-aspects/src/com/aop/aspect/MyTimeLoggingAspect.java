package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Aspect class with advices with order 2
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Aspect
@Component
@Order(2)
public class MyTimeLoggingAspect {
	
	/**
	 * Before using forDaoPackageNoGetterSetter() for methods package com.aop.dao excluding get* and set*
	 */
	@Before("com.aop.aspect.AopExpressions.forDaoPackage()")
	public void logStartTime() {
		System.out.println("===> Date-Time: "+new java.util.Date()+" <===");
	}
}
