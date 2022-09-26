package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(3000);
		System.out.println("pagetitle[1]:"+driver.getTitle());
		//Click on Sign up button
		driver.findElement(By.partialLinkText("Log")).click();
		System.out.println("pagetitle[2]:"+driver.getTitle());
		Thread.sleep(3000);
		//Click on Back button
		driver.navigate().back();
		System.out.println("pagetitle[3]:"+driver.getTitle());
		//click on forward button
		driver.navigate().forward();
		System.out.println("pagetitle[4]:"+driver.getTitle());
		//CLick on refresh button
		driver.navigate().refresh();
		driver.quit();

	}

}
