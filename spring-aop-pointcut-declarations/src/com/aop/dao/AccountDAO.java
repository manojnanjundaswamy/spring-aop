package com.aop.dao;

import org.springframework.stereotype.Component;

import com.aop.entity.Account;

/**
 * DAO class to mock methods
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ": Adding a saving account\n");
	}
	
	public void addAccount(Account account) {
		System.out.println(getClass() + ": Adding the given account\n");
	}
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": Adding the given account with vip flag\n");
	}
	
	public boolean deleteAccount(Account acc) {
		System.out.println(getClass() + ": Deleting the given account\n");
		return true;
	}

}
