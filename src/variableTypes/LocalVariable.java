package variableTypes;

public class LocalVariable {
	
	public void login()
	{
		int j = 20;
		System.out.println(j);
	}

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		
		LocalVariable obj = new LocalVariable();
		
		obj.login();
	}

}
