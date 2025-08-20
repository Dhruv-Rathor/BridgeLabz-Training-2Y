package practice;

import java.util.Scanner;

public class Average {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second Number : ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third number : ");
		int num3 = input.nextInt();
		
		int Average = (num1 + num2 + num3)/3 ;
		
		System.out.print("The Average of above three numbers is : " + Average);
		
		input.close();
		
	}
}
