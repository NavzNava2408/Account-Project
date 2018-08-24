package com.qa.bae.account_app;

import org.junit.Assert;
import org.junit.Test;

import entity.account_class;
import entity.service_class;
import junit.framework.TestCase;

public class service_classTest {
	
	@Test
	public void countnamenumber() {

		service_class list = new service_class();
		account_class jordan = new account_class("Jordan", "Venters", 1);
		account_class ash = new account_class("Ash", "Kerung", 2);
		account_class jack = new account_class("Jack", "Bailey", 3);
		account_class matt = new account_class("Matt", "Metcalfe", 4);
		list.addtolist(jordan);
		list.addtolist(ash);
		list.addtolist(jack);
		list.addtolist(matt);
		
		Assert.assertEquals(1,list.namecount("Jordan"));
	}

}
