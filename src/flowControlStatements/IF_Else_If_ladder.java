package flowControlStatements;

public class IF_Else_If_ladder {

	public static void main(String[] args) {
	
		int marks = 62;
		
		if (marks >= 90) 
		{
			System.out.println("Grade A");
		}
		
		else if (marks>=80 && marks<=89) 
		{
			System.out.println("Grade B");
		}
		
		else if (marks>=70 && marks<=79) 
		{
			System.out.println("Grade C");
		}
		
		else if (marks >=60 && marks <=69) 
		{
			System.out.println("Grade D");
		}
		
		else if (marks>=50 && marks<=59) 
		{
			System.out.println("Grade E");
		}
		
		else 
		{
			System.out.println("VIT students");
		}

	}

}
