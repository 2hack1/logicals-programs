package com.in.sp.build.logic;

import java.util.concurrent.CountDownLatch;

public class NumCounler {

	public static void main(String... args) {
		int num=312434244;
		byte count=0;
		int even=0;
		int odd=0;
	  int findLast=0;
	  int sumDig=0;
		while(num!=0) {

			findLast=num%10;
			sumDig=sumDig+findLast;
			num=num/10;	
			
			if(findLast%2==0)
			{
				even=even*10+findLast;
			}else {
				odd=odd*10+findLast;
			}
			count++;
		}
		System.out.println(count+"\n count="+even+"\neven="+odd+"\n sum of all digit="+sumDig);
	}
}
