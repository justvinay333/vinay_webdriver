package aug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://instagram.com");
		String expected="instagram";
		String actual= driver.getTitle();  //Title type is String
		if (expected.equalsIgnoreCase(actual)) {     //
			System.out.println("Title is same " + expected+"   "+actual);
		}
		else {
			System.out.println("Title is not same  " +expected+"    "+actual);
		}
		driver.quit();
		

	}

}
