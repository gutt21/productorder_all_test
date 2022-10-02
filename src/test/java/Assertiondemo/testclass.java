package Assertiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
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


	
	@Test(priority = 1)
	public void testadarcard() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("cricket"+Keys.ENTER);
		


	}
	
	@Test(priority = 2)
	public void testaagoogle() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Javatpoint: Tutorials List')]")).click();
		
		
		
	}



}
