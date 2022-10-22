package Classes;

public class RepeatLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="anjali Pandey";
char[] array=new char[name.length()];
for (int i = 0; i < name.length(); i++) {
	array[i]=name.charAt(i);
	
}
for (int i = 0; i < array.length; i++) {
	for (int j = i+1; j < array.length; j++) {
		if (array[i]==array[j])
			System.out.print("Match::::"+array[i]+"\t");
		
	}
	
}
	}

}
