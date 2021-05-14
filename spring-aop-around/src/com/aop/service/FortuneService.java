package com.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

/**
 * Service class to mock methods
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Component
public class FortuneService {
	
	public String getTodaysFortune() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "You will have a wonderful day";
	}
	
	
	public String getTodaysFortune(boolean badLuck) {
		
		if(badLuck) {
			throw new RuntimeException("Bad luck, be very careful!!");
		}
		
		return getTodaysFortune();
	}	
	
	

}
