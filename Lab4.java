// ------------------------------------------------------------
// AUTHOR: Annalis Mach
// FILENAME: lab4.java
// SPECIFICATION: This program gives the users an option to choose from
// FOR: CSE 110- Lab #4 
// TIME SPENT: 1 hour 
//-------------------------------------------------------------
import java.util.Scanner;
public class Lab4 {
	
	public static void main(String[] args) {
	
	//Allows us to get input from the keyboard
	Scanner scan = new Scanner(System.in);
	
	//declares a variable so the user gets a choice
	int choice = 0; 
	int m = 0;
	int n = 0;
	int sum = 0;
	int count = m; 
	int fact = 1;
	int number = 0;
	int remainder = 0; 
	
	do {
	System.out.println("Please choose from the following menu: ");
	System.out.println("1: Calculate the sum of the integers from m to n. ");
	System.out.println("2: Calculate the factorial of given number.");
	System.out.println("3: Display the first digit for a given number.");
	System.out.println("4. Quit");
	System.out.println("Your choice: ");
	choice = scan.nextInt();
	
	switch(choice) {
	
	//this case gets a sum between two ints
	case 1: 
		System.out.println("Please enter the value of m: ");
		m = scan.nextInt();
		System.out.println("Please enter the value of n: ");
		n = scan.nextInt();
		count = m;
		sum = 0;
		while (count <= n){
			sum = sum + count; 
			count ++; 
		}
		System.out.println("The sum is : " + sum);
		break; 
	
	
	//this case will compute a factorial of a given int
	case 2: 
		System.out.println("Please enter a value for n: ");
		n = scan.nextInt();
		count = n;
		while(count > 1) { 
		    fact = fact * count; 
		    count--;
		}
		System.out.println(fact);
		break; 
		
		
	//this case will give the user the first digit of a number 
	case 3: 
		System.out.println("Please enter a number");
		number = scan.nextInt();
		while(number != 0) { 
		    remainder = number % 10; 
		    number = number / 10;
		}
		System.out.println("The first digit of the number is: " + remainder);
		break; 
	
	//this case is when it is not a valid input
	case 4: 
		System.out.println("Quitting the program....");
		break; 
		
	default:
		System.out.println("You have entered an invalid input, please try again "); 
		break; 
	}
	
	} while (choice != 4);
	
}
}
