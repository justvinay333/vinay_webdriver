package aug21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement radio1=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]"));
		radio1.click();
		driver.close();
	

	}


	

}
