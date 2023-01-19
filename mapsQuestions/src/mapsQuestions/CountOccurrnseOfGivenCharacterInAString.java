package mapsQuestions;

public class CountOccurrnseOfGivenCharacterInAString {

	public static void main(String[] args) {
		String word="silvia";
		char targetCharacter='s';
		int count=0;
		
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
			if(ch==targetCharacter)
				count++;
		}
		
		
		System.out.println("The number of "+targetCharacter+" in given word is "+ count);

	}

}
