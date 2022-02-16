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
		
		System.out.print("Enter another positive integer: "); 
		int integer2 = inKey.nextInt();
		
		double product = Math.pow(integer, integer2); //math formula for caluclating the exponents 
		System.out.print(integer + "^" + integer2 + " = " + product); //printing our the final statement 
		
		System.out.println("\n");
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		System.out.print("Enter a positive integer: "); //informs the user of what data they should input
		int num = inKey.nextInt(); //collects the data and stores it into the variable "num"

		double product = Math.sqrt(num);
		System.out.print("The square root of " + num + " is " + product);
		
		System.out.println("\n");

	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		System.out.print("Length of side A: "); //informs the user of what data they should input
		int a = inKey.nextInt(); //collects the data and stores it into the variable "a"

		System.out.print("Length of side B: "); 
		int b = inKey.nextInt(); 

		double length1 = Math.pow(a, 2);
		double length2 = Math.pow(b, 2);
		
		double length3 = length1 + length2;
		
		double hypo = Math.sqrt(length3);
		
		
		System.out.print("Hypotenuse = " + hypo);
		
		System.out.println("\n");

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard
		
		System.out.print("Enter an integer: ");
		int x1 = inKey.nextInt();
		
		int max = x1;
		int min = x1; 
		
		boolean loop = true; 
		
		
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
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}
	
	
}
