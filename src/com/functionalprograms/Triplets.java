package com.functionalprograms;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		System.out.println("Welcome To Triplets Program");

		Scanner scanner = new Scanner(System.in);
		// INPUT size of array
		int N = 0;
		System.out.print("Enter size of array : ");
		N = scanner.nextInt();
		
		System.out.println("You have to enter "+N+" numbers. ");
		
		// Array Creation
		int[] array = new int[N];
		
		// Read Values for array
		System.out.println("Enter values to array");
		for (int n = 0; n < N; n++) {
			System.out.print("Enter value for "+n+" : ");
			array[n] = scanner.nextInt();
		}
		
		System.out.print("You enterd array is ");
		// Show Values in Array
		for (int n = 0; n < N; n++) {
			System.out.print(array[n]+"\t");
		}
		System.out.println("");
		
		if (N < 3) {
			System.out.println("number of distinct tripltes is 0");
		}
	}

}
