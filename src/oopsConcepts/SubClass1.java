package oopsConcepts;

public class SubClass1 extends SuperClass {
	
	public void maharashtra() 
	{
		System.out.println("state is maharashtra");
	}
	
	public void chiefMinister() 
	{
		System.out.println("chief minister of maharashtra is Eknath Shinde");
	}

	public static void main(String[] args) {

		SubClass1 obj = new SubClass1();
		obj.president();
		obj.primeMinister();
		obj.maharashtra();
		obj.chiefMinister();
	}

}
