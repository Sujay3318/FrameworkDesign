package com.framework;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver driver = null;
	public static Properties p = PropertiesLoader.getInstance()
			.getProperties(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");

	public static WebDriver invokeBrowser() {
		String sBrowser = p.getProperty("browser");
		if (sBrowser.toLowerCase().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (sBrowser.toLowerCase().equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (sBrowser.toLowerCase().equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public void applicationURL() {

	}

	public WebElement findelementFramework(String sLocator) {
		WebElement element = null;
		String sLocatorPath = sLocator.split("~")[1];
		switch (sLocator.toLowerCase().split("~")[0]) {
		case "name":
			element = driver.findElement(By.name(sLocatorPath));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(sLocatorPath));
			break;
		default:
			break;
		}
		return element;

	}

	// Implicit wait Explicit Wait
//	10						10    ---------> 10 Seconds
//	10                      30  ------------>  30 Seconds
//	60                      10  ------------> 60 Seconds
	public List<WebElement> findelementsFramework(String sLocator) {
		List<WebElement> lst = null;
		String sLocatorPath = sLocator.split("~")[1];
		switch (sLocator.toLowerCase().split("~")[0]) {
		case "name":
			lst = driver.findElements(By.name(sLocatorPath));
			break;
		case "xpath":
			lst = driver.findElements(By.xpath(sLocatorPath));
			break;
		default:
			break;
		}
		return lst;

	}

	public void switchToFrameByWebElement(String sLocator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String sLocatorPath = sLocator.split("~")[1];
		String sLocatorType = sLocator.split("~")[0];
		switch (sLocatorType.toLowerCase()) {
		case "name":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(sLocatorPath)));
			break;
		case "xpath":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocatorPath)));
			break;
		default:
			break;
		}
		driver.switchTo().frame(findelementFramework(sLocator));
	}

	public void switchToFrameByIndex(int iFrame) {
		driver.switchTo().frame(iFrame);
	}

	public void comeOutOfTheFrame() {
		driver.switchTo().defaultContent();
	}

	public String getTextOfWebElement(String sLocator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String sLocatorPath = sLocator.split("~")[1];
		String sLocatorType = sLocator.split("~")[0];
		switch (sLocatorType.toLowerCase()) {
		case "name":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(sLocatorPath)));
			break;
		case "xpath":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocatorPath)));
			break;
		default:
			break;
		}
		return findelementFramework(sLocator).getText();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public String getWindowhandle() {
		return driver.getWindowHandle();
	}
	
	public Set<String> getWindowHandles(){
		return driver.getWindowHandles();
	}
	
	public void SwitchToWindow(String sWindowHandle) {
		driver.switchTo().window(sWindowHandle);
	}

}
