package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
	
		//driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		driver.findElement(By.xpath("//div[@id='user-signup-actions']/descendant::span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Devendra kumar\\Desktop\\Resume\\Resume.pdf");
		driver.findElement(By.id("pop_upload")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
}


