package assignment_2_OnLoops;

public class Demo_6 {
	
	// Q..What will be the output of following program and why ?(explanation)
	// Answer :- loop is iterating for the value 1,2,3,4; for these value the loop is
	// not going to enter into the if block. It will directly come out of the if block
	// and print SOS. And when it gets value 5, it enters into the if block and execute break
	// statement. so that it directly come out of the code/loop.

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++)
		{
			if(i==5) 
			{
				break;
			}
		System.out.println(i);
		}
	}

}
