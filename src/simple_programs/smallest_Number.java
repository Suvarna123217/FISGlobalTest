package simple_programs;

public class smallest_Number {

	public static void smallestNumber() {
		
		int ar[]= {1,4,6,7,3,8,0};
		int temp=0;
		for(int i=0;i<=ar.length-1;i++) {
			for(int j=i+1;j<=ar.length-1;j++) {
				
				if(ar[i]<ar[j]) {
					
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
			
			
		}
		for(int a=0;a<=ar.length-1;a++) {
			
			System.out.println(ar[a]);
			
		}
		
	}
	
	public static void main(String[] args) {
		smallestNumber();

	}

}
