package parametter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {

	WebDriver driver;


	@BeforeTest
	@Parameters("browsername")
	public void setup(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browsername.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}else {
			System.out.println("invalid browser");
		}
		
	}

	@AfterTest
	public void teardown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void launch() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}


	@Test
	public void enterlogindetails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void myinformation() {
		driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();

	}

	@Test
	public void employeedetails() {
		boolean a=driver.findElement(By.id("employee-details")).isDisplayed();
		System.out.println(a);
	}


	@Test
	public void showiname() {
		String b=driver.findElement(By.id("welcome")).getText();
		System.out.println(b);
	}
	
}
