package oopsConcepts;

public class Parents1 extends GrandParents {
	
	public void district() 
	{
		System.out.println("district is Nashik");
	}
	
	public void taluka() 
	{
		System.out.println("taluka is Dindori");
	}
	
	public static void main(String[] args) {
		
		Parents1 obj = new Parents1();
		
		obj.country();
		obj.taluka();
		obj.district();
		obj.taluka();
	}
}
