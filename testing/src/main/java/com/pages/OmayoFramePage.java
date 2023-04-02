package com.pages;

import java.util.Properties;

import com.framework.Browser;
import com.framework.PropertiesLoader;

public class OmayoFramePage extends Browser {

	Properties p = PropertiesLoader.getInstance()
			.getProperties(System.getProperty("user.dir") + "\\src\\main\\resources\\locators.properties");
	String web_frame1 = p.getProperty("web_frame1");
	String txt_retryMessage = p.getProperty("txt_retryMessage");

	public void readDataFromFrame() {
		switchToFrameByIndex(0);
		comeOutOfTheFrame();
		switchToFrameByWebElement(web_frame1);
		System.out.println(getTextOfWebElement(txt_retryMessage));
	}
}
