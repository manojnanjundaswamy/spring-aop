package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;
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
		
		Account theAccount = new Account();
		theAccount.setAccountNo("BNG00343888392");
		theAccount.setType("saving");
		
		theAccountDAO.addAccount();
		
		theAccountDAO.addAccount(theAccount, true);

		theAccountDAO.setName("newAcc010");
		
		theAccountDAO.setServiceCode("BNG00232");
		
		String name = theAccountDAO.getName();
		
		String code = theAccountDAO.getServiceCode();
		
		context.close();
	}

}
