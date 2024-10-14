package methodPackage;

public class Add {
	
	static int i = 50000;
	
	public void sum() 
	{
		System.out.println(10+30);
	}

	public static void main(String[] args) {
		
		Add obj = new Add();
		obj.sum();
		System.out.println(i);

	}

}
