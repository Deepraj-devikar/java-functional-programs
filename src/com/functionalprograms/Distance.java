package com.functionalprograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		System.out.println("Wecome to Distance Program");
		
		Scanner scanner = new Scanner(System.in);
		// INPUT two numbers X and Y
		int x = 0;
		System.out.print("Enter X number : ");
		x = scanner.nextInt();
		int y = 0;
		System.out.print("Enter Y number : ");
		y = scanner.nextInt();
		
		System.out.println("You entered X and Y numbers are "+x+", "+y+" respectively. ");

	}

}
