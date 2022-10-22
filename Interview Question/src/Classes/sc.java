package Classes;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sc {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\Nigam\\Desktop\\Anjali\\1.jpg");
		FileUtils.copyFile(scrFile, destFile);	
	}
	
}
