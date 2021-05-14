package com.aop.dao;

import java.util.ArrayList;
import java.util.List;

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
	
	private String name;
	
	private String serviceCode;
	
	/**
	 * Find all accounts
	 * @param throwExp throughexception flag
	 * @return List of Account obj
	 */
	public List<Account> findAccounts(boolean throwExp){
		
		if(throwExp) {
			throw new RuntimeException("Exception enabled: throwing exception!");
		}
		
		List<Account> myAccounts = new ArrayList<Account>();
		
		Account temp1 = new Account("BHG003327746483", "saving");
		Account temp2 = new Account("RJH995883799409", "current");
		Account temp3 = new Account("PJB775884000334", "Demat");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}

}
