import java.util.ArrayList;
import java.util.List;

public class CustomArrayListToRemoveDuplicate extends ArrayList {

	@Override
	public boolean add(Object o) {
		if (this.contains(o))
			return true; // dummy true doesnt does anyThing
		return super.add(o);
	}

	public static void main(String[] args) {
		CustomArrayListToRemoveDuplicate al = new CustomArrayListToRemoveDuplicate();
		al.add(10);
		al.add(00);
		al.add(10);
		al.add(120);
		al.add(1);
		al.add(1);

		System.out.println(al);

	}

}
