package aug22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://instagram.com");
		Thread.sleep(3000);
		//Get collections of links in a webpage which are stored into html tag 'a'
		List<WebElement>allinks = driver.findElements(By.tagName("a"));
		System.out.println("No.of Links are   "+allinks.size());
		for (WebElement VD : allinks) {
			//print each link text
			String Linktext = VD.getText();
			System.out.println(Linktext);
		}
		driver.close();
		

	}

}
