package Selenium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HowerOver 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("nav-link-amazonprime"));
		
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();

	}

}
