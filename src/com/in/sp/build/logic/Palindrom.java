package com.in.sp.build.logic;

import java.util.Scanner;

public class Palindrom {

	static public void main(String... args ) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number than after revers and check palindrom or not");
	 int num=ss.nextInt();
	 int org_num=num;
	 int rev=0;
	 while(num!=0) {
		 
		 rev=rev*10+num%10;
		 num=num/10;
	 }
	 System.out.println(rev);
	 if(org_num==rev) {
		 System.out.println("its palindrom"+"\n"+"original no is"+org_num+"\n"+"revers no"+rev);
	 }else {
		 System.out.println("its not palindrom"+"\n original no is"+org_num+"\n revers no"+rev);

	}
	 
	}
}
