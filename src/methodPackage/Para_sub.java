package methodPackage;

public class Para_sub {
	
	public void subtraction(int x, int y) 
	{
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		
		Para_sub obj = new Para_sub();
		
		System.out.println("subtraction of x and y is :- ");
		obj.subtraction(300, 50);

	}

}
