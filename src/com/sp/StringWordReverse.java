package com.sp;

public class StringWordReverse {
	public static void method(){
		String s1 = "pradeep suresh";
		String s2 = "";
		String [] s3 = s1.split(" ");
		for (String s4:s3) {
		for(int i = s3.length-1; i>=0; i--){
			String s5= s3[i];
			for (int j = s4.length()-1; j>=0; j--){
				char c = s4.charAt(j);
				s2 = s2+c;
	}
		String s6 = s2+ " ";
		System.out.print(s5);
	}
		}
		
	}

	public static void main (String [] args){
		method();

	}
	}

