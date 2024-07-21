package com.in.sp.build.logic;

import java.util.Scanner;

public class BinarySearch {

	public static void binarySearch(int[] arr) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter searching no.");
		int search_no= scanner.nextInt();	
		   
		 if (search_no<=-1) {
			System.out.println("kapkil");
		}
	else if(search_no<arr[arr.length/2]) {
		  
	  	for(int i=arr.length/2;i>=0;i--) {
	  		if(arr[i]==search_no) {
	  			System.out.println("mill gai value lakin mid se chodi hai😁😁😁😁 ");
	  		}
	  	}
	  	
	}  else if(search_no>arr[arr.length-1])  {
		  System.out.println("badi value hai  please search 1 to 9 😅😅😅😅");
	}
	else if (search_no>arr[arr.length/2]) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==search_no) {
				System.out.println("mill gyi value lakin mid se badi hai😁😁😁😁😁");
			}
		}
	}else if (search_no==arr[arr.length/2]) {
		System.out.println("mill gyi value lakin mid main hai😁😁😁😁😁");
	}
	
	}
	
	static public void main(String   ...arg) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};	
		binarySearch(arr);
	}
}
