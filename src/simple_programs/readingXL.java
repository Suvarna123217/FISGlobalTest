package simple_programs;

import java.io.FileInputStream;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingXL {

	public static void readingexcel() throws Exception {
		LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
		FileInputStream fis=new FileInputStream("./example.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet st=wb.getSheetAt('0');
		int rowCount=st.getLastRowNum();
		int colCount=st.getRow(0).getLastCellNum();
		for(int i=0;i<=rowCount;i++) {
			
			for(int j=0;j<=colCount;j++) {
				
				String key=st.getRow(0).getCell(j).toString();
				String val=st.getRow(i).getCell(j).toString();
				
				lhm.put(key, val);       
			}
			
			
		}
		System.out.println(lhm);
		
		
	}
	
	
	public static void main(String[] args) throws Exception{
		readingexcel();

	}

}
