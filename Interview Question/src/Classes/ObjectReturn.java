package Classes;
public class ObjectReturn {
public static void main(String[] args) {
	
	classdemo t1=new classdemo(10,20);
	classdemo t2=new classdemo(10,20);
	classdemo t3=t1.methodprint(t2);
	System.out.println(t3.a);
	
	
}
}

class classdemo{

	public int a;
	public int b;
	public classdemo(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public classdemo methodprint(classdemo temp) {
		temp.a=a;
		temp.b=b;
		return temp;
		
	}
	
	
	
	
	
}
