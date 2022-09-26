package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyword {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		//create object for action class
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Sitharamam");
		//press down arrow in keyboard in 3 times
		Thread.sleep(3000);
		for(int i=1; i<=3;i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		/*Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);*/
		ac.sendKeys(Keys.ENTER).perform();
		

	}driver.quit();

}}
