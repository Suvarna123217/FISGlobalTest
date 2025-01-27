package simple_programs;

public class palindromeNum {
    public static int palinromeNum(int d) {
	String rev="";
	
	while(d!=0) {
		rev+=d%10;
		//System.out.println(rev);
		d=d/10;
		
	}
	
	
	int s=Integer.parseInt(rev);
	return s;
}
	public static void main(String[] args) {
		int a=1234;
System.out.println(palinromeNum(a));
	}

}
