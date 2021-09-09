package com.SeleniumWeb.SeleniumWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");
		
//		//className Locators
//		driver.findElement(By.className("signin")).click();
//		Thread.sleep(1000);
//
//		//id Locators
//		driver.findElement(By.id("login1")).sendKeys("mr.devendrakumar1995");
//
//		//Name Locators
//		driver.findElement(By.name("passwd")).sendKeys("Deva@882426");
//
//		//className Locators
//		driver.findElement(By.className("signinbtn")).click();
//		Thread.sleep(2000);
//
//		//LinkText Locators
//		driver.findElement(By.linkText("Logout")).click();
//		Thread.sleep(1000);
//
//		//partialLinkText Locators
//		driver.findElement(By.partialLinkText("Rediff Hom")).click();
//		Thread.sleep(1000);

		//tagName Locators
		 WebElement riddiffLogo= driver.findElement(By.tagName("span"));
		System.out.println(riddiffLogo);
		 
//		List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
//		System.out.println("The total number of a tag links in this WebPage is: "+AllLinks.size());	
//		
//		//find the name of all the links
//		for(int i=0; i<AllLinks.size(); i++) {
//			System.out.println(AllLinks.get(i).getText());
//		}
	}
}
