
public class RemoveSpacesFromaString {

	public static void main(String[] args) {
		String s= "yugal id idn j";
		
		s=s.replaceAll("[ ]","");
		System.out.println(s);
		
		
		StringBuffer sb = new StringBuffer();
		String s2 = "Prepinsta is best";
		String[] s1 = s.split("\\s2]");//regex expression
		for (String string : s1) {
			sb.append(string);
		}
	    System.out.println(sb);
	}

}
