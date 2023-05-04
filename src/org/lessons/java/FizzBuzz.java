package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tot;
		
		System.out.println("Con quanti numeri vuoi giocare a FizzBuzz?");
		tot = in.nextInt();
		
		for (int i = 0; i < tot; i++) {
			int num = i + 1;
			
			// FizzBuzz
			if ( num % 3 == 0 && num % 5 == 0 ) {
				System.out.println("FizzBuzz");
				
			// Fizz
			} else if ( num % 3 == 0 ) {
				System.out.println("Fizz");
				
			// Buzz
			} else if ( num % 5 == 0 ) {
				System.out.println("Buzz");
				
			// i	
			} else {				
				System.out.println(i + 1);
			}
		}
		
		in.close();
	}
}
