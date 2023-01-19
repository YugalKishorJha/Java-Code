
public class RemoveAllCharactersFromStringExceptAlphabets {

	public static void main(String[] args) {
		
		String s="yugal is goo^&*(d boy585@6";
		String result="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
				result=result+ch;
		}
		System.out.println(result);
	}

}
