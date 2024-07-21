package com.in.sp.build.logic;


public class PrimeNumber {

 static public void main(String ...args ) {
		
		System.out.println(checkPrime(15));
		System.out.println(checkPrime(29));
	}
	public static boolean checkPrime(int aa) {
		if(aa==0||aa==1) {
			return false;
		}
		if(aa==2) {
			return true;
		}else {
			
			for(int i=2;i<=aa/2;i++) {
				if(aa%i==0) {
					return false;
				}
			}
			return true;
		}
			
		
	}
}
