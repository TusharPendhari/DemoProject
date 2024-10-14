package oopsConcepts;

public class RishiKapoor extends RajKapoor {

	
	public void acting() 
	{
		System.out.println("good acting skills");
	}
	
	public void dancing() 
	{
		System.out.println("good dancing skills");
	}
	
	public static void main(String[] args) {
		
		RishiKapoor obj = new RishiKapoor();
		
		obj.acting();
		obj.dancing();
		obj.horror();

	}

}
