// ------------------------------------------------------------
// STUDENT NAME: Annalis Mach
// FILENAME: Lab5.java
// DESCRIPTION: This program asks the user to input their choice from a given menu and will execute their response. 
// FOR: CSE 110 - Lab 5
// TIME SPENT: 
// DATE: February 12, 2019
//-------------------------------------------------------------
import java.util.Scanner; 
public class Lab5 {
	public static void main (String[] args){
		{
	

	//allows us to get input from the keyboard
	Scanner in = new Scanner(System.in);
	
	//declares all the variables we are going to use
	int choice = 0; 
	int start = 0;
	int end = 0;
	int count;
	int numberOfStars = 0;
	int triangleHeight = 0;
	int rowCount = 0;
	
	do {
	//shows the menu and collects the users input 
	System.out.println("Please choose from the following menu:" );
	System.out.println("1: Print all integer numbers between two integers");
	System.out.println("2: Display a right triangular pattern of stars");
	System.out.println("3: Quit" );
	System.out.println("Please enter your choice");
	choice = in.nextInt();
	
	switch (choice) //allows us to choose from that menu
	{ 
	
	case 1: //prints out every int between 2 entered values
		System.out.println("Please enter a start value");
		start = in.nextInt();
		System.out.println("Please enter an end value");
		end = in.nextInt();
		
		for (count = start; count <= end; count++)
		{ 
		   System.out.println(count);
		}// end bracket for for loop in case 1
		break;
		
	case 2: //prints out a pyramid of stars
		System.out.println("Please enter the triangles height");
		triangleHeight = in.nextInt();
		
		for (rowCount = 1; rowCount<= triangleHeight; rowCount ++)
		{
			for (numberOfStars = 1; numberOfStars <= rowCount; numberOfStars ++) 
			{
			System.out.print("*");
			
			}//end bracket for nested for loop
			System.out.println();
		
		}//end bracket for first for loop in case 2
	break;
	
	default:
		System.out.println("You have entered an invalid input, please try again "); 
		break; 		
	}//end bracket for switch case

}//end bracket for main body 

	while (choice != 3);}//if the choice is 3 it quits the loop
System.out.println("Thanks! Have a nice day!"); 
	}
}//end bracket for class


	
