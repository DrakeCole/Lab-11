public class Lab11Prob02 {

	public static String reverseString(String s) {
		if(s.length() > 1) 
			s = String.format("%s%s%s", 
					s.substring(s.length()-1, s.length()), 
					reverseString(s.substring(1, s.length()-1)), 
					s.substring(0,1));
		return s;
	}
	
	public static void main(String[] args) {
		String s = "String";
		System.out.println(reverseString(s));
	}
}
