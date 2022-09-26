package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		WebElement user = driver.findElement(By.cssSelector("#txtUsername"));
		user.clear();
		user.sendKeys("Admin");		
		String username = user.getAttribute("value");
		WebElement pass = driver.findElement(By.cssSelector("#txtPassword"));
		pass.clear();
		pass.sendKeys("Qedge12!@#");
		String password = pass.getAttribute("value");
		System.out.println(username+"   "+password);
		driver.findElement(By.cssSelector("#btnLogin")).submit();
		String expected= "dashboard";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Login successfully   "+expected+":"+"     "+ actual+":");
		}
		else {
			//capture error message
			String errormessage = driver.findElement(By.cssSelector("#spanMessage")).getText();
			System.out.println(errormessage +"  "+expected+"        "+actual);
		}
	   
	   driver.close();
	}	
}