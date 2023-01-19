import java.util.*;

public class prac1 {

	public static void main(String[] args) {
		
		String s= "hvsih";
		char ch[]=s.toCharArray();
		
		TreeMap<Character, Integer> hs= new TreeMap<>();
		
		
		for (char c : ch) {
			if(hs.containsKey(c))
				hs.put(c, hs.get(c)+1);
			
			else
				hs.put(c,1);
		}
		
		System.out.println(hs);

	}

}
