package Classes;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tablePractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		List <WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
		
		List <WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
		List <WebElement> alldataWithHeader = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		System.out.println("headers:  "+headers.size());
		System.out.println("alldata:  "+alldata.size());
		System.out.println("alldataWithHeader"+alldataWithHeader.size());
		List <WebElement> NoOfRows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		List <WebElement> NoOfColomns = driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
		//OR
		
		List <WebElement> NoOfRowsWay2 = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[1]"));
		List <WebElement> NoOfColomnsWay2 = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th"));
		System.out.println("NoOfRows:  "+NoOfRows.size());
		System.out.println("NoOfColomns:  "+NoOfColomns.size());
		System.out.println("NoOfRowsWay2:  "+NoOfRowsWay2.size());
		System.out.println("NoOfColomnsWay2:  "+NoOfColomnsWay2.size());
		
		for (int i = 2; i <= NoOfRows.size(); i++) {
			for (int j = 1; j <= NoOfColomns.size(); j++) {
				String value=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText();
				//System.out.print(value);//print all data in the table not header
				if(value.equals("Francisco Chang")) {
					System.out.println("Position of Francisco Chang is ("+(i-1)+","+j+")");
					System.out.println("Company of Francisco Chang is "+driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+(j-1)+"]")).getText());
					break;
				}
				
			}
			System.out.println("\n");
			
			
		}
		
		
		//Fetching first colm
		System.out.println("FIRST COLOMN: ");
		for (int j = 2; j <= NoOfRows.size(); j++) {
			String value=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+j+"]//td[1]")).getText();
			System.out.print(value+"   ");
		//When company Microsoft find country
			if(value.equals("Microsoft"))
			{
				String country=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+j+"]//td[3]")).getText();
				System.out.println("Country of Microsoft is:   "+country );
			}
		
		}	
		
		
		
		
		
		
		
//		
//		System.out.println("th:    ");
//		for(WebElement header:headers)
//		{
//			System.out.println(header.getText());
//		}
//		System.out.println("------------------------------------");
//		System.out.println("tr:    ");
//		for(WebElement row:alldataWithHeader)
//		{
//			System.out.println(row.getText());
//			//System.out.println("------------");
//		}
//		System.out.println("------------------------------------");
//		System.out.println("td:    ");
//		for(WebElement col:alldata)
//		{
//			System.out.println(col.getText());
//		}
//		
//		System.out.println("------------------------------------");
////		System.out.println(cols.size());
////		System.out.println(rows.size());
//		int count=0;
//		
//		System.out.println("count:" +count);
//		
//		
////		for (int i = 0; i < cols.size(); i++) {
////			for (int j = 0; j < rows.size(); j++) {
////				
////				
////				
////			}
////			
//		}
		
	driver.quit();	
	}

}
