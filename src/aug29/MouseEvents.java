package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https:flipkart.com");
		Thread.sleep(3000);
		//create object to Action class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//click on desired category
		ac.moveToElement(driver.findElement(By.xpath("//img[@alt='Mobiles']"))).click().perform();
		Thread.sleep(3000);
		// Select desired items
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).build().perform();
		//Select desired product
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Vivo"))).click().perform();
		driver.quit();

}}
