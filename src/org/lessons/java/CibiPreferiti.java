package org.lessons.java;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		String[] piatti = {"pizza", "pasta", "zuppa di cozze", "lasagna", "tonno", "sushi"};
		
		int piattiLng = piatti.length;
		String bestFood = piatti[0];
		String worstFood = piatti[piattiLng - 1];
		
		System.out.println("Numero cibi preferiti: " + piattiLng);
		System.out.println("Cibo preferito: " + bestFood);
		System.out.println("Cibo (quasi) preferito: " + worstFood);
		
	}
		
}
