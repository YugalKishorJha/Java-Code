import java.util.*;

public class test1 {

	public static void main(String[] args) {
		Comparator<Integer> cm= (x, y)-> x<y?0:-1 ;
		
		
		Integer ar[]= {5,2,3,1,4,52};
		Arrays.sort(ar,cm);
		System.out.println(Arrays.toString(ar));
	}

}
