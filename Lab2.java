// ------------------------------------------------------------
// AUTHOR: Annalis Mach
// FILENAME: Lab 2
// SPECIFICATION: Using a scanner class to work with strings 
// FOR: CSE 110- Lab #2
// TIME SPENT: 1 hour
//-------------------------------------------------------------

import java.util.Scanner;
public class Lab2 {
	
	public static void main(String[] args) {
	
	//declares the variables
	Scanner scan = new Scanner(System.in); 
    String firstName = ""; 
    String lastName = ""; 
    String fullName = ""; 
    int nameLength = 0; 
    
    //gets input of first name
    System.out.println("Please enter first name: "); 
    firstName = scan.nextLine(); 
    
    //gets input of last name
    System.out.println("Please enter last name: "); 
    lastName = scan.nextLine();

    //prints out first name and last name with a space in between
    System.out.println(firstName + " " + lastName);
    
    //stores input of first and last name in full name
    fullName = firstName + " " + lastName;
    
    //determines the numbers of characters from the input
    System.out.println(fullName.length());
    
    //will print out the full name variable in all caps
    System.out.println(fullName.toUpperCase());    
    
    //determines the variables for the loops 
    String testString1 = ("abc"); 
    String testString2 = new String ("abc");
    
    //tests to see if two variables are equal and prints out the answer 
    if (testString1 == testString2) { 
    	System.out.println("== works!");
    // if it does not work this is the result
    } else { 
    	System.out.println("== does not work");
    
    } 
    //tests to see if two variables are equal and prints out the result
    if (testString1.equals(testString2)) { 
        System.out.println("equal works");
    //if it does not work this is the result 	
    } else { 
    	System.out.println("equals does not work");
      
    } 
	}
}

