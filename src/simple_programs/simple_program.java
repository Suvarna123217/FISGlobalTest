package simple_programs;

public class simple_program {
	
	 public static String reverseString(String x)
	    {
	        String res=" ";
	        for(int i=x.length()-1;i>=0;i--)
	        {
	            res  += x.charAt(i);
	        }
	        return res;
	    }
	    
	        public static void main(String[] args) {
	        String s= "data";
	        System.out.println(reverseString(s));
	    }


}
