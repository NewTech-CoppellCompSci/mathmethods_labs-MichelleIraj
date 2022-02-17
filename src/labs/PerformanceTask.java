package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inkey = new Scanner(System.in); //creates keyboard 
		
		System.out.print("Enter launch velocity (m/s) >>> "); //asks the user to input data 
		double launchVelocity = inkey.nextDouble(); //collects and stores the data in a variable 
		
		System.out.print("Enter launch angle (degrees) >>> ");
		double launchAngle = inkey.nextDouble();
		
		System.out.println("Projectile's path: "); //printing for formatting purposes 
		
		System.out.print("\n"); //formatting 
		
		int time = 0; //variable for keep track of the time
		
		double xPosition = 1; //initializing variable for the x-position
		
		double yPosition = 1; //initializing variable for the y-position
		
		boolean continueLoop = true; //boolean to control the loop 
		
		//condition so it enters the loop 
		while (continueLoop) {
			
			//formula to calculate the xPosition 
			xPosition = Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity; 
			
			//formula to calculate the yPosition 
			yPosition = Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * (time * time);
			
			//this if statement will work when the y-position hits 0 the second time around and doesn't keep running with negative or decimal numbers 
			if (time != 0 && yPosition < 0) {
				
				yPosition = 0; //to print the y-position as 0 since originally it was a double and it would print decimals 
				
				continueLoop = false; //continueLoop equals false so it exits the loop 
			}
			
			System.out.println("Time: " + time); //prints out the time 
			System.out.println("x-pos: " + xPosition + "m"); //prints out the x-position
			System.out.println("y-pos: " + yPosition + "m"); //prints out the y-position
			
			System.out.print("\n"); //formatting purposes
			
			time++; //updater to increase the time incrementally  
			
		}
		
	}
	
	
}
