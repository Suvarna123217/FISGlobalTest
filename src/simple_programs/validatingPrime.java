package simple_programs;

public class validatingPrime {
public static void validatingPrime() {
	
	int num=11;
	
	if(((num%2)==0)||((num%2)==1)) {
		
		System.out.println("This is not prime number");
	}
	else {
		
		
		System.out.println("This is  prime number");
	}
	
}
	public static void main(String[] args) {
		validatingPrime();

	}

}
