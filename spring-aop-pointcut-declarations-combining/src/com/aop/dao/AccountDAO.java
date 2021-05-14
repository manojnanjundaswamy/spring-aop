package com.aop.dao;

import org.springframework.stereotype.Component;

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
	
	public void addAccount() {
		System.out.println(getClass() + ": Adding a saving account\n");
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
