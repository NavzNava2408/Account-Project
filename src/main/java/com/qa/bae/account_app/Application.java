package com.qa.bae.account_app;

import entity.account_class;
import entity.service_class;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		service_class list = new service_class();
		account_class jordan = new account_class("Jordan", "Venters", 1);
		list.addtolist(jordan);
		
	    String name = (String) list.retrieving(1);
	    System.out.println(name);
		
		System.out.println(list);
	}

}
