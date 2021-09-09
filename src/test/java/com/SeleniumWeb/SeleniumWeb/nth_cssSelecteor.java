package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nth_cssSelecteor {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			
			//signin link
			driver.findElement(By.cssSelector("p#signin_info>a:nth-child(1)")).click();
			//driver.findElement(By.cssSelector("p#signin_info>:nth-child(1)")).click();
			//driver.findElement(By.cssSelector("p#signin_info>a:nth-of-type(1)")).click();
			
			//username textbox
			driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>input:nth-child(1)")).sendKeys("mr.devendrakumar1995");
			//driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(1)>div:nth-of-type(2)>input:nth-of-type(1)")).sendKeys("mr.devendrakumar1995");
		
			//password textbox
			driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-of-type(2)>input:nth-of-type(1)")).sendKeys("Deva@882426");
			
			//sign btn
			driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-of-type(2)>input:nth-of-type(2)")).click();
		
			//logout btn
			driver.findElement(By.cssSelector("div.setting_rd>a:nth-child(5)")).click();
		
		}

}
