package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement e1 = driver.findElement(By.linkText("Gmail"));
		
		Actions a = new Actions(driver);
		a.contextClick(e1).perform();
	}

}
