package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Aspect class with advices with order 3
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Aspect
@Component
@Order(3)
public class MyCloudLogAspect {
	
	/**
	 * Before using forDaoPackageNoGetterSetter() for methods package com.aop.dao excluding get* and set*
	 */
	@Before("com.aop.aspect.AopExpressions.forDaoPackage()")
	public void logToCloud() {
		System.out.println("===> Logging to cloud <===");
	}
}
