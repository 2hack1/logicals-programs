package com.in.sp.build.logic;

public class CheckVowels {

	public static void main(String[] args) {
	System.out.println(checkV("HEillO"));
	System.out.println(checkV("tv"));
	}
	public  static boolean checkV(String in) {
	return in.toLowerCase().matches(".*[aeiou].*");
	}
}
