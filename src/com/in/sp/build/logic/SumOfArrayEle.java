package com.in.sp.build.logic;

import java.awt.SecondaryLoop;
import java.util.Iterator;

public class SumOfArrayEle {
   static int  sum=0;
   
	public static int sumOfele(int[] a) {
//		for(int i=0;i<a.length;i++) {
//			 sum=sum+a[i];		
//		}
		//SecondaryLoop
		
		for(int val:a )
			sum=sum+val;
		return sum;
		}
	public static void extractOddEvenInArr(int[] b) {
		int even=0;
		int odd=0;
//		for(int i=0;i<b.length;i++) {
//			if(b[i] %2==0) {
//				even=even*10+b[i];
//			}
//			else {
//				odd=odd*10+b[i];
//			}
		
		//second type for loop
		for(int val:b) {
			if(val%2==0) {
				
				even=even*10+val;
				
			}else {
				odd=odd*10+val;
			}			
		}
		System.out.println("even number =  "+even+"  \n odd number= "+odd);
	}
	
public static void main(String[] args) {
	int[] aaq= {1,2,3,4,5,6,4,1};	
	SumOfArrayEle af=new SumOfArrayEle();
			
	System.out.println(sumOfele(aaq));
	
     extractOddEvenInArr(aaq);

	}	
	}

