package aug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class StoringWebElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id='txtuId']"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPword']"));
		password.clear();
		password.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.quit();
	}

}
