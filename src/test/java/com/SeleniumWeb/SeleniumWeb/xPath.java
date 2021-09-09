package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("mr.devendrakumar1995");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Deva@882426");

		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		driver.close();
		}
}