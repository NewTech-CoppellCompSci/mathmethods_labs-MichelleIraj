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
		
		Scanner inKey = new Scanner(System.in); 
		
		System.out.print("Enter a positive integer: ");
		int num = inKey.nextInt();
		
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt(); 
		
		int max = Math.max(num, num2);
		int min = Math.min(num, num2); 
		int scope = max - min + 1; 
		
		for (int i = 1; i <= 10; i++) {
			
			int randomNum = (int) (Math.random()* scope + min);
			 System.out.print(randomNum + " ");
		}
		
		System.out.print("\n");
		
	}
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter the radius value of the cylinder: ");
		double radius = inKey.nextDouble();
		
		System.out.print("Enter the height value of the cylinder: ");
		double height = inKey.nextDouble();
		
		double v = (Math.PI)*(Math.pow(radius, 2))*(height);
		
		System.out.print(v);
		
		System.out.print("\n");
	}

	
	

	public static void problem03() {

		Scanner inKey = new Scanner(System.in); 
		
		System.out.print("Enter x1: ");
		double x1 = inKey.nextDouble();
		
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		
		System.out.print("Enter x2: ");
		double x2 = inKey.nextDouble();
		
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		double x = Math.pow((x1 - x2), 2);
		
		double y = Math.pow((y1 - y2), 2);
		
		double formula = Math.sqrt(x + y);
		
		System.out.print("Distance between the points: " + formula);
	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in); 
		
		System.out.print("Enter a-value: ");
		double a = inKey.nextDouble();
		
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		
		double s1 = Math.sqrt(Math.pow(b, 2)-(4*(a * c)));
		
		double s2 = (b * (-1)) + s1;
		
		double s3 = (b * (-1)) - s1;
		
		double s4 = s2/(2*a);
		
		double s5 = s3/(2*a);
		
		System.out.println("x1 = " + s4);
		System.out.println("x2 = " + s5);

	}
	
	

	
}
