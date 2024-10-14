package assignment_1;

public class Question_3 {

	//3. Check Eligibility to Vote
	//Write a Java program that asks the user for their age and checks 
	//if they are eligible to vote (18 or older). Use if-else statements to print an appropriate message.

	public static void main(String[] args) {
		
		int age = 50;
		
		if(age>=18) {
			System.out.println("The person is eligible to vote");
		}
		
		else {
			System.out.println("The person is not eligible to vote");
		}

	}

}
