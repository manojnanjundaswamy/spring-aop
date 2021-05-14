package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;
import com.aop.dao.UserDAO;
import com.aop.entity.Account;

/**
 * Main class to test the aop advices
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		UserDAO theUserDAO = context.getBean(UserDAO.class);
		
		Account theAccount = new Account();
		theAccount.setAccountNo("1174496557995");
		theAccount.setType("saving");
		
		theAccountDAO.addAccount();		
		
		theAccountDAO.addAccount(theAccount);
		
		theAccountDAO.addAccount(theAccount, true);
		
		theAccountDAO.deleteAccount(theAccount);
		
		theUserDAO.addAccount();
		
		theUserDAO.addDefaultAccount();
		
		theUserDAO.addAccountDetails();
		
		theUserDAO.sendMsg("Hello, good morning!");
		
		context.close();
	}

}
