package Classes;
import java.util.Scanner;



public class sapient {
	public static void main(String[] args) {
		int max;
		int min;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of array");
		int n= sc.nextInt();
		Integer[] arr=new Integer[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("enter numbers:");
			arr[i]=sc.nextInt();
		}
                                                                        //		System.out.print("array is:");
                                                                        //		for (int p = 0; p < n; p++) {
                                                                        //			System.out.print(arr[p]);
    
			//		}
	Test ts=new Test(arr,n);
	Test ts1 = null;
	ts.incrbyten(ts1);
  // ts.incrbyten(arr,n);
   // System.out.println(result.max+"  "+result.min);
    
    
    //Test result2=ts.incrbyten(arr,n);
		
		
		
//		Test obj=new Test(6,3);
//		obj.incrbyten();
//		Test obj2=obj.incrbyten();
//		System.out.println(obj2.a+"    "+obj2.b);
	}
	
}
class Test{
	
	Integer[] arr;
	int n;

	public Test(Integer[] arr2, int n) {
		this.arr=arr2;
		this.n=n;
	}

	Test incrbyten(Test temp) {
		int mx=arr[0];
		int mn=arr[0];
		for (int k = 1; k < arr.length; k++) {
			if(arr[k]>mx) {
				mx=arr[k];
			}
		}
		System.err.println(mx);
			for (int r = 1; r < arr.length; r++) {
				if(arr[r]<mn) {
					mn=arr[r];
				}
		}
		
			//System.out.println("min and max is   "+mn+"   "+mx);
			
			return temp;
		
		
	}
		


	
}
