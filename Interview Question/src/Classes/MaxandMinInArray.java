package Classes;
import java.util.Iterator;

public class MaxandMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {20,12,34,20,50};
int max=arr[0];

for (int i = 1; i < arr.length; i++) {
	
		if (max<arr[i]) {
			 max=arr[i];
		}
	
}
System.out.println(max);

	
	int min=arr[0];

	for (int j = 1; j < arr.length; j++) {
		
			if (min>arr[j]) {
				 min=arr[j];
			}
		
	}
	System.out.println(min);
	}

}
