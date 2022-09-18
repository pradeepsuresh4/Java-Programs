package com.sp;

import java.util.Scanner;

public class swappingwithout {

	public static void input() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter X and Y");
		int X = s.nextInt();
		int Y = s.nextInt();
		System.out.println("Before Swapping X and Y: "+ X + Y);
		X = X + Y;
		Y = X - Y;
		X = X - Y;
		System.out.println("After Swapping X and Y: " + X + Y);
	}
	
	public static void main (String [] args) {
		
		input();
		
	}
	
	
	
}
