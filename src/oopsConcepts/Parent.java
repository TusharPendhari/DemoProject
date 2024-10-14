package oopsConcepts;

public class Parent {
	
	public void addition() 
	{
		System.out.println(100+10);
	}
	
	public void subtraction() 
	{
		System.out.println(100 - 20);
	}

	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj.addition();
		obj.subtraction();

	}

}
