package com.qa.bae.account_app;

import entity.account_class;
import entity.service_class;

public class Application {
	private Application() {}
	public static void main(String[] args) {
		System.out.println("Hello world");
		service_class list = new service_class();
		account_class jordan = new account_class("Jordan", "Venters", 1);
		account_class ash = new account_class("Ash", "Kerung", 2);
		account_class jack = new account_class("Jack", "Bailey", 3);
		account_class matt = new account_class("Matt", "Metcalfe", 4);
		matt.getsurname();
		ash.getfirstname();
		jordan.accountnumber();
		
		list.addtolist(jordan);
		list.addtolist(ash);
		list.addtolist(jack);
		list.addtolist(matt);
		
	    String name = (String) list.retrieving(2);
	    System.out.println(name);
		System.out.println(list.json());
		
	}

}
