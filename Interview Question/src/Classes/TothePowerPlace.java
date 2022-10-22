package Classes;
import java.util.Scanner;

public class TothePowerPlace {

	public static void main(String[] args) {
		// 234 is num. 2^0+3^1+4^3
//		int esult=(int) (Math.pow(2, 3));
//		System.out.println(esult);
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int num=number;
		int count=-1;
		while(number>0){
			number=number/10;
			
			count=count+1;
		}
		int Result=0;
		while(num>0){
			int mod= num%10;
			System.out.println(mod);
			 Result=(int) (Result+Math.pow(mod, count));
			 System.out.println(mod+"power"+count);
			 num=num/10;
			 count=count-1;
		}
		System.out.println("Result:"+Result);
	}

}
