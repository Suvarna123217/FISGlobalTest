package simple_programs;

import java.sql.Array;

public class largestNumber {

	public static void findinglargestNumber() {
		
		int a[]= {1,3,2,4,5,2};
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
		
			
			for(int j=i+1;j<=a.length-1;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
			
		}
		
		for(int b=0;b<=a.length-1;b++) {
			
			System.out.println(a[b]);
		}
		System.out.println("largest number is   "+a[a.length-1]);
	}
	
	public static void main(String[] args) {
		findinglargestNumber();

	}

}
