package aug29;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Keyboard2 {
public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		//create object for actions class
		Actions ac = new Actions(driver);
		driver.findElement(By.id("searchDropdownBox")).sendKeys("D");
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);

	}

}

