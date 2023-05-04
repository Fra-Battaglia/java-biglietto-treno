package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] Guests = {
			"Dua Lipa", 
			"Paris Hilton", 
			"Manuel Agnelli", 
			"J-Ax", 
			"Francesco Totti", 
			"Ilary Blasi", 
			"Bebe Vio", 
			"Luis", 
			"Pardis Zarei", 
			"Martina Maccherone", 
			"Rachel Zeilic"
		};
		
		Scanner in = new Scanner(System.in);
		String name;
		
		System.out.println("Nome prego:");
		name = in.nextLine();
		in.close();
		
//		// CICLO FOR
//		
//		for (int i = 0; i < Guests.length; i++) {
//			if (name.equals(Guests[i])) {
//				System.out.println("Entra pure!");
//				
//				return;
//			}
//		}
//		
//		System.out.println("Non puoi entrare!");
		
		// CICLO WHILE
		
		int i = 0;
		while (i < Guests.length) {
			String Guest = Guests[i++];
			
			if (name.equals(Guest)) {
				System.out.println("Entra pure!");
				
				return;
			}
		}
		
		System.out.println("Non puoi entrare!");
		
	}
}
