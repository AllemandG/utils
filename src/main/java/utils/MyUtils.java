package utils;

import java.util.*;

public abstract class MyUtils {
	
	public static int sum (List<Integer> liste) {
		int somme = 0;
		
		if (liste == null || liste.isEmpty()) {
			return somme;
		}
		
		Iterator<Integer> intIter = liste.iterator();
		
		while (intIter.hasNext()) {
			Integer i = intIter.next();
			if (i != null)
				somme += i;
		}
		
		return somme;
	}
	
	
}
