package sep1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrlusingJavaScript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//Creating Object for Javascript
		JavascriptExecutor VD = (JavascriptExecutor)driver;
		VD.executeScript("window.location='https://Google.com'");
		Thread.sleep(3000);
		//print title and lenght 
		String title = VD.executeScript("return document.title").toString();
		System.out.println(title);
		System.out.println(title.length());
		//print URL and Lenght of it 
		String URL = VD.executeScript("return document.URL").toString();
		System.out.println(URL);
		System.out.println(URL.length());
		//Print Domain name and it's length
		String domain = VD.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		driver.close();
		
		

	}

}
