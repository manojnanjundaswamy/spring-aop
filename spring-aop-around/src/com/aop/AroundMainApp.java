package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.service.FortuneService;

/**
 * Main class to test the aop advices
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
public class AroundMainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		FortuneService theFortuneService = context.getBean("fortuneService", FortuneService.class);
		
		boolean badLuck = false; // to simulate exception
		String fortune = theFortuneService.getTodaysFortune(badLuck);
		
		System.out.println("\n Main App - Today's fortune is: "+fortune);
		
		context.close();
	}
}
