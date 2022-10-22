package Classes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Interview {
	
	String name="anjali Pandey";
	String reverse="";
	int[] array= {1,3,4,6,5,6,8};
	Integer[] RevArray=new Integer[array.length];



private void removeDuplicateString() 
{
		// TODO Auto-generated method stub

    HashSet<Character> set=new LinkedHashSet<>();

		for (int i=0;i<name.length();i++)
		   {
			set.add(name.charAt(i));
		
		   }
		System.out.print("String after remove duplicate is:  ");
        for (char value:set) 
           {
	        System.out.print(value);
	        }
    System.out.println("\n");
}
	
public void reverseString()
{
     	for (int j=name.length()-1;j>=0;j--)
	       {
		reverse=reverse+name.charAt(j);
	       }
	
    System.out.print("Reverse is:  "+reverse);
    System.out.println("\n");
}
private void removeDuplicateArray() {
	HashSet<Integer> set=new LinkedHashSet<>();

	for (int i=0;i<array.length;i++)
	   {
		set.add(array[i]);
		   }
	System.out.print(" array after removing duplicate is:   ");
    for (int val:set) {
    	System.out.print(val);
    	
    }
    System.out.print("\n");
}
private void reverseArray() {
	int l=0;
	for (int i=array.length-1;i>=0;i--)
	   {
		RevArray[l]=array[i];
		l=l+1;
		   }
	System.out.print(" Reverse array is:   ");
	for (int t=0;t<RevArray.length;t++)
	   {
		System.out.print(RevArray[t]);
		   }
	
}




public static void main(String[] args) {
	
	Interview in=new Interview();
	in.removeDuplicateString();
	in.reverseString();
	in.removeDuplicateArray();
	in.reverseArray();
	
}
}