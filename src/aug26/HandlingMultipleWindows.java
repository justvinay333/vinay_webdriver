package aug26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(3000);
		//Parent Window ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//Click on links to open on new windows
		driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Privacy")).click();
		//get collections of Windows ID
		Set<String>allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		//Iterate all windows
		for (String each : allwindows) {
			//if parent ID not equals to child Id
			if(!parent.equals(each)) {
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(3000);
			
			}
			
		}driver.switchTo().window(parent);
		driver.navigate().back();
		Thread.sleep(3000);
		//enter First name
		driver.findElement(By.name("firstname")).sendKeys("Vinay");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
