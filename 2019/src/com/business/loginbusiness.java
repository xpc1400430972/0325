package com.business;

import com.page.loginpage;

public class loginbusiness extends loginpage{
	
	public void geturl() {
		driver.get(url);
	}
	
	
	public void loginb() throws InterruptedException {
	
	loginpage page=new loginpage();
		
	page.setusername();
	page.setuserpass();
	page.setselect();
	Thread.sleep(8000);
	page.setlogin();
	
	}
	
}
