package com.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.aop.entity.Account;

@Aspect
@Component
@Order(1)
public class MyLoggingAspect {
	
	
	@AfterReturning(
			pointcut = "execution(* com.aop.dao.AccountDAO.findAccounts(..))",
			returning = "result"
			)
	public void afterReturningFindAccountAdvice(JoinPoint theJointPoint, List<Account> result) {
		String method = theJointPoint.getSignature().toShortString();
		System.out.println("===>Executing @AfterReturning on method "+method+"<===");
		System.out.println("===>Result from method: "+result+"<===");
		
		
		// Doing post processing on result
		convertAccountTypeToUppercase(result);
		
		System.out.println("===>Result from Advice after post-processing: "+result+"<===");
	}

	private void convertAccountTypeToUppercase(List<Account> result) {
		for(Account tempAccount : result) {
			tempAccount.setType(tempAccount.getType().toUpperCase());
		}
	}
	
}
