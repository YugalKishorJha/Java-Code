
public class RemoveVowels {

	public static void main(String[] args) {

		String st = "Yugal is a good boy";
		char ch[]= st.toCharArray();
		/* Only Valid Solution */
		
		//System.out.println(st.replaceAll(st, ""));  Dosen't work
		System.out.println(st.replaceAll("[aeiouAEIOU]", ""));
		
		
		
		
		/* Does'nt work */

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
				ch[i] = '\u0000';
		}


		st = new String(ch);
		//System.out.println(st);

		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U')
				;
			// c=""; casting issue
		}

	}

}
