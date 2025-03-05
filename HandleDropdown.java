package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown 
{

	public static void main(String[] args) 
	{
		ChromeDriver d = new ChromeDriver();
		d.get("https://amazon.in");
		
		//To handle drop down user select
		Select s1 = new Select(d.findElement(By.id("searchDropdownBox")));
		
		//s1.selectByVisibleText("Appliances");  //Select by visible text
		
		//s1.selectByIndex(4);    //Select by index
		
		s1.selectByValue("search-alias=baby");   //Select by value

	}

}
