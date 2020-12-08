// ------------------------------------------------------------
// AUTHOR: Annalis Mach
// FILENAME: lab3.java
// SPECIFICATION: Work with loops to evaluate the input of a homework, midterm, and final exam grade to determine if the student passed. 
// FOR: CSE 110- Lab #3
// TIME SPENT: 2 hours
//-------------------------------------------------------------

//All imports has to be outside class 
import java.util.Scanner; 

	//class name should match the file name public class Lab3
	public class Lab3 
	{ 
 
			// we must have a main method to run the program 
			public static void main(String[] args)
		{
    
			// declaring variables
			Scanner scan = new Scanner(System.in); // a variable scan of type Scanner 
			double finalexamGrade = 50.0;
			double midtermGrade = 50.0;
			double homeworkGrade = 0.0;
			double finalGrade = 0.0;
			char letterGrade = ' '; 
     
			// gets the input of the grades from the keyboard 
			System.out.println("Please enter your homework grade:");
			homeworkGrade = scan.nextDouble();
			System.out.println("Please enter your midterm grade:");
			midtermGrade = scan.nextDouble();
			System.out.println("Please enter your final exam grade:");
			finalexamGrade = scan.nextDouble();

			// a loop that determines if the range is appropriate and if not it will say that there is an invalid range
			if((homeworkGrade >= 0 && homeworkGrade <= 100) && (midtermGrade >= 0 && midtermGrade <= 100) && (finalexamGrade >= 0 && finalexamGrade <= 200)) { 
			
				finalGrade = (.25*(homeworkGrade/200))+(.25*midtermGrade)+(.5*finalexamGrade);
			
				//a loop that determines if the student passes or fails
				if (finalGrade >= 50) {
				letterGrade = 'P';
				System.out.println("You have passed the class");
				}
				else {
				letterGrade = 'F';
				System.out.println("You have failed the class");
						}
			}
			
			else {
				System.out.println("Invalid input");
				System.out.println("\n Range");
				System.out.println("\n1. Homework should be between 0 and 100");
				System.out.println("\n2. The midterm should be between 0 and 100");
				System.out.println("\n3. Final exam grade should be between 0 and 200");
					}
	scan.close();
		} 
	}


