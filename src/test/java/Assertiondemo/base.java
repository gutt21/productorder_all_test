package Assertiondemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import dataprovide.recong;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

   
    
	public String baseurl="https://demo.guru99.com/V1/index.php";
	public String username="mngr423284";
	public String pass="vupUpUz";	
	public static WebDriver driver;
	public String browsername;

	@BeforeTest
	public void setup() {
		if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println("invalid");
		}
		driver.manage().window().maximize();

	}

	@AfterTest
	public void teardown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}




}
