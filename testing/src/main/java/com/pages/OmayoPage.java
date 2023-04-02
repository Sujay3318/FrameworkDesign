package com.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.Browser;

public class OmayoPage extends Browser {

	Properties p = null;
	String table_dataforAge25 = null;
	String link_Selenium143 = null;

	public OmayoPage() {
		try {
			FileReader fr = new FileReader(
					System.getProperty("user.dir") + "\\src\\main\\resources\\locators.properties");
			p = new Properties();
			p.load(fr);
			table_dataforAge25 = p.getProperty("table_dataforAge25");
			link_Selenium143 = p.getProperty("link_Selenium143");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readTabledata() {
		List<WebElement> lst = findelementsFramework(table_dataforAge25);
		for (WebElement webElement : lst) {
			System.out.println(webElement.getText());
		}
	}

	public void checkSelenium143Link() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(link_Selenium143.split("~")[1])));
		WebElement e = findelementFramework(link_Selenium143);
		System.out.println(e.isDisplayed());
	}

}
