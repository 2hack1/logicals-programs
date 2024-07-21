package com.in.sp.build.logic;

public class Swap {

	public static void main(String[] args) {
	//**********first type swap******
		
		int a=10; int b=20;
//		System.out.println("a="+a+" b="+b );
//    //    =10+20-(b=10=>(b=20= a=10))
//		a=a+b-(b=a);
////        20+10-(b=20=>(b=10= a=20))
//		b=a+b-(b=a);
//		System.out.println("a="+a+" b="+b );
		
	//*********Second type swap***********
	/*	System.out.println("a="+a+" b="+b );
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a="+a+" b="+b ); */
		
		
		//***********Type third************ 
		
		System.out.println("a="+a+" b="+b );
		//=10+20
		a=a+b;
		//=30-20
		b=a-b;
		//=30-10
		a=a-b;
		
		System.out.println("a="+a+" b="+b );
	}

}
