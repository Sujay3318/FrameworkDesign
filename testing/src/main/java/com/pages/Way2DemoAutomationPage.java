package com.pages;

import java.util.Properties;
import java.util.Set;

import com.framework.Browser;
import com.framework.PropertiesLoader;

public class Way2DemoAutomationPage extends Browser {
	
	Properties p = PropertiesLoader.getInstance()
			.getProperties(System.getProperty("user.dir") + "\\src\\main\\resources\\locators.properties");
	String lnk_FrameAndWindows = p.getProperty("lnk_FrameAndWindows");
	
	public void SwitchToWindows() {
		System.out.println("Opening browser Window handle "+getWindowhandle());
		findelementFramework(lnk_FrameAndWindows).click();
		Set<String> windowHandles = getWindowHandles();
		String sWindowString = null;
		for (String string : windowHandles) {
			
			sWindowString = string;
			System.out.println(sWindowString);
		}
		SwitchToWindow(sWindowString);
		System.out.println(findelementFramework("Xpath~//h3[text()='Dummy Registration Form']").getText());
		
	}
	
	

}
