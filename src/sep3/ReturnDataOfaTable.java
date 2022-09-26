package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnDataOfaTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/sql/sql_ref_mysql.asp");
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.name("ws-table-all notranslate"));
		//get collection of rows
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("No.of rows :" +rows.size());
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get collection of cells from each row
			List<WebElement>cols = eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for (WebElement eachcell : cols) {
				String cellsdata = eachcell.getText();
				System.out.println(cellsdata);
				
			}
			
		}
		

	}

}
