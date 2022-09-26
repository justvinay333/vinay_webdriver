package aug28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionOfRadioButtons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569897%7Ce%7Cfb%20login%7C&placement=&creative=589460569897&keyword=fb%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-320262102914%26loc_physical_ms%3D9062147%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIuIWModbw-AIVETErCh2tFwSjEAAYASAAEgLl0fD_BwE");
		Thread.sleep(3000); 
		//driver.findElement(By.partialLinkText("Create Ne")).click();
		//Thread.sleep(3000);
		//get collection of radio buttons
		List<WebElement>radios = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println("No.of radio buttons    "+radios.size());
		Thread.sleep(3000); 
		for (WebElement each : radios) {
			System.out.println(each.getText());	
		}
		Thread.sleep(3000);
		driver.close();
		
	}  
	

}
