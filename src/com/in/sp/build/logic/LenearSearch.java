package com.in.sp.build.logic;

import java.io.DataOutput;
import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.security.spec.ECPrivateKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.xml.transform.Source;

public class LenearSearch {

	public static  boolean LeaSearch(int[] arr) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no what youn sear");
		boolean p = false;
	int search_num = scanner.nextInt();
	
	for(int i=0 ; i<arr.length-1;i++) {
		if(arr[i]== search_num) {
			
		p=true;
		break;
		}else {
		  p=false;
		}
	}
	return p;	
	}
	public static int BinarySearch(int a[],int target) {
		//it is use for both increament and decreament ordered
		int left=0;
		int right=a.length-1;
		
		if(a.length==0) {
			return -1;
			
		}
		boolean check=a[left]<a[right];
		
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(target==a[mid]) {
				return mid;
			}
			if(check) {
				if(target<a[mid]) {
					right=mid-1;					
				}else if (target>a[mid]) {
					left=mid+1;
				}
				}else {
					if(target<a[mid]) {
						left=mid+1;
					}else if (target>a[mid]) {
						right=mid-1;
					}
				}			
		}
		
		return -1;
	}
	public static void SelectionSort(int arr[]) {
		
		
		for(int i=0;i<arr.length-1;i++) {
			int last=arr.length-i-1;
			System.out.println( Maxi(arr,0,last));
			
		int a=	Maxi(arr,0,last);
			Swap(arr,a,last);
			System.out.println(Arrays.toString(arr));
		}
	}
	public static int Maxi(int a[],int start,int last) {
		int index=start;
		for(int i=start;i<=last;i++) {
			
			if(a[index]<a[i]) {
			 index=i;	
			}
		}
		return index;
	}
	public static void Swap(int[] ar,int max,int last) {
	
		int temp=0;
		temp=ar[max];
		ar[max]=ar[last];
		ar[last]=temp;
		
	}
	
	public static void insertionSort(int arr[]) {
	   
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					Swap(arr, j, j-1);
				}else {
					break;
				}
			}
		}
	
	}
	
	public static void cyclicSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int correct=arr[i]-1;
			System.out.println(correct);
			if(arr[i]!=(correct)) {
				int temp=0;
				temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
		}
	}
	public static List<Integer> misingNumInCyclic(int[] arr) {

		int  i=0;
		while(i<arr.length){
			int correct=arr[i]-1;
			if( arr[i]!=arr[correct]) { 
				int temp=0;
				temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
				
			}else {
				i++;
			}
		}
		List<Integer> solution=new ArrayList<>();
		for( i=0;i<arr.length;i++) {
			
			if(arr[i]!=i+1) {
				solution.add(i+1);				
			}
		}return solution;
		
	
	}
	
	 public static int findDuplicate(int[] nums) {
		 int  i=0;
			while(i<nums.length){
				if(nums[i]!=i+1) {
				int correct=nums[i]-1;
				if( nums[i]!=nums[correct]) { 
					int temp=0;
					temp=nums[i];
					nums[i]=nums[correct];
					nums[correct]=temp;
					}else {
					return nums[i];
				}
				
			}else {
				i++;
			}
			}
			return -1;
	 }

	 public static int[] findErrorNums(int[] nums) {

			int  i=0;
			while(i<nums.length){
				int correct=nums[i]-1;
				if( nums[i]!=nums[correct]) { 
					int temp=0;
					temp=nums[i];
					nums[i]=nums[correct];
					nums[correct]=temp;
					
				}else {
					i++;
				}
			}
			//List<Integer> solution=new ArrayList<>();
			for( i=0;i<nums.length;i++) {
				
				if(nums[i]!=i+1) {
//					solution.add(arr[i]);
					return new int []{nums[i],i+1};
				}
			}
			return new int []{-1 ,-1};
			
		
		}
	 public static int firstMissingPositive(int[] nums) {

			int  i=0;
			while(i<nums.length){
				int correct=nums[i]-1;
				if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) { 			
					Swap(nums, i, correct);
				}else {
					i++;
				}
			}
			for( i=0;i< nums.length;i++) {
				
				if(nums[i]!=i+1) {
					return i+1;				
				}
			}return nums.length+1;
			
		
		}
	public static void main(String...strings ) {
		int[] arr= {1,34,54,2,64,4,5};
		int[] ar= {5,3,4,1};
		//int[]a= {4,3,2,7,8,2,3,1};//5,6
	//	int[]a= {4,3,2,7,8,2,3,1};//1(0),2(1),3(2),4(3),2(4) missing no.
		int[] a= {1};
		//	System.out.println(" false not present || true then presernt  \n this is out come  ="+ LeaSearch(arr));
	//int t=9;
//	int a= BinarySearch(arr, t);
//	System.out.println("index =="+a);
	//SelectionSort(arr);
//	insertionSort(arr);
//	System.out.println(Arrays.toString(arr));
//	cyclicSort(ar);
//	System.out.println(Arrays.toString(ar));
//int aab=	misingNumInCyclic(a);
//System.out.println(aab);
//	
//	System.out.println(	misingNumInCyclic(a));
//	System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a));
//		System.out.println( findDuplicate(a));
//		System.out.println(	Arrays.toString( findErrorNums(a)));
//		System.out.println(Arrays.toString(a));
	int b=	firstMissingPositive(a);
	System.out.println(b);
	System.out.println(Arrays.toString(a));
	
		
	
	
	}
}
