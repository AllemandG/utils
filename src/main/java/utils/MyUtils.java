package utils;

import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {
	
	private MyUtils () {
		
	}
	
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
	
	public static String emptyToNull (String s) {
		if (s == null || s.isEmpty()) {
			return null;
		}else {
			return s;
		}
	}
	
	public static List<Integer> filterEvenNumber (List<Integer> list) {
		if (list == null)
			return Arrays.asList();
		
		return list.stream()
				.filter(x -> (x != null) && ((x.intValue() % 2) == 0) )
				.collect(Collectors.toList());
	}
	
	public static List<Float> transformSquarePlusPointFive (List<Integer> list) {
		if (list == null)
			return Arrays.asList();
		
		return list.stream()
				.filter(x -> x != null)
				.map(x -> (float)((x.floatValue() * x.floatValue()) + 0.5) )
				.collect(Collectors.toList());
	}
}
