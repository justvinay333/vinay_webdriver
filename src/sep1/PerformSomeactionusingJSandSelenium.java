package sep1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PerformSomeactionusingJSandSelenium {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Akhilesh");
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		driver.findElement(By.name("email")).sendKeys("Akhilesh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Akhilesh3456");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		//click radio button
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(3000);
		//click checkbox button
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(3000);
		//click continue button
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		driver.close();

	}

}

