package basictestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class enable_disable_class {

	WebDriver driver;

	public enable_disable_class(WebDriver rdriver) {
		driver=rdriver;
		
	}
	
	public void setuname(String uname) {
		driver.findElement(By.name("uid")).sendKeys(uname);
			
	}
	
	public void setpass(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
			
	}
	
	public void click() {
		driver.findElement(By.name("btnLogin")).click();
	}

	
	
}
