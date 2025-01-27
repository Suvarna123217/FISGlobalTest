package simple_programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class readingTextFile {

	
	public static void readingNoteBook() throws Exception {
		
		FileReader fr=new FileReader("./NotePad.txt");
		BufferedReader br=new BufferedReader(fr);
		ArrayList<String> ar=new ArrayList<String>();
		String line="";
		while((line=br.readLine())!=null){
			
			if(line.trim().length()!=0) {
				ar.add(line);
				System.out.println(line);
				
			}
		}
		
		
		
	}
	public static void main(String[] args) throws Exception {
		
		readingNoteBook();
	}

}
