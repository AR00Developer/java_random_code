import  java.util.Scanner; 

class NestedIfElse 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(system.in);
		int marksObtained, passingMarks; 
		char grade; 

		Syste.out.println("Input marks scored by you");
		marksObtained = input.nextIn(); 

		passingMarks = 40; 
		if( marksObtained >= passingMarks)
		{
			if(marksObtained > 90)
			{
				grade = 'A';
			}
			else if(marksObtained > 75)
			{
				grade = 'B'
			}
			else if(marksObtained > 60)
			{
				grade = 'C';
			}
			else
			{
				grade = 'D';	
			}

			System.out.println("You passed the exam and your grade is  " + grade);
		}
		else {
			grade = 'F';
			System.out.println("You've failved and your grade is " + grade);
		}

	}
}