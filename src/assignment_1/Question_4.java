package assignment_1;

public class Question_4 {
	// 4. Grade Assignment Based on Marks
	//Write a program that takes a student's marks as input and 
	//assigns a grade based on the following criteria:
	//Marks >= 90: Grade A
	//Marks >= 80: Grade B
	//Marks >= 70: Grade C
	//Marks >= 60: Grade D
	//Marks < 60: Fail
	//Use nested if-else statements to determine the grade.
	
	public static void main(String[] args) {
		
		int marks = 82;
		
		if (marks>=90) {
			System.out.println("Grade A");
		}
		
		else if (marks>=80 && marks <=89) {
			System.out.println("Grade B");
		}
		
		else if (marks>=70 && marks <=79) {
			System.out.println("Grade C");
		}
		
		else if (marks>=60 && marks <=69) {
			System.out.println("Grade D");
		}
		
		else {
			System.out.println("Fail");
		}

	}

}
