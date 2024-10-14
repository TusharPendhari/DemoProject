package oopsConcepts;

public class GrandParents {

	public void country() 
	{
		System.out.println("country is India");
	}
	
	public void state() 
	{
		System.out.println("state is Maharashtra" );
	}
	
	public static void main(String[] args) {
	
		GrandParents obj = new GrandParents();
		
		obj.country();
		obj.state();

	}

}
