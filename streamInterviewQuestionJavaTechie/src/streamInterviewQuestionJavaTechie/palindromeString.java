package streamInterviewQuestionJavaTechie;

import java.util.stream.IntStream;

public class palindromeString {

	
	public static void main(String[] args) {
		String str="121";

		if(IntStream.range(0,str.length()-1/2).noneMatch(intStreamNumbers->str.
				charAt(intStreamNumbers)/*first char*/!=str.charAt(str.length()-1-intStreamNumbers)/*last char*/))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not a palindrome");
	}

}




