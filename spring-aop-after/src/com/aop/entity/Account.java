package com.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private String accountNo;
	
	private String type;
	
	public Account() {
		
	}
	
	public Account(String accountNo, String type) {
		this.accountNo = accountNo;
		this.type = type;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", type=" + type + "]";
	}

}
