package aug30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesCollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//create object to Action class
		Actions ac = new Actions(driver);
		//get collection of frames
		List<WebElement>allframes = driver.findElements(By.tagName("iframe"));
		System.out.println(allframes.size());
		//Switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		//Come out from frames
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
