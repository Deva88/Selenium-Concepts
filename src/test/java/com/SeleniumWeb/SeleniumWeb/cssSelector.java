package com.SeleniumWeb.SeleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("a.signin")).click();
		//driver.findElement(By.cssSelector(".signin]")).click(); - do not recomend this cssSelector
		
		//id and cssSelector Locators
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("mr.devendrakumar1995");
		//driver.findElement(By.cssSelector("input#login1")).sendKeys("mr.devendrakumar1995");
		//driver.findElement(By.id("#login1")).sendKeys("mr.devendrakumar1995");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Deva@882426");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.rd_logout")).click();
	}
}
