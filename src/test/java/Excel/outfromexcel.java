package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class outfromexcel {

	
	
	
	@Test
	public void test() throws Exception {
		XSSFWorkbook work=new XSSFWorkbook(".\\excel\\demo.xlsx");
		XSSFSheet sheet=work.getSheet("Sheet1");
	    int a=sheet.getPhysicalNumberOfRows();
		int b=sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<a;i++) {
			
			for(int j=0;j<b;j++) {
				
			System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
