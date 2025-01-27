package simple_programs;

public class palindrome {
public static void findPalindrome(String s) {
	
	StringBuffer sb=new StringBuffer(s);
	String d=sb.reverse().toString();
	if(s.equalsIgnoreCase(d)) {
		
		System.out.println("given string is palinderome");
	}
	
	else {
		
		System.out.println("given string is not palinderome");
	}
	System.out.println(d);
}
	public static void main(String[] args) {
		String d="taat";
findPalindrome(d);
	}

}
