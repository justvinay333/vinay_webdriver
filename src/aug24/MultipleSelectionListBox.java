package aug24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/Desktop/devops/5.%20Jenkins/3.html");
		Select dropdown = new Select(driver.findElement(By.name("cars")));
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		//Select the items in listbox
		for (int i=0; i<=3;i++)
		{
			Thread.sleep(300);
			dropdown.selectByIndex(i);
	}
		//deselect the selected items
		dropdown.deselectByVisibleText("Volvo");
		Thread.sleep(3000);
		dropdown.deselectByIndex(2);
		Thread.sleep(3000);
		driver.quit();
	}
	
}
