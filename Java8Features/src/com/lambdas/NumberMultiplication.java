package com.lambdas;

import java.util.Scanner;

public class NumberMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int total = 0;
		
		for(int i= 0; i< number; i++) {
			if ((i % 3 ==0) || ((i % 5 ==0))) {
				 total +=i;
			}
		}

		System.out.println("Sum of all the multiples of 3 and 5 below given number : "+total);
		sc.close();
	}

}
