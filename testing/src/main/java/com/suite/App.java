package com.suite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 800));
		driver.navigate().to("https://phptravels.com/demo");
		driver.navigate().to("https://phptravels.com/pricing");
		driver.navigate().to("https://phptravels.com/features");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();



	}




}
