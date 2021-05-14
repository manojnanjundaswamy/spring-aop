package com.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;
import com.aop.entity.Account;

public class AfterThrowingMainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccounts = null;
		
		try {
			boolean throwExp = true;
			theAccounts = theAccountDAO.findAccounts(throwExp);
		}catch (Exception exp) {
			System.out.println("\nIn main: catching thrown exp: "+exp);
		}
		
		System.out.println("\nIn main: After throwing");
		
		System.out.println(theAccounts);
		
		context.close();
	}

}
