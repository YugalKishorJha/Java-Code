
public class FindNonRepeatingCharactersInaString {

	public static void main(String[] args) {
		String s = "aab";
		char c[] = s.toCharArray();
		int count[] = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			count[i] = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] == c[j]) {
					count[i]++;
					c[j] = '0';
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			if(c[i] != ' ' && c[i] != '0') 
				System.out.println(count[i]);
		}
	}

}
