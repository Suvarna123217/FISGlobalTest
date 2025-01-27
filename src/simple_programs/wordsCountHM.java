package simple_programs;

import java.util.HashMap;

public class wordsCountHM {
	
	
	public static void wordsCountHM() {
		
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("name", "navya");
		hm.put("Anshu", "Anu");
		hm.put("Anu", "Anshu");
		hm.put("Initial", "Akula");
		
		System.out.println(hm.size());
		
		
	}

	public static void main(String[] args) {

		wordsCountHM();
		
	}

}
