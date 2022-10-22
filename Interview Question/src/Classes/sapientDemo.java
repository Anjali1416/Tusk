package Classes;

import java.util.Iterator;
import java.util.Scanner;

public class sapientDemo {

public static void main(String[] args) {
	
	//Write your code
	
int i=0;
System.out.println("Enter the no of element you want to enter:     ");
Scanner scan=new Scanner(System.in);
int n=Integer.parseInt(scan.nextLine());
System.out.println("Enter "+n+"  elements");
int [] arr=new int[n];

while(i<n)
{
		arr[i]=Integer.parseInt(scan.nextLine());
		i++;
}

System.out.println("------------------------------");
		System.out.println("second largest is:  "+FindSecondLargestNumber(arr,n));
	}

	public static int FindSecondLargestNumber(int[] arr, int no) {
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[arr.length-2];
	}

	
}
