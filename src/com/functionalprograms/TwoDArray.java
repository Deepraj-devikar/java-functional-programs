package com.functionalprograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Welcome to 2 D Array Program");
		
		Scanner scanner = new Scanner(System.in);
		// INPUT number of rows M
		int M = 0;
		System.out.print("Enter number of rows : ");
		M = scanner.nextInt();
		// INPUT number of columns N
		int N = 0;
		System.out.print("Enter number of columns : ");
		N = scanner.nextInt();
		
		System.out.println("You have to enter "+M+" * "+N+" matrix");
		
		// 2 Dimentional Array Creation
		int[][] array = new int[M][N];
		
	}

}
