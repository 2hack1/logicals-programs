package com.in.sp.build.logic;
import java.util.Scanner;

public class Palindrom_String {

   static public void main(String[] args) {
	   
	   Scanner aa=new Scanner(System.in);
	   System.out.println("Enter The String");
	   String str = aa.next();	   	   
	   String rev="";
	   
	  int len=str.length();
	   for(int i=len-1;i>=0;i--) {
		    rev=rev+str.charAt(i);		   
	   }		   
	   if(str.equals(rev)) {
		   System.out.println(rev+":  palindrom");
	   }
	   else {
		   
		   System.out.println(rev+" :  not palindrom");
	   }
   }
}
