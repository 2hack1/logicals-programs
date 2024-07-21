package com.in.sp.build.logic;

import java.security.PublicKey;

public class Fibonaci {

	public static void main(String[] args) {
		fibona(5);
		}
	public static void fibona(int a) {
	
		int b=0;
		int bb=1;
		for(int aa=0; aa<=a;aa++) {
			
			if(b==0||bb==1) {
				System.out.println(b);
				System.out.println(bb);
				
			}
				System.out.println(b);
				System.out.println(bb);
				b=b+bb;
				bb++;
			
			
			
		}
			
	}
}
