package com.in.sp.build.logic;

import java.util.Arrays;

public class Boubble_Sort {

	public static void boubleSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
	int n =arr.length;	
for(int i=0;i<n-1;i++) {
	for(int j=0;j<n-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
	
}
System.out.println(Arrays.toString(arr));
					 
	}	
	public static void main(String   ...strings) {
		              
		int[] arr= {4,3,5,2,6,9,8,1};
		boubleSort(arr);
	}
}
