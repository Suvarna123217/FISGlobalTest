package simple_programs;

public class reversingNumber {
public static void reversNum(int val) {
	
	int even_count=0;
	int odd_count=0;
	
	System.out.println(val);
	
	while((val>0)||(val<0)) {
		int d=val%10;
		if((d%2)==0) {
			even_count++;
			
		}else {
			odd_count++;
			
			
		}
		
		val=val/10;
	}
	
	System.out.println("even numbers are "+even_count +" odd numbers are   "+odd_count);
}

	public static void main(String[] args) {
int data=136547923;
		reversNum(data);
		
	}

}
