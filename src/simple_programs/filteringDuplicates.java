package simple_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class filteringDuplicates {
public static void removingDuplicates() {
	
	int ar[]= {1,5,2,3,5,2,3};
	Set<Integer> in=new HashSet<Integer>();
	for(int i=0;i<=ar.length-1;i++) {
	in.add(ar[i]);
	
	
	}
	System.out.println(in);
	
}


public static void removeDup() {
	int ar[]= {1,5,2,3,5,2,3};
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<=ar.length-1;i++) {
		for(int j=i+1;j<=ar.length-1;j++) {
			
			if(ar[i]==ar[j]) {
				
				
				
			}
			else {
				
				al.add(ar[i]);
				
			}
		}
		
	}
	for(Integer a:al) {
		
		System.out.println(a);
	}
	
	
	
	
	
}
	public static void main(String[] args) {
		removeDup();
	}

}
