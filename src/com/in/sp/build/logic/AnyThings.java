package com.in.sp.build.logic;

import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

public class AnyThings {

	public static void main(String[] args ) {
		
		 int a=100;
	      int b=200;
	      System.out.println("a="+a+"   "+" b="+b);
	      a=a+b;//300
	      b=a-b;//300-200=100
	      a=a-b;//300-100=200
	      System.out.println("a="+a+"   "+" b="+b);
	}
}
