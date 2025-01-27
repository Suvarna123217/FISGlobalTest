package simple_programs;

public class factorial {
public static int factorial(int d) {
	int res=1;
	for(int i=1;i<=d;i++) {
		res=res*i;
		
		
	}
	return res;
}
	public static void main(String[] args) {
		int a=5;
System.out.println(factorial(a));
	}

}
