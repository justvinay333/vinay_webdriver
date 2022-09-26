package sep3;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://Insta.com");
		Thread.sleep(3000);
		//Java Date stamp
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("MM/DD/YYYY");
		String dateformat = df.format(date);
		//Take screeshot and Store
		File Screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy screenshot into local system
		FileUtils.copyFile(Screen, new File("D://Minny.txt"+"  "+ dateformat+"  "+"Instalogin.png"));
		driver.close();

	}

}
