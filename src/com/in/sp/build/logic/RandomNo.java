package com.in.sp.build.logic;


import java.util.Random;

import javax.naming.StringRefAddr;

public class RandomNo {

	public static void main(String... strings ) {
		
		Random random=new Random();
		
		
		System.out.println( random.nextFloat(11));
		System.out.println(random.nextInt(100));
		System.out.println(Math.random());//no  Number lpa
	}
}
