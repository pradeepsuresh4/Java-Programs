package com.sp;

import java.util.Scanner;

public class SwapWith {

	
	public void input() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter X Y");
		int X = s.nextInt();
		int Y = s.nextInt();
		int Z;
		System.out.println("BS: "+X + Y );
		Z = Y;
		Y = X;
		X = Z;
		System.out.println("AS: " +X + Y);
		s.close();
	}
	
	public static void main (String [] args) {
		SwapWith ss = new SwapWith();
		ss.input();
		
	}
}
