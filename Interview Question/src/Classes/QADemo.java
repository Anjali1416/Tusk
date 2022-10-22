package Classes;
import java.util.Scanner;

public class QADemo {

	public static void main(String[] args) {

			  String str1 = "w3resource";
			  System.out.println("The given string is: " + str1);
			 
			  char[] arr1 = str1.toCharArray();
			  String targetStr = "";
			  
			  
			  for (char value: arr1) {
			   if (targetStr.indexOf(value) == -1) {
			    targetStr += value;
			   }
			  }
			  System.out.println("after removing duplication:"+targetStr);
			 }	
}
