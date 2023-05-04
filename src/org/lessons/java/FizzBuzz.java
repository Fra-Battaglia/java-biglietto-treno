package org.lessons.java;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
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
	}
}
