package sep2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofRowsandCols {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(3000);
		//Store the tabel into webelement
		WebElement table = driver.findElement(By.id("contactList"));
		//get collection of rows of a table
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("No.of rows" +"  "+rows.size());
		//iterate all row 
		for(int i=1; i<rows.size();i++) {
			//get collections cells 
			List<WebElement>cells = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row no"+ i +"   "+"Column size"+"    "+cells.size());
		}
		driver.close();
	}

}
