package dataprovide;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datainexcel {
   @Test(dataProvider ="dataexcel" )
   	public void test(String userName,String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
	
	
    @DataProvider
	public String [][] dataexcel() throws Exception {

		XSSFWorkbook excel=new XSSFWorkbook("C:\\Users\\akash\\eclipse-workspace\\testngdemotest\\excel\\demo.xlsx");
		XSSFSheet sheet=excel.getSheet("Sheet1");
		int a=sheet.getPhysicalNumberOfRows();
		int b=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(a);
		System.out.println(b);
		String [][] data=new String[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
			
			System.out.println();
		}
		return data;
				
	}
    
    
    

}
