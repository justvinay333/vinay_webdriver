package sep1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltoCertainElementandPerformClickaction {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor VD = (JavascriptExecutor)driver;
		VD.executeScript("window.location='https://www.hyrtutorials.com/p/add-padding-to-containers.html'");
		Thread.sleep(3000);
		WebElement Signin = driver.findElement(By.linkText("Sign in"));
		//Scroll to Sign in element and perform click action
		VD.executeScript("document.scrollToView", Signin);
		Thread.sleep(3000);
		Signin.click();
		driver.close();
	}

}
