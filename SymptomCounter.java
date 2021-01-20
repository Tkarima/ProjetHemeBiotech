package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * @author Karima TELMOUN
 *
 */
public class SymptomCounter {
	/**
	 * counts occurrences
	 * 
	 * @param list : Arraylist type container. Contains each line read
	 * 
	 * @param map  : Object type Map<String, Integer>. parameters String -> key = w
	 *             ( words list) parameters Integer -> values = i ( occurrences )
	 * 
	 */
	public static void calculOcc(List<String> list, Map<String, Integer> map) {

		for (String w : list) {
			Integer i = map.get(w);
			if (i == null) {
				map.put(w, 1);
			} else {
				map.put(w, i + 1);
			}
		}

		System.out.println("Analysis ->  OK");
	}

}
