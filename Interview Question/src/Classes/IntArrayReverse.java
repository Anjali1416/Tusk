package Classes;

public class IntArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr1= {1,4,5,6,7};
   int j=0;
   Integer[] rev_arr1=new Integer[arr1.length];
   for(int i=0; i<arr1.length;i++) {
	   System.out.print(arr1[i]+"\t");
	  
   }
   System.out.println();
   for(int i=arr1.length-1;i>=0;i--) {
	   rev_arr1[j]=arr1[i];
	  
	   System.out.print(rev_arr1[j]+"\t");
	   j=j+1;
   }
   
 
	}

}
