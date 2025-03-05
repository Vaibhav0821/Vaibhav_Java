package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddrop 
{

	public static void main(String[] args) 
	{
		ChromeDriver d = new ChromeDriver();
	    d.get("https://grotechminds.com/drag-and-drop/");
	    WebElement drag =d.findElement(By.id("container-6"));
	    WebElement drop = d.findElement(By.id("div2"));
	    Actions s = new Actions(d);
	    s.dragAndDrop(drag, drop).perform();
	}

}
