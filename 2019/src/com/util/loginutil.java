package com.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginutil {
	//全局变量
		public static String url;
		public static WebDriver driver;    //static 静态 public动态（全局、公有的）
	//相当于预置条件
		@BeforeClass
		public void Class1() throws Exception {
	//定义浏览器
			//System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
			//driver=new ChromeDriver();
			
			DesiredCapabilities a=DesiredCapabilities.chrome();
			driver=new RemoteWebDriver(new URL("http://192.168.1.178:7977/wd/hub"),a);
			//driver=new ChromeDriver();
	//被测url
			url="http://localhost:8080/examsys/login.thtml";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		
		
		@AfterClass
		public void thr() {
			//driver.close();
		
	}

}
