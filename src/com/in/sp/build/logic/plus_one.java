package com.in.sp.build.logic;

import java.math.BigInteger;
import java.util.Iterator;

import javax.print.attribute.standard.JobOriginatingUserName;

public class plus_one {

	public static int[] kk(int[] digit ) {
	   for(int i=digit.length-1;i>=0;i--) {
		   if(digit[i]<9) {
			   digit[i]++;
			   return digit;
		   }
		   digit[i]=0;
	   }
	   int[] Newdigit=new int[digit.length+1];
		 Newdigit[0]+=1;
		 
		return Newdigit;
	}

 
 public static int[] searchRange(int[] nums, int target) {
        
	 int[] ar= {-1,-1};
	
	 for(int i=0;i<=nums.length-1;i++) {
		if(nums[i]==target) {
			ar[0]=i;
			break;
			}
		}
	  for(int i=nums.length-1;i>=0;i--) {
		  if(nums[i]==target) {
			  ar[1]=i;
			  break;
		  }
	  }
	 return ar;
    }
    
 public static int passThePillow(int n, int time) {
   int count=0;
	 if(n<time) {
		count=(n-((time%n)+1));;
		
		return count;
	 }else if (n>=time) {
		
		count=((time%n)+1);
		return count;
	}
	 
	 return 0;
 }
 public static int searchInsert(int[] nums, int target) {
     int leftP=0;
     int len=nums.length;
    	while(leftP<=len)	{ 
 	int mid = (leftP+(len-leftP)/2);
 	
 	if(nums[mid]== target) {
 		return mid;
 	}
 	else if(nums[mid]>target) {
 		len=mid-1;
 		
 	}
 	else {
		leftP=mid+1;
	}
 	}
    	return leftP;
 }
	
 public static String multiply(String num1, String num2) {
    long a1=0,a2=0;
    int i=0,j=0;
     if(num1.length()=='0' && num2.length()=='0') {
    	
    	 return "0";
     }
     while(j<num1.length()) {
    	 char dig1=num1.charAt(j);	
    	 if(dig1<='9'&& dig1>='0') {
    		 a1=a1*10+(dig1-'0');    		
    	 }
    	 j++;
     }  	 
	 while(i<num2.length()) {	
	 char dig2=num2.charAt(i);	
	 if(dig2<='9'&& dig2>='0') {
		 a2=a2*10+(dig2-'0'); 
		
	 }
	     i++;	    
	 }	
	 long aa=0;
//	aa= a1*a2;  
	 String A=Long.toString(a1*a2);  
     return A;
 }
 public static int mySqrt(int x) {
     
	 if(x==0 || x==1) { 
		 return 1;
	 }
	 int i=1 , re=1;
	 while(re<=x) {
		 i++;
		re=i*i; 
	 }
	 return i-1;
	 
 }
	
	public static void main(String[] args) {
		//int[] arr= {1};
		//int[] a=kk(arr);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}
		
	//	int tr=1;
	//	int a=searchInsert(arr, tr);
		// int[] a= searchRange(arr, tr);
	//	 System.out.println(a[0]+"  "+ a[1]);
		//********
	//	int n=18;
	//	int t=38;
	//	int a=0;
		//a=passThePillow(n, t);
	//	System.out.println(a);
		//System.out.println((t%(n-1)+1));
		
		
//	String a=	multiply("1234567891232434","9876543234232331");
//		System.out.println(a);
		int x=12;
		int a=mySqrt(x);
		System.out.println(a);
	}
}
