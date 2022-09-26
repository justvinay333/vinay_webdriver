package aug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlisSecuredorNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://instagram.com");
		String expected = "https://";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Url is secured "+ expected+"   "+actual);
		}
		else {
			System.out.println("Url is not secured "+ expected+"   "+actual);
		}
		driver.close();

	}

}
