package aug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPrimusLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver()
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin"); //css selector
		driver.findElement(By.id("txtPword")).sendKeys("Admin"); 
		driver.findElement(By.name("login")).click();
		driver.quit();
		

	}

}
