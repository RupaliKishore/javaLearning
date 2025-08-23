import java.util.Scanner;

class Practice{
	public static void main(String[] args){

		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");

		System.out.println("\n * \n ** \n *** \n **** \n *****");

		// variables

		int age = 24;
		char grade = 'A';   // char alwase in single quotes ''
		boolean isAdult = true;  // boolean value is either true or false
		float percentage = 88.5f;  // float value always ends with f
		double largeDecimal = 12345.6789;  // double value can be used for large decimal values	
		String name = "John Doe";  // String value is always in double quotes ""
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
		System.out.println("Is Adult: " + isAdult);
		System.out.println("Percentage: " + percentage);
		System.out.println("Large Decimal: " + largeDecimal);
		System.out.println("Hello " + name + ", you are " + age + " years old and your grade is " + grade + ".");
		System.out.println("You are an adult: " + isAdult + " with a percentage of " + percentage + "% and a large decimal value of " + largeDecimal + ".");
		System.out.println("Have a nice day!");

		
		// write a java program to add two numbers ?

		int num1 = 24;
		int num2 = 56;
		int sum = num1 + num2;
		System.out.println("Sum = " + sum);


		//  write a java program to find the remainder when one integer is divided by another ? 

		int num3= 20;
		int num4= 30;
		int remainder = num4 % num3;
		System.out.println("Remainder = " + remainder);	
	
		// write a java program to calculate the average of three numbers ?
		int n1, n2 , n3;
		n1 = 24;
		n2 = 56;
		n3 = 67;
		int average = (n1 + n2 + n3) / 3;
		System.out.println("Average = " + average);



	}
}
