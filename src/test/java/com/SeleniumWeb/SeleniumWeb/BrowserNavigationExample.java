package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationExample { 
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		//1. Launch the browser 
		WebDriver driver=new ChromeDriver();
		//Enter the url 
		driver.get("https://www.facebook.com/"); 
		Thread.sleep(3000); 
		driver.navigate().to("http://www.gmail.com"); 
		Thread.sleep(3000); 
		driver.navigate().back(); 
		Thread.sleep(3000); 
		driver.navigate().forward(); 
		Thread.sleep(3000); 
		driver.navigate().refresh(); 
		driver.close(); 
	} 
}
