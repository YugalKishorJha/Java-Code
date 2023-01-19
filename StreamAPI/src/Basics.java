import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {

	public static void main(String[] args) {
		
		List<Integer> ll= List.of(1,2,3,4,5,6);
		List<Integer> resEven=new ArrayList<>();
		for (Integer i : ll) {
			if(i%2==0)
				resEven.add(i);
		}
		System.out.println(ll);
		System.out.println(resEven);
		
		
		Stream<Integer> st=ll.stream();
		List<Integer> ll1=st.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(ll1);
		
	}
	
	 

}
