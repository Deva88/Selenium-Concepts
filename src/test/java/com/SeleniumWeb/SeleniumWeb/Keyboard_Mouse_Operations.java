package com.SeleniumWeb.SeleniumWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_Mouse_Operations { 
	public static void main(String[] args) throws InterruptedException, AWTException { 
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		//1. Launch the browser 
		WebDriver driver=new ChromeDriver();
		//2. enter the url - 
		driver.navigate().to("https://www.facebook.com/"); 
		Thread.sleep(5000); 
		Robot robot = new Robot();
		robot.mouseMove(500, 600); 
		robot.keyPress(KeyEvent.VK_ALT); 
		robot.keyPress(KeyEvent.VK_F); 
		robot.keyRelease(KeyEvent.VK_F);  
		robot.keyRelease(KeyEvent.VK_ALT); 
		Thread.sleep(3000);  
		robot.keyPress(KeyEvent.VK_W); 
		robot.keyRelease(KeyEvent.VK_W); 
		Thread.sleep(3000); 
		driver.quit(); 
	}
}