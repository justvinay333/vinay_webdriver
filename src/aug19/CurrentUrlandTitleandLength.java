package aug19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentUrlandTitleandLength {

	public static void main(String[] args) throws Throwable {
	   WebDriver driver = new ChromeDriver();
	   //driver = new FirefoxDriver()
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	   driver.get("https://facebook.com");
	   Thread.sleep(3000);
	   //Returns current title of web page
	   String pagetitle = driver.getTitle();
	   System.out.println(pagetitle);
	   System.out.println(pagetitle.length()); // return length of the title
	   String currenturl = driver.getCurrentUrl(); //returns current url of web page
	   System.out.println(currenturl);
	   System.out.println(currenturl.length()); // returns current url length
	   driver.quit();
	   
	   
	   
	  

	}

}
