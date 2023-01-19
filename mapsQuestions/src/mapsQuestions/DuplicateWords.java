package mapsQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWords {
	public static void main(String[] args) {
		String name="aabcd";
		Map<Character, Integer> m= new HashMap<>();
		
		for (int i = 0; i < name.length(); i++) {
			char ch= name.charAt(i);
			if(m.containsKey(ch))
				m.put(ch, m.get(ch)+1);
			else
				m.put(ch,1);
		}
		System.out.println(m);
	}
	

}
