package Classes;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
System.out.println("enter the name");
String name=sc.next();

String opp="";
for(int i=name.length()-1;i>=0;i--) {
	opp=opp+name.charAt(i);
}
System.out.println(opp);
	}

}
