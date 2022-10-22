package Classes;
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number from which you want to iterate");
		int n= sc.nextInt();
		System.out.print(a+"\t");
		System.out.print(b+"\t");
		for(int i=0;i<=n;i++)
		{
		int series=a+b;
		a=b;
		b=series;
		System.out.print(series+"\t");
		}
	}

}
