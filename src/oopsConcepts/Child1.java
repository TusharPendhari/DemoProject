package oopsConcepts;

public class Child1 extends Parent {
	
	public void multiplication() 
	{
		System.out.println(25*5);
	}
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.multiplication();
		obj.addition();
		obj.subtraction();
		

	}

}
