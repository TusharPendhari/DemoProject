package assignment_2_OnLoops;

public class Demo_4 {
	
	// Q..What will be the output of following program
	// Answer :- in for loop(), we did not gave any starting and ending condition to loop.
	// so the loop repeats itself again and again fo number of times. and for each loop iterations
	// it only prints "hello" word.
	
	
	public static void main(String[] args) {
		
		for (; ; ) 
		{
			System.out.println("Hello");
		}

	}

}
