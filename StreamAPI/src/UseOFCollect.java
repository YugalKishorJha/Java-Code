import java.util.List;
import java.util.stream.Collectors;

public class UseOFCollect {
	public static void main(String[] args) {
		
		List<Integer> ll= List.of(10,20,30);
		
		List<Double> sqList= ll.stream().map(x->Math.pow(x,2)).collect(Collectors.toList());
		System.out.println(sqList);
	}

}
