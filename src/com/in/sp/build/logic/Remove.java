package com.in.sp.build.logic;


public class Remove {
	public static void countWord() {
		String str="kapil main tu aur kon aur bo ";
		byte count=1;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ' )&& (str.charAt(i+1)!=' ')){
				count++;
			}
		}System.out.println("Totle Word present =="+count);
	}
	public static void main(String... args) {
	String str="kapul        ksgs          ksdjglkd             dhfiue    sdojiodf";
	byte aa=(byte)str.length();
	//str=str.replaceAll("\\s","");//removing space 
	byte a=(byte)str.replaceAll("k","").length();
	System.out.println("totals of k's in the present"+(a-aa));
	countWord();
	
}
}