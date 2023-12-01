package binary3;

public class Lab1102 {

	public static String reverseString(String s) {
		s = String.format("%s%s%s", s.substring(s.length()-2, s.length()-1), reverseString(s), );
			return s;
	}
	
	public static void main(String[] args) {
		String s = "String";
		System.out.println(reverseString(s));
	}
}
