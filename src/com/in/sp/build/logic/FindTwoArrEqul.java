package com.in.sp.build.logic;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class FindTwoArrEqul {
	
	public static void qualTwoArr1() {
		
		 int[] arr1= {1,2,3,5,6,7};
		 int[] arr2={1,3,3,5,6,7};
		 if(arr1.length==arr2.length) {
			 
			 for(int i=0;i<arr1.length;i++) {
				 if(arr1[i]==arr2[i]) {
					 System.out.println("both are same  "+arr1[i]+" == "+arr2[i]);					 
										
				 }else {
					System.out.println("but both are not same  "+arr1[i]+" == "+arr2[i]+"\n array are not equal");
					
					break;
				}
				 
			 }
			}else {
				
					 System.out.println("both are not  same ");
			}
	}
	public static void qualTwoArr2() {
		 int[] arr1= {1,2,3,5,6,7};
		 int[] arr2={1,3,3,5,6,7};
		
		boolean a=Arrays.equals(arr1,arr2);
		if(a==true) {
			System.out.println("both are same");
			
		}else {
			System.out.println("both are not equal");
		}
	}
	
	public static void missingNoArr() {
		int[] a= {1,3,4,5};
		int num1=0;
		for(int i=0; i<=a.length-1;i++) {
			num1 =num1+a[i];
		}
		
		int num2=0;
		for(int i=0;i<= a[a.length-1];i++) {
			num2= num2 + i;
		}
		num2=num2-num1;
		System.out.println(num2);
	}
	public static void maxMinNumArr() {
		int[] arr = {2,5,2,5,9,3,2,10,4,1,7,8};
		int max=0;
		int min=0;
		for(int i=0;i<=arr.length-1;i++) {
			int j=1;
			if(arr[i]>arr[j]) {
				max=arr[i];
				
				arr[j]=arr[i];
				j++;
			}else {
		      max=arr[j];
		    
				j++;
			}
			
		}
		System.out.println("max value  ="+max);
		
		for(int i=0;i<=arr.length-1;i++) {
			int j=1;
			if(arr[i]<arr[j]) {
				
				min=arr[i];
				arr[j]=arr[i];
				j++;
			}else {
				min=arr[j];
				j++;
			}
		}
	System.out.println("minimum value  = "+min);
	}
	
	public static void duplicateEle() {
	/*	int[] arr = {2,5,2,5,9,3,2,10,4,1,7,8};
		int dup=0;
		
		for(int i=0;i<=arr.length-1;i++){
			int j=1;
			if(arr[i]==arr[j]) {
			dup=dup*10+arr[i];
			dup=dup*10+arr[i];
			
				arr[i]=arr[i+1];
				j++;
				j++;
			}else {
				j++;
			}						
		}
		System.out.println(dup);
		for(int i=0;i<=arr.length-1;i++) {
		System.out.print(","+arr[i]);	
		}*/
		
		int[] arr = {2,5,2,5,9,3,10};
		int dup=0;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length-i;j++) {				
				if(arr[i]==arr[j]) {
					
				dup=dup*10+arr[i];
				System.out.println(dup);
				
				}else {
					System.out.println("nothing");
				}
				
			}System.out.println(dup);
		for(int i=0;i<=arr.length-1;i++) {
				System.out.print(","+arr[i]);	
			}
	}
	 static public void main(String[] args) {
		
//		qualTwoArr1();
//		qualTwoArr2() ;
//		 missingNoArr();
//		 maxMinNumArr();
		 duplicateEle();
		 }
}

