package practice;

import java.util.Scanner;

public class Distance_Conversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Distance in Kilometers : ");
		double km = input.nextDouble();
		
		double Miles = km * 0.621371;
		
		System.out.print("Distance in Miles is : " + Miles);
		
		input.close();
	}

}
