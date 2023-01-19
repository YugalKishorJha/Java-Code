
public class countCharactersInStringWithoutUsingLength {

	public static void main(String[] args) {
		
		String s= "This is a fun Session";
		char[] ch=s.toCharArray();
		int count=0;
		
		for (char c : ch) {
			count++;
		}
		System.out.println("the no of characters in the String is "+count);
		
		
	}

}
