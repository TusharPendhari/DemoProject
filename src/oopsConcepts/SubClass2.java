package oopsConcepts;

public class SubClass2 extends SuperClass {
	
	public void andhraPradesh() 
	{
		System.out.println("state is Andhra Pradesh");
	}
	
	public void chiefMinister() 
	{
		System.out.println("chief minister of Andhra is ChandraBabu Naidu");
	}

	public static void main(String[] args) {
		
		SubClass2 obj = new SubClass2();
		
		obj.president();
		obj.primeMinister();
		obj.andhraPradesh();
		obj.chiefMinister();
	}

}
