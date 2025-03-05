package Selenium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ArowDown 
{

	public static void main(String[] args)
    {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		
		WebElement e1 = d.findElement(By.id("searchDropdownBox"));
		e1.click();
		
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);
		
	//	d.quit();

	}

}
