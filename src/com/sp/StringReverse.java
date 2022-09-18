package com.sp;

import java.util.Scanner;

public class StringReverse {

	
	public static void input1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Word");
		String s1 = s.next();
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}

	}
	
	public static void input2() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String in = s1.nextLine();
		StringBuilder s2 = new StringBuilder();
		s2.append(in);
		s2 = s2.reverse();
		System.out.print(s2);
		s1.close();
	}
	
	public static void input3() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s2 = s1.nextLine();
		String [] s3 = s2.split(" ");
		s1.close();
		for(int i = s3.length-1; i>=0; i--) {
			System.out.print(s3[i] + " ");
		}
	}
	
	public static void input4() {
		String s = "pradeep has";
		String reverse = "";
		for (int i = s.length()-1; i>=0; i--) {
		reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse+ " ");
	}
		
	


	public static void main(String[] args) {
		input4();
	}
}
