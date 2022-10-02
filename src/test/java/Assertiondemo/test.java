package Assertiondemo;
import org.testng.annotations.Test;

import basictestng.enable_disable_class;
import dataprovide.recong;
public class test extends base {
	  @Test
	  public void logintest() {
		  recong re= new recong();
		driver.get(baseurl);	
		enable_disable_class l=new enable_disable_class(driver);
		l.setuname(username);
		l.setpass(pass);
		l.click();
		System.out.println(driver.getTitle());
	  }
}
