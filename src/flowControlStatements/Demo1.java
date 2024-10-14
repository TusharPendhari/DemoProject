package flowControlStatements;

public class Demo1 {

	public static void main(String[] args) 
	{
		
		int age = 15;
		
		if(age>=18) // execute when 'if' condition is True.
		{
			System.out.println("person is eligible for voting");
		}
		
		else // execute only when 'if' condition is false.
		{
			System.out.println("person is not eligible for voting");
		}
	}

}
