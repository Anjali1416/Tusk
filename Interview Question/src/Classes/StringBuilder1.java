package Classes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.systeminfo.SystemInfo;


import io.github.bonigarcia.wdm.WebDriverManager;



public class StringBuilder1 {

	public static void main(String[] args) throws IOException {
		StringBuilder1 obj =new StringBuilder1();
		obj.reverseString();
		obj.SwapValue();
		obj.removeWhiteSpace();
		obj.ArraySorter();
		obj.SameElementTwoArrays();
		obj.SecondLargest();
		obj.sumOfAllArray();
		obj.MergeTwoList();
		obj.Prime();
		obj.distinctCharacter();
		obj.NoOfWords();
		obj.readExcel();
		obj.sereenshot();
	}

	
	public void reverseString() {
		System.out.println("------------------------------------reverseString-----------------------------");
		StringBuilder str= new StringBuilder();
		str.append("anjali Pandey");
		StringBuilder str1= new StringBuilder(str.capacity());
		for (int i = str.length()-1; i>=0; i--) {
			str1.append(str.charAt(i));
		}
	
System.out.println("Given String is:    "+str);
System.err.println("Given String after reverse is:    "+str1);
	}
	
	public void SwapValue() {
		System.out.println("------------------------SwapValue----------------------");
		Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Entered values are:   "+a+"  "+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.err.println("Entered values after swap are:   "+a+"  "+b);
				}
	public void removeWhiteSpace() {
		System.out.println("------------------------------------removeWhiteSpace----------------------");
		String s= "   Anjali Pandey    ";
		s=s.trim();
		System.out.println(s.strip());
System.err.println("String after removing space is:   "+s);
	}	
		public void ArraySorter() {
			System.out.println("-----------------ArraySorter-----------------------------");
			int[] array = {1, 2, 3, -1, -2, 4};

			Arrays.sort(array);

			System.out.println(Arrays.toString(array));
			List<Integer> li=new ArrayList<>();
			li.add(1);
			li.add(2);
			li.add(3);
			li.add(-1);
			li.add(-2);
			li.add(4);
			Collections.sort(li);
			String ListToString=li.toString();
			String ArrayToString=array.toString();
			System.out.println("ListToString:  "+ListToString);
			System.out.println("ArrayToString:  "+ArrayToString);

			System.out.println("List:  "+li);
			System.out.print("Even:  ");
			
			for (int  value:li) {
				if (value%2==0)
				{
					System.out.print(value+"  ");
				}
			}
			System.out.println();
					}
		public void SameElementTwoArrays() {
			int [] arr1= {1,4,2,2,6,8};
			int [] arr2= {1,6,6,10};

//			for (int i = 0; i < arr1.length; i++) {
//				for (int j = 0; j < arr2.length; j++) {
//					if(arr1[i]==arr2[j]) {
//						System.out.println(arr1[i]);
//					
//				}
//				
//			}
//			}
			Set<Integer> s1= new LinkedHashSet<>();
			Set<Integer> s2= new LinkedHashSet<>();
			for (int i = 0; i < arr1.length; i++) {
				s1.add(arr1[i]);
			}
			
			for (int j = 0; j < arr2.length; j++) {
				s2.add(arr2[j]);
			}
			System.out.print("Set Values are:   " );
			for(int value:s1) {
				System.out.print(value+"  ");
			}
			System.out.println();
			Integer[] arr11=new Integer[s1.size()];
			s1.toArray(arr11);
			//System.out.println("\n");
			System.out.print("Set to Array is:  ");
			for (int i = 0; i < arr11.length; i++) {
				System.out.print(arr11[i]+"  ");
			}
System.out.println();
			}
		
public void SecondLargest() {
	
	int [] arr1= {7,4,2,2,6,8};
	Arrays.sort(arr1);
	System.out.println("Second Highest:  "+arr1[arr1.length-2]);
	
//using logic
	for (int i = 0; i < arr1.length; i++) {
		for (int j = i+1; j < arr1.length; j++) {
			if (arr1[i]>=arr1[j]) {
				arr1[j]=arr1[i];
			}
		}
		
	}
	System.out.print("sorted array by logic is:   ");
	for (int k = 0; k < arr1.length; k++) {
		System.out.print(arr1[k]+"  ");
	}
	System.out.println();
	System.out.println("Second Highest by logic:  "+arr1[arr1.length-2]);
	 }	


//-------------------------------------sumOfAllArray-------------------------------------
public void sumOfAllArray() {
	int [] arr1= {7,4,2,2,6,8};
	int sum=0;
	for (int i = 0; i < arr1.length; i++) {
		
		sum= sum+arr1[i];
	}
	
	System.out.println("Sum of all the element in the array:  "+sum);
}
	public void MergeTwoList() {
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		l1.add(1);
		l2.add(2);
		l1.addAll(l2);
		System.out.print("Set after merged is:  ");
		for(int value:l1) {
			System.out.print(value+"  ");
		}
	}	
		
		
	public void Prime() {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:  ");
int n= sc.nextInt();

if(n==0 && n==1) {
	System.out.println("please enter valid number ");
}
for (int i = 2; i < n/2; i++) {
		if (n%i==0) {
			System.out.println("The number  "+n+"  is not prime");
			break;
		}
		System.out.println("The number  "+n+"  is  prime");
		break;
	}
	
	
}
public void distinctCharacter() {
	String name="anjali pandey";
	name=name.trim();
	Character[] arr= new Character[name.length()];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=name.charAt(i);
	}
	Set <Character> set= new LinkedHashSet<>();
	for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
 	for (Character value : set) {
		System.err.print(value);
	}
	
 	

}
	
public void NoOfWords() {
	String str="My Name is Anjali Pandey";
	String str1="My Name is: Mitthu";
	int count=1;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
			count=count+1;
		}
	}
	System.out.println("number of words are:  "+count);
	String[] arr=new String[count];
	arr=str1.split(":");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		
	}
	
}
	
	
	
	
	
	
	
	
	
	public void readExcel() throws IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\Nigam\\Desktop\\Data.xlsx");
		System.out.println("=============ReadExcel================");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet= wb.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println(rows+":"+cols);
	for (int i = 0; i < rows; i++) {
		XSSFRow row=sheet.getRow(i);
		for (int j = 0; j <cols; i++) {
			XSSFCell cell=row.getCell(j);
//			switch(cell.getCellType())
//			{
//			case STRING:System.out.println(cell.getStringCellValue());break;
//			case BOOLEAN:System.out.println(cell.getStringCellValue());break;
//			case NUMERIC:System.out.println(cell.getStringCellValue());break;
//			}
			
		}	
		
	}	
	
		
	}
	public void sereenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\Nigam\\Desktop\\Anjali\\1.jpg");
		FileUtils.copyFile(scrFile, destFile);
		
		
	}
	

	}
		

	
	
	
	
	
	
	


