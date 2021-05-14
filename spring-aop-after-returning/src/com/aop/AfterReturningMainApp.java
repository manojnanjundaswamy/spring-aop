package com.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;
import com.aop.entity.Account;

public class AfterReturningMainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		System.out.println("\nIn main: After returning");
		
		System.out.println(theAccounts);
		
		context.close();
	}

}
