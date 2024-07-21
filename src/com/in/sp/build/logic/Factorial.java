package com.in.sp.build.logic;

public class Factorial {

	public static void main(String[] ar) {
		int fac=3;
		long f=1;
		int i=1;
//		for(int i=1;i<=fac;i++) {
//			f=f*i;		
//		}
//		System.out.println(f);
		
		//second approch
		
/*		while(fac!=0) {
			f=f*fac;
			fac--;
		}
		System.out.println(f);*/
		
		while(i!=fac+1) {
			f=f*i;
			i++;
		}
		System.out.println(f);
	}
}
