package com.SeleniumWeb.SeleniumWeb;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreeShort {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Devendra");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");		

		TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
		File Sourcefile =takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./Screenshot/" +"facbook-SignUp-" +System.currentTimeMillis()+ ".png");
		FileHandler.copy(Sourcefile, destinationFile);
		driver.quit();
	}
}
