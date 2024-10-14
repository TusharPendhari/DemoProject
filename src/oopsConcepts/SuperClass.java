package oopsConcepts;

public class SuperClass {
	
	public void president() 
	{
		System.out.println("President id Draupadi Murmu");
	}
	
	public void primeMinister() 
	{
		System.out.println("Prime Minister is Narendra Modi");
	}

	public static void main(String[] args) {
		
		SuperClass obj = new SuperClass();
		obj.president();
		obj.primeMinister();

	}

}
