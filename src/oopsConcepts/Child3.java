package oopsConcepts;

public class Child3 extends Parents1{

	public void village() 
	{
		
		System.out.println("village is Kasbe Vani");
	}
	
	public void pinCode() 
	{
		System.out.println("pincode is 422215");
	}
	
	public static void main(String[] args) {
		
		Child3 obj = new Child3();
		obj.country();
		obj.state();
		obj.district();
		obj.taluka();
		obj.village();
		obj.pinCode();


	}

}
