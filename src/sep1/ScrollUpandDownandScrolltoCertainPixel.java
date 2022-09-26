package sep1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDownandScrolltoCertainPixel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor VD = (JavascriptExecutor)driver;
		VD.executeScript("window.location='https://Amazon.com'");
		Thread.sleep(3000);
		//Scroll top to bottom vertically
		VD.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//Scroll bottom to top vertically
		VD.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);
		//Scroll to certain pixels
		VD.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		driver.close();

	}

}
