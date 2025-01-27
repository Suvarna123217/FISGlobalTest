package simple_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class multiplyingWithRemainingNumbers {
	
	public static void multiplyingWithRemNum(int[] a) 
	{
		
		int result=1;
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
			result*=a[j];
			
			}
			res.add(result);
			//result=1;
		}
		
		System.out.println(res);
		
		
		
		//al=java.util.Arrays.asList(a);
		System.out.println(java.util.Arrays.asList(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4};
		HashMap<Integer,Integer> i=new HashMap<Integer,Integer>();
		for(Entry<Integer, Integer> h:i.entrySet()) {
			
		}
		
multiplyingWithRemNum(arr);	

	}

}
