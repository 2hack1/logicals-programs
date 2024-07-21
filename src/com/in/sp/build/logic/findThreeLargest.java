package com.in.sp.build.logic;

import javax.sql.rowset.JoinRowSet;

public class findThreeLargest {

	public static void main(String...strings) {
		int num1=110;
		int num2=342;
		int num3=2432432;
		
//		if(num1>num2 && num1>num3) {
//			System.out.println(num1);
//			
//		}else if(num2>num1 && num2>num3) {
//			System.out.println(num2);
//		}else {
//			System.out.println(num3);
//		}
		int ss=num1>num2 ?num1:num2;
		int ss1=num3>ss?num3:ss;
		System.out.println(ss1);
	}
}
