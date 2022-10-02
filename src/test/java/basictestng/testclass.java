package basictestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	WebDriver driver;


	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}



	@Test
	public void test1adarcard() {

		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		driver.get("https://uidai.gov.in/");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.name("searchword")).sendKeys("download");
		driver.findElement(By.xpath("//button[contains(text(),'Go')]")).click();




	}
	@Test
	public void testgoogle() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Javatpoint: Tutorials List')]")).click();


	}

}
