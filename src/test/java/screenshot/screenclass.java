package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenclass {
		
	WebDriver driver;
	String screentime="guttedar";

	@BeforeTest
	public void setup( ) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void teardown() throws Exception {
		
		driver.close();
		
		
	}
	 public void screenshot(String filename) throws Exception { 
		 
			TakesScreenshot ts=(TakesScreenshot)driver;
			File file=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\akash\\eclipse-workspace\\testngdemotest\\akash/image.png"));
			System.out.println("screenshot saved");
			
		}
	
}
