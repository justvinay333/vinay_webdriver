package aug31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/droppable/");
		// Store the Mouse and Keyboard methods into Action class
		Actions ac = new Actions(driver);
		//get allframes
		List<WebElement>allframes = driver.findElements(By.tagName("iframe"));
		System.out.println(allframes.size());
		//Switch to frames
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(source, target).perform();
		driver.quit();
		
		

	}

}
