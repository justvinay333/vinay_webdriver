package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(150000);
		driver.findElement(By.partialLinkText("Create New Accou")).click();
		Thread.sleep(150000);
		//store listboxes in select class
		Select bday = new Select(driver.findElement(By.name("birthday_day")));
		Thread.sleep(300);
		Select bmonth = new Select(driver.findElement(By.name("birthday_month")));
		Thread.sleep(300);
		Select byear = new Select(driver.findElement(By.name("birthday_year")));
		Thread.sleep(300);
		//verify list box Single or Multiple selection
		boolean VD = bmonth.isMultiple();
		System.out.println(VD);
		bday.selectByVisibleText("24");
		bmonth.selectByVisibleText("Oct");
		Thread.sleep(3000);
		byear.selectByIndex(24);
		
		driver.quit();
	}
		

	}


