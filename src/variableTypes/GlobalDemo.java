package variableTypes;

public class GlobalDemo {
	
	static String designation = "software testing";
	static String district = "nashik";
	
	static String marital_status = "unmarried";
	static String village = "kasbe_vani";
	
	public void student_info() 
	{
		String full_name = "Tushar Pendhari";
		System.out.println("full name is");
		System.out.println(full_name);
	}

	public static void main(String[] args) {
		
		String name = "Tushar";
		int age = 28;
		
		System.out.println(name);
		System.out.println(age);
		
		GlobalDemo info = new GlobalDemo();
		info.student_info();
		System.out.println(designation);
		System.out.println(district);
		
		System.out.println(GlobalDemo.marital_status);  // called using class reference
		System.out.println(info.village);
		
	}

}
