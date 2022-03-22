package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		
		System.out.print("Enter a positive integer: "); //informs the user of what data they should input
		int integer = inKey.nextInt(); //collects the data and stores it into the variable "integer"
		
		System.out.print("Enter another positive integer: "); //informs the user of what data they should input
		int integer2 = inKey.nextInt(); //collects the data and stores it into the variable "integer"
		
		double product = Math.pow(integer, integer2); //math formula for caluclating the exponents 
		System.out.print(integer + "^" + integer2 + " = " + product); //printing our the final statement 
		
		System.out.println("\n"); //formatting purposes 
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		System.out.print("Enter a positive integer: "); //informs the user of what data they should input
		int num = inKey.nextInt(); //collects the data and stores it into the variable "num"

		double product = Math.sqrt(num); //calculates the squareroot 
		System.out.print("The square root of " + num + " is " + product); //prints out the squareroot of the number
		
		System.out.println("\n"); //formatting purposes 

	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		System.out.print("Length of side A: "); //informs the user of what data they should input
		int a = inKey.nextInt(); //collects the data and stores it into the variable "a"

		System.out.print("Length of side B: "); 
		int b = inKey.nextInt(); 

		double length1 = Math.pow(a, 2); //calculating the number squared 
		double length2 = Math.pow(b, 2); //calculating the number squared 
		
		double length3 = length1 + length2; //adding the two lengths for the formula 
		
		double hypo = Math.sqrt(length3); //calculating the hypotenuse 
		
		
		System.out.print("Hypotenuse = " + hypo); //printing out the hypotenuse value 
		
		System.out.println("\n"); //formatting purposes 

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		
		System.out.print("Enter an integer: "); //asks the user to input something 
		int x1 = inKey.nextInt(); //collecting and storing the data 
		
		int max = x1; //giving the max a value
		int min = x1; //giving the max a value 
		
		boolean loop = true; //used to control the loop 
		
		
		/*
		 * the while loop condition is so it enters the loop 
		 * asks the user to input data 
		 * collects and stores the data
		 * the first if statement is used for if the user enters 0 
		 * it turns the boolean to false so it leaves the loop(s)
		 * the second loop is for when the user doesn't enter zero 
		 * it will calculate and store the min or max 
		 */
		
		while (loop == true) { 
			
			System.out.print("Enter an integer: ");
			int x = inKey.nextInt();
		
			if (x == 0) {
				loop = false; 
			}
			
			if (x != 0) {
				
				if (x < min) {
					min = x; 
				}
				if (x > max) {
					max = x; 
				}
				
			}
			
			
		}
		
		System.out.println("Max: " + max); //printing out the max 
		System.out.println("Min: " + min); //printing out the min

	}
	
	
}
