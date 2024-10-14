package assignment_2_OnLoops;

public class Demo_3 {
	
	// Q..What will be the output of following program.
	// Answer :- here also, after executing the code, code will goes on printing value 1 for infinite 
	// number of times. Because we did not gave condition where to stop the code.
	// And also we did not gave increment/decrement condition. so the first loop with output 1 going
	// to print again and again.

	public static void main(String[] args) {
		
		for(int i=1 ; ; ) 
		{
			System.out.println(i);
		}

	}

}
