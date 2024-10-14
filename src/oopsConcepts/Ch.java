package oopsConcepts;

public class Ch extends Pa {
	
	public void childclass()
	{
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		
		Ch obj = new Ch();
		obj.parentclass();
		obj.childclass();
	}

}
