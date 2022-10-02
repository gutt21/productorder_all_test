package Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tabeloutput {

	@Test
	public void test() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//driver.switchTo().frame("logwatch");
		String s=driver.findElement(By.xpath("(//tbody)[2]/tr[1]/td[1]")).getText();
		System.out.println(s);
		XSSFWorkbook work=new XSSFWorkbook();
		XSSFSheet sheet=work.createSheet("akash");
		for(int i=1;i<10;i++) {
			XSSFRow rows=sheet.createRow(i);
			for(int j=1;j<=5;j++) {
				XSSFCell cell=rows.createCell(j);
				String akash=driver.findElement(By.xpath("(//tbody)[2]/tr["+i+"]/td["+j+"]")).getText();
			   System.out.print(akash+" ");
			   cell.setCellValue(akash);
			}
			System.out.println();
			
		}
		
		String path=".\\excel\\akash.xlsx";
		FileOutputStream out=new FileOutputStream(path);
		work.write(out);
		out.close();
		System.out.println("successsfully");
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
