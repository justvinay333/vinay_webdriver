package aug16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		//Creating instance object
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		/*driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.get("https://instagram.com");*/      // launch URL
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("vinay241099@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("P0werst@rvinay");
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		//driver.findElement(By.xpath("//div[@class='_1gaz _c24 _50f6']")).click();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("just_vinay333");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='XrOey'][6]")).click();
		driver.findElement(By.xpath("(//div[@class='_7UhW9   xLCgt      MMzan   KV-D4               fDxYl     '])[9]")).click();
		//Thread.sleep(3000);
		
		
		

	}

	
		
	

	
}
