package Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writeonexcel {

	
	
	
	
	@Test
	public void test() throws Exception {
		
	XSSFWorkbook work=new XSSFWorkbook();
	XSSFSheet sheet=work.createSheet("khadar");
	
		
	String [][] data= {
			{"number","name","password"},
			{"100","akash","974akas0"}
			
	};
	
	int row=data.length;
	int col=data[1].length;
	
	
	System.out.println(row);
	System.out.println(col);
	
		
	
	
	for(int i=0;i<row;i++) {
		XSSFRow rows=sheet.createRow(i);
		for(int j=0;j<col;j++) {
			XSSFCell cell=rows.createCell(j);
			
			cell.setCellValue(data[i][j]);
			
			
						
		}
		
	}
	
	String path=".\\excel\\khadar.xlsx";
	FileOutputStream out=new FileOutputStream(path);
	work.write(out);
	out.close();
	System.out.println("successsfully");
	
	
	
		
	}
	
	
	
}
