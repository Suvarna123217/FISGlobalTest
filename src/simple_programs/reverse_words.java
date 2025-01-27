package simple_programs;

public class reverse_words {
	
	public static String reverseWords(String input) {
		String in[]=input.split(" ");
		String output="";
		String one="";
		String word="";
	for(int i=0;i<=in.length-1;i++) {
		
		  word=in[i];
		char[] rev=word.toCharArray();
		for(int j=rev.length-1;j>=0;j--) {
			
			one+=rev[j];
			
		}
		output+=one+" ";
		
		one="";
	}
		return output;
		
		
	}

	public static void main(String[] args) {
		String data="Hi I am Navya";
		System.out.println(reverseWords(data));

	}

}
