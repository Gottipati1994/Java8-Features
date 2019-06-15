package com.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	// ************* using java 7***************************
	/*
	 * public static int square(int n) { return n*n; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Squareroot of 5:-"+ square(5));
	 * System.out.println("Squareroot of 8:-"+ square(8));
	 * 
	 * }
	 */
//**********************using java 8*********************************
	public static void main(String[] args) {
		
// ********for square root *************************
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("Squareroot of 50:" + f.apply(50));
		System.out.println("Squareroot of 80:" + f.apply(80));
		
		// ******for even or odd **********************
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(5));
		System.out.println(p.test(6));
	}
}
