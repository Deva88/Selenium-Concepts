package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		//sendKeys method
		driver.findElement(By.id("email")).sendKeys("Admin");
		Thread.sleep(3000);
		
		//clear method
		driver.findElement(By.id("email")).clear();
		
		//click method
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//getText method
		String str = driver.findElement(By.linkText("Forgotten password?")).getText();
		System.out.println("Link Text is: "+str);
		
		//isDisplayed method 
		boolean dispalayed = driver.findElement(By.name("login")).isDisplayed();//check element is display or not
		System.out.println("isDisplayed : "+dispalayed);
		
		//isEnabled method
		boolean enabled =driver.findElement(By.name("login")).isEnabled(); //check element is enabled or not
		System.out.println("isEnabled : "+enabled);
		
		//isSelected method
		boolean selected =driver.findElement(By.name("login")).isSelected(); //Determine whether or not this element is selected or not
		System.out.println("isSelected : "+selected);
		
		//get Attribute method
		String getAttribute=driver.findElement(By.id("email")).getAttribute("id");
		System.out.println("Get Attribute method :" +getAttribute);
		
		//get size method
		Dimension getSize=driver.findElement(By.id("email")).getSize();
		System.out.println("Get Size method :" +getSize);
		
		//get Location method
		Point getLocation=driver.findElement(By.id("email")).getLocation();
		System.out.println("Get Location method :" +getLocation);
		
		//get Tag Name method
		String getTagname=driver.findElement(By.id("email")).getTagName();
		System.out.println("Get Tagname method :" +getTagname);
		
		//get Rect method
		Rectangle getRect=driver.findElement(By.id("email")).getRect();
		//System.out.println("GetRect method :" +getRect);
		
		System.out.println("X-Axis - " + getRect.x ); //from left top corner of element
       		System.out.println("Y-Axis - " + getRect.y ); 
        	System.out.println("Element Width - " + getRect.width );
        	System.out.println("Element Height - " + getRect.height );

		//get css value method	
		String getCssvalue=driver.findElement(By.id("email")).getCssValue("font-size");
		System.out.println("Get Css value method :" +getCssvalue);
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
