package com.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aop.entity.Account;

@Component
public class AccountDAO {
	
	private String name;
	
	private String serviceCode;
	
	public List<Account> findAccounts(){
		List<Account> myAccounts = new ArrayList<Account>();
		
		Account temp1 = new Account("BHG003327746483", "saving");
		Account temp2 = new Account("RJH995883799409", "current");
		Account temp3 = new Account("PJB775884000334", "Demat");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	
	public void addAccount() {
		System.out.println(getClass() + ": Adding a saving account\n");
	}
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": Adding the given account with VIP flag\n");
	}

	public String getName() {
		System.out.println("In getName()\n");
		return name;
	}

	public void setName(String name) {
		System.out.println("In setName()\n");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("In getServiceCode()\n");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("In setServiceCode()\n");
		this.serviceCode = serviceCode;
	}
	
	

}
