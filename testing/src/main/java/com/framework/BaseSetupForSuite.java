package com.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSetupForSuite {	
	
	@BeforeMethod
	public void testcaseSetup() {
		Browser.invokeBrowser();
		System.out.println("Browser invoke successfully");
	}
	
	@AfterMethod
	public void tearDown() {
		Browser.closeBrowser();
		System.out.println("Browser close successfully");
	}

}
