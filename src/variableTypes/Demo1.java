package variableTypes;

public class Demo1 {
	
	static String name = "Tushar Pendhari";
	static int age = 28;
	static String village = "kasbe vani";
	
	public static void main(String[] args) {
	
		System.out.println(name);  // call directly
		System.out.println(Demo1.age);  // call using class reference
		
		Demo1 info = new Demo1();
		System.out.println(info.village); // call using object reference
		
	}

}
