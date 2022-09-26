package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GaanaMusic {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://gaana.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='input_box']")).sendKeys("Sitha Ramam");
		
		Thread.sleep(6000);
		driver.findElement(By.linkText("Oh Sita Hey Rama")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn_solid playing']")).click();
		Thread.sleep(10000);
		/*driver.findElement(By.tagName("//img[@title='Sita Ramam (Telugu) (Original Motion Picture Soundtrack)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.tagName("(//img[@title='Oh Sita Hey Rama'])[1]")).click();*/

	}

}
