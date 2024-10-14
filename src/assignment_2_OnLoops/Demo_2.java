package assignment_2_OnLoops;

public class Demo_2 {
	
	// Q..What will be the output of following program.
	// Answer :- it will goes in printing 1 only, because we did not gave Post increment scenario 
	// to the code. so after executing first loop, it will not going to increment the value from
	// 1 to 2. so it will goes on printing only value 1.

	public static void main(String[] args) {
		
		for(int i=1; i<=10;) 
		{
			System.out.println(i);
		}

	}

}
