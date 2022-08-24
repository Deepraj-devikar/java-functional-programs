package com.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Welcome To Quadratic Program");
		
		System.out.println("Quadratic equation format a*x*x + b*x + c");
		System.out.println("a, b and c are constants");
		
		Scanner scanner = new Scanner(System.in);
		// INPUT three numbers a, b and c
		int a = 0;
		System.out.print("Enter a number : ");
		a = scanner.nextInt();
		int b = 0;
		System.out.print("Enter b number : ");
		b = scanner.nextInt();
		int c = 0;
		System.out.print("Enter c number : ");
		c = scanner.nextInt();

		// Show Quadratic Equation
		System.out.println("You entered a, b and c values are "+a+", "+b+" and "+c+" respectively");
		System.out.println("And you entered quadratic equation is "+a+"*x*x + "+b+"*x + "+c);
	}

}
