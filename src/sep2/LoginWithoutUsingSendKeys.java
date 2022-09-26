package sep2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutUsingSendKeys {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor VD = (JavascriptExecutor)driver;
		VD.executeScript("window.location='https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'");
		Thread.sleep(3000);
		VD.executeScript("document.querySelector(\"input[placeholder='Username']\").value='Admin'");
		Thread.sleep(3000);
		VD.executeScript("document.querySelector(\"input[placeholder='Password']\").value='admin123'");
		Thread.sleep(3000);
		VD.executeScript("document.querySelector(\"button[type='submit']\").click()");
	}

}
