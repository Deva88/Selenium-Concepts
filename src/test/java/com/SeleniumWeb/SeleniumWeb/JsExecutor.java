package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//open Browser
		js.executeScript("window.location = 'https://mail.rediff.com/cgi-bin/login.cgi'");
		Thread.sleep(2000);
		
		//scroll down page
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);
		//scroll up page
		js.executeScript("window.scrollBy(0,-1200)");
		
		//enter username and password'
		js.executeScript("document.getElementById('login1').value='mr.devendrakumar1995'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('password').value='Deva@882426'");
		Thread.sleep(3000);
		WebElement SignInButton = driver.findElement(By.className("signinbtn"));
		js.executeScript("arguments[0].click();", SignInButton);
	
		Thread.sleep(3000);
		//alert box
		js.executeScript("alert('Welcome to RediffMail Inbox');");
	
		
	
	}
}
