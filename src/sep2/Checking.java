package sep2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checking {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin2'");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('txtPassword').value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(5000);
		String expected ="dashboard";
		String actual =js.executeScript("return document.URL").toString();
		if(actual.contains(expected))
		{
			System.out.println("Login Success::"+expected+"     "+actual);
		}
		else
		{
String errormessage =js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
			System.out.println(errormessage+"   "+expected+"     "+actual);
		}
		Thread.sleep(5000);
		driver.close();
	}
    }







