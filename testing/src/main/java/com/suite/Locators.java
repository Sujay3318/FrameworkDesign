//package com.suite;
//
//import java.io.FileReader;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import com.framework.Browser;
//
//public class Locators extends Browser {
//
//	public static void main(String[] args) throws Exception {
//		WebDriver driver = invokeBrowser();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
//
//		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\locators.properties");
//		p = new Properties();
//		p.load(fr);
//
//		WebElement txtFirstName = findelementFramework(p.getProperty("txt_firstname"));
//		txtFirstName.sendKeys("rahul");
//		
//		waitforFiveSeconds();
//		WebElement txtLastName = driver.findElement(By.name("lastname"));
//		WebElement rdbtnMale = driver.findElement(By.xpath("//input[@value='Male']"));
//
//		// SetText Operation
//		txtFirstName.sendKeys("Selenium");
//		txtLastName.sendKeys("Demo");
//		waitforFiveSeconds();
//
//		// TagName
//		System.out.println("TagName of LastName - " + txtLastName.getTagName());
//
//		// ClearText Operation
//		txtFirstName.clear();
//
//		// isDisplayed
//		System.out.println("FirstName button is visible - " + txtFirstName.isDisplayed());
//
//		// isEnabled
//		System.out.println("FirstName button is enable - " + txtFirstName.isEnabled());
//
//		// isSelected
//		System.out.println("Sex - Male selected - " + rdbtnMale.isSelected());
//		waitforFiveSeconds();
//
//		// Click Operation
//		rdbtnMale.click();
//		waitforFiveSeconds();
//
//		// isSelected
//		System.out.println("Sex - Male selected - " + rdbtnMale.isSelected());
//		waitforFiveSeconds();
//
//		// GetAttribute
//		System.out.println("Value attribute of Male radio Button is - " + rdbtnMale.getAttribute("value"));
//		System.out.println("Name attribute of Male radio Button is - " + rdbtnMale.getAttribute("name"));
//
//		// Size
//		Dimension dimensions = rdbtnMale.getSize();
//		System.out.println("Height :" + dimensions.height + " Width : " + dimensions.width);
//
//		// Location
//		Point point = rdbtnMale.getLocation();
//		System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
//
//		WebElement photo = driver.findElement(By.name("photo"));
//		photo.sendKeys(System.getProperty("user.dir") + "\\src\\main\\resources\\photo.jpg");
//		waitforFiveSeconds();
//
//		WebElement ele = driver.findElement(By.linkText("Selenium - Overview"));
//		ele.click();
//		waitforFiveSeconds();
//	
//	}
//
//	public static void waitforFiveSeconds() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}
