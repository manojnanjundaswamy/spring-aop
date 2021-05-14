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
	 * Pointcut for package com.aop.dao
	 */
	@Pointcut("execution(* com.aop.dao.*.*(..))")
	public void forDaoPackage() {}
	/**
	 * Pointcut for get* methods in package com.aop.dao
	 */
	@Pointcut("execution(* com.aop.dao.*.get*(..))")
	public void forGetter() {}
	/**
	 * Pointcut for set* methods in package com.aop.dao
	 */
	@Pointcut("execution(* com.aop.dao.*.set*(..))")
	public void forSetter() {}
	
	//Combining Pointcuts
	/**
	 * Pointcut method combining pointcuts forDaoPackage(), forGetter() and forSetter() 
	 */
	@Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
	public void forDaoPackageNoGetterSetter() {}
	
	/**
	 * Advice reusing pointcut forDaoPackage()
	 */
	@Before("forDaoPackage()")
	public void beforeAnyMethodInGivenPackageWithAnyReturnTypeWithAnyNumberOfArgs() {
		System.out.println("===> Executing @Before advice on any method in \"com.aop.dao\" package with any return type with any number of args<===");		
	}
	
	//Reusing combined pointcut
	/**
	 * Advice reusing combined pointcut forDaoPackageNoGetterSetter()
	 */
	@Before("forDaoPackageNoGetterSetter()")
	public void logStartTime() {
		System.out.println("===> Date-Time: "+new java.util.Date()+" <===");
	}
}
