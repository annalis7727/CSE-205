// ------------------------------------------------------------
// AUTHOR: Annalis Mach 
// FILENAME: Lab6.java
// SPECIFICATION: This program is designed to get the input of a persons first and last name
// 					and birth year and will output their name, age, and age in 10 years. 
// FOR: CSE 110- Lab #6 
// TIME SPENT: 1 hour 
//-------------------------------------------------------------

import java.util.Scanner; 
public class Lab6 {
	public static void main (String[] args){
		
	//allows me to get the input from the keyboard
	Scanner in = new Scanner(System.in);
	
	//declaration of my variables
	String firstName = " ";
	String lastName = " ";
	int birthYear = 0;
	
	//gets the input from the user 
	System.out.println("Please enter your first name: ");
	firstName = in.nextLine(); 
	System.out.println("Please enter your last name: ");
	lastName = in.nextLine();
	System.out.println("Please enter your birth year");
	birthYear = in.nextInt();
	
	//calls the method that I created
	Person constructor = new Person (firstName, lastName, birthYear);
	
	//allows for the conversion to age
	int curYear = 2019;
	
	//prints out the age and how old you will be in 10 years 
	System.out.print(constructor.getfirstName()+ " " + constructor.getlastName() + " is " + constructor.getAge(curYear) + " years old in 2019 and will be " + constructor.getAge(curYear + 10)  + " years old in 10 years" );
	
	
	
}
}
