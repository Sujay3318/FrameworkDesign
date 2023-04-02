package com.suite;

import org.testng.annotations.Test;

import com.framework.BaseSetupForSuite;
import com.framework.Browser;
import com.pages.OmayoFramePage;
import com.pages.OmayoPage;
import com.pages.Way2DemoAutomationPage;

public class OmayoReadTableSuite extends BaseSetupForSuite{

	OmayoPage objOmayoPage = new OmayoPage();
	Browser objbBrowser = new Browser();
	OmayoFramePage objOmayoFramePage = new OmayoFramePage();
	Way2DemoAutomationPage objWay2DemoAutomationPage = new Way2DemoAutomationPage();

	@Test
	public void test_ReadDataFromFrame() {		
//		objOmayoFramePage.readDataFromFrame();
		objWay2DemoAutomationPage.SwitchToWindows();
	}

	public static void waitforFiveSeconds() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
