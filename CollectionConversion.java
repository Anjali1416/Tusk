package Classes;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionConversion {

	public static void main(String[] args) {
		int [] arr1= {1,4,6,6,3};
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(3);
                al.add(4);
		al.add(4);
                al.add(12);
		al.add(13);
                al.add(9);
		Set<Integer> set1=new LinkedHashSet<>(al);
		Set<Integer> set=new LinkedHashSet<>(arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int e:set)
		{
			System.err.println("set is:"+e);
		}
		
		
		
		Set<Integer> set2=new LinkedHashSet<>(al);
		for(int e:set2)
		{
			System.err.print(e);
			
		}
		
		
	}

}
