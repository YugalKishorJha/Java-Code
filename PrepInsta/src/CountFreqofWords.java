import java.util.Comparator;
import java.util.HashMap;

public class CountFreqofWords {

	public static void main(String[] args) {
		String s= "i am Yugal Yugal yugal";
		
				String st[]=s.split(" ");
				
				
				HashMap<String,Integer> hm= new HashMap<>();
				
				for (int i = 0; i < st.length; i++) {
					if(hm.containsKey(st[i]))
						hm.put(st[i],hm.get(st[i])+1);
					else
						hm.put(st[i],1);
					
				}
				System.out.println(hm);
	}

}
