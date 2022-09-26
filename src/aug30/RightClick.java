package aug30;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
		//create object to Action class
		Actions ac = new Actions(driver);
		//Right click on gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(3000);
		//Create Object for Robot class
		Robot r = new Robot();
		//Press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		//Click Enter
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//Switch to Child window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(3000);
		//Click on create account
		ac.moveToElement(driver.findElement(By.linkText("Create an account"))).click().perform();
		driver.close();
		//Switch to parent window
		driver.switchTo().window(brw.get(0));
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

	
}
