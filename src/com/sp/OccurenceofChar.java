package com.sp;

public class OccurenceofChar {
	
	public static void main (String[] args) {
		String s1 = "java java selenium";
		int counter[] = new int[256];
		
		for(int i = 0; i<s1.length(); i++) {
			counter[(int) s1.charAt(i)]++;
		}
		
		for(int i = 0; i < 256; i++) {
			if(counter[i] !=0) {
				System.out.println((char)i + " occurs " + counter[i] + " times");
			}
		}
		
		
	}
}
