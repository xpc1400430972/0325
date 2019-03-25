package com.testcase;

import org.testng.annotations.Test;

import com.business.loginbusiness;
import com.util.loginutil;
@Test
public class logintestcase extends loginutil{

	loginbusiness l=new loginbusiness();
	
public void login()  throws  InterruptedException  {
	l.geturl();
	l.loginb();
}
}
