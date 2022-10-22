package Classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicacy {

	

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
				System.out.println("list after removing duplicate:  "+RemoveDuplicacy(arr,n));
			}

			public static List RemoveDuplicacy(int[] arr, int no) {
				
			Set <Integer>set=new HashSet<>();
			List<Integer> list=new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			for (int value:set) {
				list.add(value);
			}
			return list;
	}
}

