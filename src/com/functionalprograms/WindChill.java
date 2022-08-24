package com.functionalprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("Welcome To Wind Chill Program");
		
		Scanner scanner = new Scanner(System.in);
		// INPUT temprature t and wind speed v
		double t = 0;
		System.out.print("Enter temprature t in faranhite : ");
		t = scanner.nextDouble();
		double v = 0;
		System.out.print("Enter wind speed v in miles per hour : ");
		v = scanner.nextDouble();
		
		System.out.println("You entered temprature t is "+t+" and wind speed v is "+v);

	}

}
