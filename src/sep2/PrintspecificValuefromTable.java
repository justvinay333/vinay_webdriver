package sep2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintspecificValuefromTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]/td[2]")).getText();
		//System.out.println(text);
		String text1 = driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]/td[3]")).getText();
		//System.out.println(text1);
		System.out.println(text+"     " + text1);
	

}}
