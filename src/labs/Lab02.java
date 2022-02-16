package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard 
		
		System.out.print("Enter a positive integer: "); //asks the user for them to input data
		int num = inKey.nextInt(); //collects the data and stores it 
		
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt(); 
		
		int max = Math.max(num, num2); //calculates the max between the two integers 
		int min = Math.min(num, num2); //calculates the min between the two integers 
		int scope = max - min + 1; //variable created for the range 
		
		for (int i = 1; i <= 10; i++) { //conf=dition is made so it only prints the random numbers 10 times 
			
			int randomNum = (int) (Math.random()* scope + min); //random number genrator 
			 System.out.print(randomNum + " "); //prints the random number 
		}
		
		System.out.print("\n");
		
	}
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard 
		
		System.out.print("Enter the radius value of the cylinder: "); //asks the user to input data
		double radius = inKey.nextDouble(); //collects and stores the data 
		
		System.out.print("Enter the height value of the cylinder: ");
		double height = inKey.nextDouble();
		
		double v = (Math.PI)*(Math.pow(radius, 2))*(height); //formula for calculating the cyclinder's volume 
		
		System.out.print(v); //prints out the volume 
		
		System.out.print("\n");
	}

	
	

	public static void problem03() {

		Scanner inKey = new Scanner(System.in); //creates the keyboard 
		
		System.out.print("Enter x1: "); //asks the user for the first x-coordinate 
		double x1 = inKey.nextDouble(); //collects and stores the data in a variable 
		
		System.out.print("Enter y1: "); //asks the user for the first y-coordinate
		double y1 = inKey.nextDouble(); //collects and stores the data in a variable 
		
		System.out.print("Enter x2: "); //asks the user for the second x-coordinate 
		double x2 = inKey.nextDouble(); //collects and stores the data in a variable 
		
		System.out.print("Enter y2: "); //asks the user for the second y-coordinate
		double y2 = inKey.nextDouble(); //collects and stores the data in a variable 
		
		double x = Math.pow((x1 - x2), 2); //calculates the differnce between the x's and squares it 
		
		double y = Math.pow((y1 - y2), 2); //calculates the differnce between the y's and squares it 
		
		double formula = Math.sqrt(x + y); //finally adds the y and x value and takes the squareroot of it
		
		System.out.print("Distance between the points: " + formula); //printing out the final answer 
	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in); //creates the keyboard 
		
		System.out.print("Enter a-value: "); //asks the user to input data 
		double a = inKey.nextDouble(); //collects and stores the data in variable "a"
		
		System.out.print("Enter b-value: "); //asks the user to input data 
		double b = inKey.nextDouble(); //collects and stores the data in variable "b"
		
		System.out.print("Enter c-value: "); //asks the user to input data 
		double c = inKey.nextDouble(); //collects and stores the data in variable "c"
		
		double s1 = Math.sqrt(Math.pow(b, 2)-(4*(a * c))); //formula for the first section of the formula under the square root
		
		double s2 = (b * (-1)) + s1; //makes "b" negative and adds it to the first section
		
		double s3 = (b * (-1)) - s1; //makes "b" negative and subtracts it from the first section
		
		double s4 = s2/(2 * a); //dividing the second section by 2 multiplied by "a"
		
		double s5 = s3/(2 * a); //dividing the third section by 2 multiplied by "a"
		
		System.out.println("x1 = " + s4); //printing out the final answer
		System.out.println("x2 = " + s5);

	}
	
	

	
}
