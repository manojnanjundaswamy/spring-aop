package com.aop.dao;

import org.springframework.stereotype.Component;

/**
 * DAO class to mock methods
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Component
public class UserDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ": Adding an user account\n");
	}
	
	public void addDefaultAccount() {
		System.out.println(getClass() + ": Adding an default user account\n");

	}

	public String addAccountDetails() {
		System.out.println(getClass() + ": Adding an user account details\n");
		return "success";
	}
	
	public String sendMsg(String msg) {
		System.out.println(getClass() + ": sending message - "+msg+"\n");
		return "success";
	}
}
