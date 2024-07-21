package com.in.sp.build.logic;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class ReversNum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no ");
		int aa=s.nextInt();
		//******* first*********
	//int	rev=0;
	/*	while(aa !=0) {
			
			rev=rev*10 +aa%10;  
			aa=aa/10;
		}
		System.out.println(" no is ="+rev); */
	
	
	//********second********
	
/*	StringBuffer kk=new StringBuffer(String.valueOf(aa));
	StringBuffer rev=kk.reverse();
	System.out.println("no is ="+rev); */
		
		//*********third type********
		
		StringBuilder a=new StringBuilder();
		a.append(aa);
	StringBuilder rev=a.reverse();
	
	System.out.println("this num is ="+rev);
	}

}
