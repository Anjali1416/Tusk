package Classes;

public class tables {

	public static void main(String[] args) {
		String name="My Name is Anjali";
		String[] words=name.split(" ");
		System.out.println(name);
	String[] rev=new String[words.length];
	int count=0;
	
		for (int i = rev.length-1; i>=0;i--) {
			rev[count]=words[i];
			count=count+1;
		}
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i]+"  ");
		}

	}
	

}
