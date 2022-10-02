package invocationcount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclassinvoc {

	
	
	@Test(invocationCount = 3)
	public void akash() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);	
		System.out.println(driver.getTitle());
		driver.close();
	}
	

	@Test(invocationCount = 2,invocationTimeOut = 10000)
	public void akash1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);	
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@Test(invocationCount = 4,threadPoolSize = 2)
	public void akash2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);	
		System.out.println(driver.getTitle());
		driver.close();
	}
}
