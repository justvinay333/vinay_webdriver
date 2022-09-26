package aug20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		String visibletext = driver.findElement(By.linkText("Images")).getText();
	    System.out.println(visibletext);
	    String internaltext = driver.findElement(By.partialLinkText("Im")).getAttribute("href");
		System.out.println(internaltext);
		driver.close();

	}

}
