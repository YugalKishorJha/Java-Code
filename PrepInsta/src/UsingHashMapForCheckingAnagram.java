import java.util.HashMap;
import java.util.Set;

public class UsingHashMapForCheckingAnagram {

	public static void main(String[] args) {

		String s1 = "hitler woman";
		String s2 = "mother in law";

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		HashMap<Character, Integer> hs1 = new HashMap<>();
		HashMap<Character, Integer> hs2 = new HashMap<>();

		for (int i = 0; i < ch1.length; i++) {
			if (hs1.containsKey(ch1[i])) {
				System.out.println(hs1.get(ch1[i]) + 1);
				hs1.put(ch1[i], hs1.get(ch1[i]) + 1);
			} else
				hs1.put(ch1[i], 1);

		}
		System.out.println(hs1);

		for (int i = 0; i < ch2.length; i++) {
			if (hs2.containsKey(ch2[i]))
				hs2.put(ch2[i], hs2.get(ch2[i]) + 1);
			// giving runtime error
			else
				hs2.put(ch1[i], 1);

		}
		/* TO COMPARE TO AMP WE CAN USE THE EQUALS METHOD OF HASHMAP */

	}

}
