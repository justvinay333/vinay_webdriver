package aug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class VisbleandInternalText {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		String visibletext = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visibletext);
		String gmailurl = driver.findElement(By.partialLinkText("ai")).getAttribute("href");
		System.out.println(gmailurl);
		driver.quit();

	}

}
