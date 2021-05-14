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
	/**
	 * Pointcut for methods package com.aop.dao excluding get* and set*
	 */
	@Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
	public void forDaoPackageNoGetterSetter() {}

}
