import java.util.ArrayList;
import java.util.List;

public class FinalArrayListChecking {
	public static void main(String[] args) {
		final List<Integer> ll = new ArrayList<>() {
			{

				add(10);
				add(20);
				add(30);
				add(40);
				add(50);

			}
		};

		ll.add(60);
		ll.add(70);

		System.out.println(ll);

		ll.add(60);
		ll.add(70);
		ll.add(60);
		ll.add(70);

		ll.add(60);
		ll.add(70);

		ll.add(60);
		ll.add(70);

		ll.add(60);
		ll.add(70);

		ll.add(60);
		ll.add(70);

		ll.add(60);
		ll.add(70);

		System.out.println(ll);
		
		//final list is able to grow;
		List<Integer> of = List.of(10,20,74,65);
//		ll=of; but not able to get referenced by the new list

	}

}
