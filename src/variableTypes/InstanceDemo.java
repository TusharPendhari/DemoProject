package variableTypes;

public class InstanceDemo {
	
	
	int m = 30;
	
	public void login() 
	{
		int j = 20;              // local variable
		System.out.println(j);
	}

	public static void main(String[] args) {
		
		int i = 10;              // local variable
		System.out.println(i);
		
		InstanceDemo obj = new InstanceDemo();
		obj.login();
		
		System.out.println(obj.m);
		
	}

}
