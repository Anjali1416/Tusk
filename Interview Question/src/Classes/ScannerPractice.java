package Classes;

import java.util.Scanner;

public class ScannerPractice {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	System.out.println("Please enter a number");
	Scanner scnr = new Scanner(System.in);
	//String input = scnr.nextLine();
	int number = Integer.parseInt(scnr.nextLine()); 
	//System.out.println("The converted integer is " + number);
	Integer [] arr=new Integer[number];
	int i=0;
//for (int j = 0; j < number; j++) {
//	arr[j]=scnr.nextInt();
//}
//}
	while(i<number) {
		arr[i]=Integer.parseInt(scnr.nextLine()); 
		System.out.println(arr[i]);
	}
	for (int j = 0; j < number; j++) {
		System.out.println(arr[j]);
	}

	
	 
	 
	 
	 
}
}
