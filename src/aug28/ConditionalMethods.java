package aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create Ne")).click();
		Thread.sleep(3000);
		// Verify re-enter mail textbox is displayed (or) Hidden
		WebElement textbox = driver.findElement(By.name("reg_email_confirmation__"));
		boolean VD = textbox.isDisplayed();
		System.out.println(VD);
		Thread.sleep(3000);
		 WebElement checkbox = driver.findElement(By.xpath("//input[@value='2']"));
		 boolean VD1 = checkbox.isSelected();
		 System.out.println(VD1);
		 driver.quit();
	}
	  
	   

}
