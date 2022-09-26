package aug28th;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadiobuttonsCollection {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		//get collection of radio buttons
		List<WebElement> radios =driver.findElements(By.xpath("//p[@class='fs-3 fw-600 c-neutral-900']"));
		System.out.println("No of radio buttons are::"+radios.size());
		Thread.sleep(3000);
		for (WebElement each : radios) {
			System.out.println(each.getText());
		}
		Thread.sleep(3000);
		driver.close();
		}
        }
