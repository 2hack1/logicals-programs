package com.in.sp.build.logic;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;

import javax.swing.text.Highlighter.Highlight;

public class Solution {

	    public static double findMedianSortedArrays(int[] num1, int[] num2) {
	        
	        int len1=num1.length;
	        int len2=num2.length;
	        int[] num3=new int[len1+len2];
	        byte i=0;
	        byte j=0;
	        byte k=0;
	        double aa=0;
	        while(i<len1){
	            num3[k++]=num1[i++];
	        }
	        while(j<len2){
	            num3[k++]=num2[j++];
	        }
	        Arrays.sort(num3);
	        System.out.println(Arrays.toString(num3));
	        if((len1+len2)%2!=0){
	        aa=	num3[(len1+len2)/2];	          	          
	        }else{
	           int len_sum= (len1+len2)/2;
	           System.out.println(len_sum);
	            aa=(double)(num3[len_sum] + num3[len_sum-1])/2;
	        }
	        return aa;
	    }
	    
	    public static boolean isPalindrome(int x) {
	        int num1=x;
	        long rev=0;
	      int a=0;
	        
	        while(num1!=0){
	         	          
	           rev=rev*10+(num1%10);
	           System.out.println(rev);
	           num1=num1/10;
		      
		       
	           
	        }
	        a=(int)rev;
	        System.out.println(a);
	       
//	        System.out.println(rev);
	        if(x==rev && x>=0){
	            return true;
	        }else if(x!=rev ){
	            return false;
	        }else {
	        	return false;
			}
			
	    }
	    public static long reverse(int x) {

	        int num1=x;
	 	      long rev=0;
	          
	 	        
	 	        while(num1!=0){
	 	         	          
	 	           rev=rev*10+(num1%10);
	 	           num1=num1/10;
	             //  a=(int)rev;
	                
	 	        }
	             return (int)rev;
	     
	     }
	        public static int maxArea(int[] height) {
	         
	        	int l=0;
	        	int r=height.length-1;
	        	int max=0;
	        	while(l<r) {
	        	int lh=height[l];
	        	int rh=height[r];	
	        	int min=Math.min(lh, rh);
	        
	        	max=Math.max(max, min*(r-l));
	        	if(lh<rh)l++;
	        	else r--;
	        	}
	        	return max;
	        }
	       
	        
	            public static int removeDuplicates(int[] nums) {
	                // If the array is empty, there are no duplicates to remove, so return 0
                  if(nums.length==0) {
                	  return 0;
                  }
                  byte k=1;
                  for(int j=1; j<nums.length;j++) {
                	  
                	  if(nums[j]!= nums[k-1]) {
                		  nums[k]=nums[j];
                		  k++; 
                	  }
                	 
                  }
                  return k;
	            }
	        
	            public static int removeElement(int[] nums, int val) {
	                
	                if(nums.length==0 || nums.length==1 ) {
	                      	  return 0;
	                        }
	                       int k=0;
	                        for(int j=0; j<nums.length-1;j++) {
	                      	  
	                      	  if( nums[j]!=val) {
	                      		nums[k]=nums[j];
	                  		  k++; 
	                      		
	                      	  }
	                      	 
	                        }
	                       	  
	                        return k;
	          }
	   
	        public  static void main(String[] arse) {
	        	int[]s={1,2,3};
	        	int[]ss= {5,6,7};
//	        	System.out.println(reverse( 1534236469));
//	        	System.out.println(isPalindrome(153));
//	        System.out.println(findMedianSortedArrays(s,ss));
	        	int[] arr= {1,1,3,4,6,2,1};
//	        	System.out.println(maxArea(arr));
//	        	System.out.println(removeDuplicates(arr));
	        	System.out.println(removeElement(arr,1));
	        
	        	
	        }	    
}