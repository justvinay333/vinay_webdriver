package aug27;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		//Store all windows in to array list class
		ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allwindows);
		//Switch to specific window to gettitle 
		driver.switchTo().window(allwindows.get(2));
		String  expected = "Cookie Policy";
		String actual = driver.getTitle();
		if(expected.equalsIgnoreCase(actual)){
			System.out.println("Title is matching  "+expected+"    "+actual);
		}
		else {
			System.out.println("Title is not matching  "+expected+"    "+actual);
		}driver.close();
		
		Thread.sleep(3000);
		//Switch to another winndow
		driver.switchTo().window(allwindows.get(1));
		Thread.sleep(3000);
		driver.close();
	}
	}


