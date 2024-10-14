package methodPackage;

public class Demo1 {
	
	int i = 30;
	
	public void add() 
	{
		System.out.println("this is normal method");
		System.out.println(10+20);
	}
	
	public void add(int x, int y) 
	{
		System.out.println("this is parameterized method");
		System.out.println(x + y);
	}
	
	public void mul() 
	{
		System.out.println("this is normal method");
		System.out.println(20 * 12);
	}

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		
		obj.add();
		
		obj.add(13,5);

		obj.mul();
		
		System.out.println(obj.i);
	}

}
