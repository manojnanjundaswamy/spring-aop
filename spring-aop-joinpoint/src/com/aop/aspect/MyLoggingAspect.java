package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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
	 * Before advice using forDaoPackageNoGetterSetter() for methods in package com.aop.dao
	 * Accessing the joinpoint of the method
	 */
	@Before("com.aop.aspect.AopExpressions.forDaoPackage()")
	public void beforeAnyMethodInGivenPackageWithAnyReturnTypeWithAnyNumberOfArgs(JoinPoint theJoinPoint) {
		System.out.println("===> Executing @Before advice on any method in \"com.aop.dao\" package with any return type with any number of args<===");		
	
		//Display method signature		
		MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method: "+methodSignature);
		
		//Display method arguments		
		Object[] args = theJoinPoint.getArgs();
		
		for(Object arg: args) {			
			System.out.println("Arguments: "+arg);
		}
	
	}
}
