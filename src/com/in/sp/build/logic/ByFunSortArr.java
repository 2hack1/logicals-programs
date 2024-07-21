package com.in.sp.build.logic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ByFunSortArr {

	public static void main(String... arString) {
		
		Integer[] arr= {9,5,3,6,2,7,1,8};
		System.out.println("befor sorting"+Arrays.toString(arr));
//	Arrays.parallelSort(arr);
//		Arrays.sort(arr);
	Arrays.sort(arr,Collections.reverseOrder());	
	System.out.println("arr of"+Arrays.toString(arr));
	}
	
}
