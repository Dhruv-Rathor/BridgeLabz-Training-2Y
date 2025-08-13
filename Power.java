package practice;

import java.util.Scanner;

public class Power {
	public static void main (String[]args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Base : ");
		double Base = input.nextDouble();
		
		System.out.print("Enter Exponent : ");
		double Exponenent = input.nextDouble();
		
		double Power = Math.pow(Base, Exponenent);
		
		System.out.print("Power will be : " + Power);
		
		input.close();
		
		
	}

}
