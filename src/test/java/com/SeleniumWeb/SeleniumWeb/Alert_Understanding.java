package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Understanding {

		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.cssSelector("input.signinbtn")).click();
			
			Alert alert= driver.switchTo().alert();
			System.out.println("The text insind the alert :- "+alert.getText());
			Thread.sleep(3000);
			//alert.accept()
			//alert.dismiss()
	}

}
