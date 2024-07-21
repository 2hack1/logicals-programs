package com.in.sp.build.logic;

import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class RevString {

	static public void main(String... aa) {
		
		Scanner s=new Scanner(System.in) ;
			System.out.println("enter your  name");
		String ss=s.nextLine();
/*		
	int	 len=ss.length();
	String rev="";
	
	for(int i=len-1;i>=0;i--) {
		rev=rev+ss.charAt(i);
		
	}
	System.out.println(rev);*/
		
		//2. Using Character array
		
/*	String rev=" ";
	char[] a=ss.toCharArray();
	int len=a.length;
	System.out.println(len);
	for(int i=len-1;i>=0;i--) {
	rev=rev+a[i];
	
	}
	System.out.println("Reverse Strigs"+rev);*/
		
		
	//3. Using String Buffer class
		
		StringBuffer obj=new StringBuffer(ss);
		System.out.println(obj.reverse());
		
	}
}
