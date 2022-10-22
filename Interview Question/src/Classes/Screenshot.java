package Classes;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://google.com");

TakesScreenshot Shot=(TakesScreenshot)driver;
File Scr=Shot.getScreenshotAs(OutputType.FILE);
File Dest= new File("C:\\Users\\Nigam\\Downloads\\a.png");
FileUtils.copyFile(Scr, Dest);

	}

}
