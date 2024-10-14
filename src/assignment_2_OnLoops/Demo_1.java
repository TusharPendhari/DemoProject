package assignment_2_OnLoops;

public class Demo_1 {
	
	// Q..What will be the output of following program
	
	// Answer :-  it goes on printing infinite numbers, because we did not gave condition
	// where to stop the execution of the code.

	public static void main(String[] args) {
		
		for(int i=1; ; i++) 
		{
			System.out.println(i);
		}

	}

}
