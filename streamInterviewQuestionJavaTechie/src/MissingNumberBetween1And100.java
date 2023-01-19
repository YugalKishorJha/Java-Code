import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class MissingNumberBetween1And100 {
	public static void main(String[] args) {
		int ar[] = new int[100];

		for (int i = 0; i < 100; i++) {
			ar[i] = ((int) (Math.random() * 100));
		}

		ArrayList<Integer> al = new ArrayList<>()

		{
			{
				add(10);
				add(30);
				add(50);
				add(10);

			}
		};

//		HashSet s1 = new HashSet(Arrays.asList(ar));
//		System.out.println(s1);

		HashSet hs = new HashSet<>();
		System.out.println(hs);
		Collections.addAll(hs, ar);
		

		System.out.println(hs);
	}

}
