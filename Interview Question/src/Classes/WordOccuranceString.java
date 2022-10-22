package Classes;

import java.util.HashMap;
import java.util.Map;

public class WordOccuranceString {

	public static void main(String[] args) {
		String str="My name is Anjali Pandey and My daughter name is Mitthu";
		String[] words=str.split(" ");
		Map <String ,Integer> hm=new HashMap<>();
		for (String word:words) {
		 Integer key= hm.get(word);
		 if(key==null) {
			 hm.put(word, 1);
			 
		 }
		 else {
			 hm.put(word, key+1);
		 }
		}
		
	System.out.println(hm);	
		
		
	}
	
	
	
}
