package utils;

import java.util.*;

public class MyDivisible {
	private MyDivisible () { }
	
	/*
	 * Fonction qui calcule si un nombre (candidat) est divisible par 3 et/ou 5,
	 * et qui renvoie une liste de ses diviseur.
	 * Si la liste est vide il n'est divisible par aucun des deux.
	 */
	public static List<Integer> estDivisiblePar3par5OuLesDeux (int candidat) {
		List<Integer> list = new ArrayList<Integer>();
		
		if (candidat == 0)// pas besoin de vérifier
			return list;
		
		if (candidat % 3 == 0)// divisible par 3
			list.add(3);
		
		if (candidat % 5 == 0)// divisible par 5
			list.add(5);
		
		return list;
	}
}
