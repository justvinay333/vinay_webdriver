package sep3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnDatafromWebPage {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:/Minny.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String data1 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
		String data2 = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
		bw.write(data1);
		bw.write(data2);
		bw.flush();
		bw.close();
		driver.close();
		

	}

}
