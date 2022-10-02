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




public class parallelclass3 {
	
	
	
	
	
	
	@Test
	public void testmethod5() {
		System.out.println("Testclass2 >> testmethod5 >> "+Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod6() {
		System.out.println("Testclass2 >> testmethod6 >> "+Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod7() {
		System.out.println("Testclass2 >> testmethod7 >> "+Thread.currentThread().getId());
	}
	
	

}
