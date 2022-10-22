package Classes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties obj= new Properties();
FileInputStream fis= new FileInputStream("C:\\Users\\Nigam\\Desktop\\WorkSpace\\Interview Question\\test.properties") ;
obj.load(fis);
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//System.out.println(obj.getProperty("name"));
//Actions act= new Actions(driver);
//act.moveToElement(driver.findElement(By.id(obj.getProperty("name")))).perform();
List<String> li=new ArrayList();
li.add("anjali");
li.add("Pandey");
Iterator it= li.iterator();
while(it.hasNext()) {
	System.out.println("items are:"+it.next());
	
	
}


driver.get("http://facebook.com");
driver.findElement(By.xpath("//input[@name='email']//following::input[1]")).sendKeys("abc");


	}

}
