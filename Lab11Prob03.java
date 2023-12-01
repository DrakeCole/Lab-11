
public class Lab11Prob03 {

	public static String reverseString(String s) {
		return reverseString(s, s.length()-1);
	}
	
	public static String reverseString(String s, int i) {
		if(i > 0)
			return s.charAt(i) + reverseString(s, i-1);
		else
			return "" + s.charAt(0);
	}


	public static void main(String[] args) {
		String s = "String";
		System.out.println(reverseString(s));
	}
}
