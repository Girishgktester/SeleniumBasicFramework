package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;

public class Login extends TestBase{

	TestUtils testUtil;
	LoginPage loginpage;
		
	@BeforeMethod
	public void setUp() throws InterruptedException {           
		initialization();
		testUtil = new TestUtils();                  
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyContactsPageLabel(){
		loginpage.verifyUserLogin();

		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}