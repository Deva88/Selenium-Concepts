package com.SeleniumWeb.SeleniumWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//self - Selects the current node
		String textSelf=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/self::a")).getText();
		System.out.println("Self Element :- " +textSelf);
		
		//parent - Select the parents of the current node (always one)
		String textParent=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/parent::td")).getText();
		System.out.println("Parent Elements :- " +textParent);
		
		//childs - Select all children of the current node (one or many)
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/child::td"));
		System.out.println("Number of Childs Elements:- "+childs.size());
		
		//Ancestor -Select all Ancestor (parents , grandparents etc)
		String textAncestor=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr")).getText();
		System.out.println("Ancestor Elements :- " +textAncestor);
		
		//Descendant - Selects all descendants (children, grandchildren. etc) of the current nodes
		List<WebElement> textDescendant=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/descendant::*"));
		System.out.println("Number of Descendant Nodes :- "+textDescendant.size());
		
		//Following - Selects everything in the documents after the closing tag of the current node 
		List<WebElement> textFollowing=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following::tr"));
		System.out.println("Number of Following Nodes :- "+textFollowing.size());
		
		//Following-sibling - Selects all sibling after the current node 
		List<WebElement> textFollowingSibling=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of Following-sibling Nodes :- "+textFollowingSibling.size());
				
		//Preceding - Select all nodes that appear before the current node in the document
		List<WebElement> textPreceding=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding Nodes :- "+textPreceding.size());
		
		
		//Preceding-sibling - Select all Sibling before the current node
		List<WebElement> textPrecedingSibling=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding-sibling Nodes :- "+textPrecedingSibling.size());
				
		
		
		
		driver.close();
		
	}

}
