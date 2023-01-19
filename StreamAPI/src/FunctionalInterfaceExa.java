import java.util.Arrays;

@FunctionalInterface
public interface FunctionalInterfaceExa {

	int[] sortingInteger(int[] a);

	static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		return a;
	}

	public static void main(String[] args) {

		int ar[] = { 2, 5, 1, 4, 50 };
//		FunctionalInterfaceExa mc = (a) -> sort(a);
		FunctionalInterfaceExa mc = FunctionalInterfaceExa::sort;

		System.out.println(Arrays.toString(mc.sortingInteger(ar)));
	}

}
