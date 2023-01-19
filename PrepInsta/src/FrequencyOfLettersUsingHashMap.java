import java.util.HashMap;

public class FrequencyOfLettersUsingHashMap {

	public static void main(String[] args) {

		String s = "aabsj is my name ";
		char ch[] = s.toCharArray();

		HashMap<Character, Integer> hs = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {

			if (hs.containsKey(ch[i]))
				hs.put(ch[i], hs.get(ch[i]) + 1);
			else
				hs.put(ch[i], 1);

		}

		System.out.println(hs);

	}

}
