package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;

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
		
		theAccountDAO.addAccount();

		theAccountDAO.setName("newAcc010");
		
		theAccountDAO.setServiceCode("BNG00232");
		
		String name = theAccountDAO.getName();
		
		String code = theAccountDAO.getServiceCode();
		
		context.close();
	}

}
