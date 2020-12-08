// ---------------------------------------------------------------------------
// AUTHOR: Annalis Mach 
// FILENAME: Lab1
// SPECIFICATION: Finding an average in test scores for Jenny
// FOR: CSE 110- Lab 1
// TIME SPENT: 1 hour
// ---------------------------------------------------------------------------

import java.util.Scanner; 	
public class Lab1 {//must declare a class, java is object oriented 
public static void main(String[] args) { //all lines of code must be in here aka main method
	

int test1, test2,test3; 
double average; 
final int NUM_TESTS =3; // constant number of tests that have been taken
Scanner in= new Scanner(System.in);

System.out.print("Enter the score on the first test"); //what the computer asks for
test1 = in.nextInt(); //retrieves from a keyboard entry
System.out.print("Enter the score on the second test"); //what the computer asks for
test2 = in.nextInt(); //retrieves from a keyboard entry
System.out.print("Enter the score on the third test"); //what the computer asks for
test3 = in.nextInt(); //retrieves from a keyboard entry

average = (test1 + test2 + test3) / (double)NUM_TESTS; // calculates the average from 3 test scores

System.out.println("Your test score average"); //Is displayed before the number 
System.out.println(average); //Actually prints out the number

}
}

