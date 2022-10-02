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




public class parallelclass2 {
	
	
	
	
	
	@Test
	public void testmethod1() {
		System.out.println("Testclass1 >> testmethod1 >> "+Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod2() {
		System.out.println("Testclass1 >> testmethod2 >> "+Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod3() {
		System.out.println("Testclass1 >> testmethod3 >> "+Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod4() {
		System.out.println("Testclass1 >> testmethod4 >> "+Thread.currentThread().getId());
	}

}
