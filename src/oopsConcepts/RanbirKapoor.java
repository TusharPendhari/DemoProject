package oopsConcepts;

public class RanbirKapoor extends RishiKapoor{
	
	public void singing() 
	{
		System.out.println("good singing skills");
	}

	public static void main(String[] args) {
		
		RanbirKapoor obj1 = new RanbirKapoor();
		obj1.singing();
		obj1.acting();
		obj1.dancing();

	}

}
