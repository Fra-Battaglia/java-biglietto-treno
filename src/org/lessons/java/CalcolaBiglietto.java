package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numKm;
		int age;
		
		System.out.println("Per Quanti Km vuoi viaggiare?");
		numKm = in.nextInt();
		
		float basePrice = numKm * 0.21f;
		float price = basePrice;
		
		System.out.println("Quanti anni hai?");
		age = in.nextInt();
		
		if (age < 18) {
			
			price = basePrice/100*80;
			System.out.println("Il prezzo del tuo biglietto è di " + price + '€');
			
		} else if (age > 65) {
			
			price = basePrice/100*60;
			System.out.println("Il prezzo del tuo biglietto è di " + price + '€');
			
		} else {
			
			System.out.println("Il prezzo del tuo biglietto è di " + price + '€');
			
		}
		
		in.close();
		
	}

}
