
public class ToggletheCharactersInString {

	public static void main(String[] args) {

		String st = "ahis is GoIng gooD";
		char ch[] = st.toCharArray();

		/*
		 * for (char c : ch) {
		 * 
		 * if(c>='a'&&c<='z') c=(char)(c-32);
		 * 
		 * else if(c>='A'&&c<='Z') c=(char)(c+32); }
		 */

		
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				ch[i] = (char) (ch[i] - 32);

			else if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);
		}

		st = new String(ch);
		System.out.println(st);

	}

}
