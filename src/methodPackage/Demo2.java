package methodPackage;

	// importing Demo1 methods in Demo2..
public class Demo2 {

	public static void main(String[] args) {
		 // creating an object of Demo1 in Demo2..
		Demo1 obj = new Demo1();
		
		obj.add();
		
		obj.add(10,20);
		
		obj.mul();
	}

}
