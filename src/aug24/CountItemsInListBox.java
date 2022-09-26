package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountItemsInListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Thread.sleep(3000);
		Select bday = new Select(driver.findElement(By.name("birthday_day")));
		Select bmonth = new Select(driver.findElement(By.name("birthday_month")));
		Select byear = new Select(driver.findElement(By.name("birthday_year")));
		
		List<WebElement> allitems = bday.getOptions();
		System.out.println(allitems.size());
		
		for (WebElement VD : allitems)
		{
			System.out.println(VD.getText());
			
	   }
		List<WebElement> allitemss = bmonth.getOptions();
		System.out.println(allitemss.size());
		
		for (WebElement VD1 : allitemss)
		{
			System.out.println(VD1.getText());
		}
		List<WebElement> allitemsss = byear.getOptions();
		System.out.println(allitemsss.size());
		 
		for (WebElement VD2 : allitemsss)
		{
			System.out.println(VD2.getText());
			}
		driver.quit();
		
	}
	    
}
