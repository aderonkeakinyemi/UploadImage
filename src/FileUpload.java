import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("[id='dropzoneInput-label']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\AKINYEMI\\Desktop\\upload\\fileUpload2.exe");
		
		

	}

}
