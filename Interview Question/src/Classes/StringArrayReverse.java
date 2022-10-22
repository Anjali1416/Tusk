package Classes;

public class StringArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name= {"Anjali","Mitthu","Nigam","Nirmala"};
String[] Rev=new String[name.length];
int j=0;
for(int i=name.length-1;i>=0;i--) {
	Rev[j]=name[i];
	System.out.print(Rev[j]+"\t");
	j=j+1;
}
	}

}
