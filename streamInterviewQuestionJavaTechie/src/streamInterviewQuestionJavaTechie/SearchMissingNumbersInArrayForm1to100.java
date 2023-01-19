package streamInterviewQuestionJavaTechie;

public class SearchMissingNumbersInArrayForm1to100 {

	public static void main(String[] args) {
		int[] ar = new int[100];
		int no=1;

		for (int i = 0; i < ar.length; i++) {
			if (i%2 ==0)
				continue;
			else
				ar[i] = no++;
		}
// need to find missing numbers
	}

}
