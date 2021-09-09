package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static WebDriver driver;
	public static Select select;
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	System.out.println(" Title : "+driver.getTitle());
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
	Thread.sleep(2000);
	
	//select class Dropdown
	select=new Select(driver.findElement(By.id("day")));
	//What are the 3 method in select class handal dropdown- selectByIndex, SelectByValue, SelectByByVisibleText
	select.selectByVisibleText("20");
	
	select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Nov");
	
	select = new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1990");
	
	}
	
}