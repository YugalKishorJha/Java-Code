import java.util.Arrays;

public class Test12 {

	public static void main(String[] args) {
		int ar[] = { 1, 3, 5, 6, 3,6 };
		int result[] = new int[ar.length];
		int k = 0;

		for (int i = 0; i < ar.length; i++) {
			int counter = 0;
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i] == ar[j])
					counter++;
			}
			if (counter == 0)
				result[k++] = ar[i];

		}
		
	System.out.println(Arrays.toString(result));
	int[] endResult = Arrays.stream(result).filter(x->x!=0).toArray();
	System.out.println(Arrays.toString(endResult));

	}

}
