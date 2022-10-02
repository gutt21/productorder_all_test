package paralleldata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class parallelclass {
	
	
	
	
	
	

	@Test(dataProvider = "akash")
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
	@DataProvider(parallel=true)
	public String[][] akash() {

		String[][] data=new String[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";

		data[1][0]="Admin";
		data[1][1]="admin23";

		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin23";
		
		return data;

	}

}
