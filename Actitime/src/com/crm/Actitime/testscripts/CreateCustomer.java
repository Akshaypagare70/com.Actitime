package com.crm.Actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Actitime.GenericLibrary.Baselass;
import com.crm.Actitime.GenericLibrary.ListenerImplementation;
import com.crm.Actitime.objectRepository.Homepage;
import com.crm.Actitime.objectRepository.Taskpage;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends Baselass {
@Test
public void createCustomer() {
Homepage hp=new Homepage(driver);
hp.getTasklink().click();

Taskpage tp=new Taskpage(driver);
tp.createcustomer();


	
}

}
