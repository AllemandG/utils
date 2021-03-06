package utils;

import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {
	
	private MyUtils () {
		
	}
	
	public static int sum (List<Integer> liste) {
		if (liste == null)
			return 0;
		
		return liste.stream()
				.filter(Objects::nonNull)
				.mapToInt(Integer::intValue)
				.sum();
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
				.filter(Objects::nonNull)
				.map(x -> (float)((x.floatValue() * x.floatValue()) + 0.5) )
				.collect(Collectors.toList());
	}
}
