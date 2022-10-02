package dataprovide;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import Assertiondemo.base;


public class recong   {

	Properties prop;


	public void akash() {
		prop=new Properties();
		base b=new base() ;
		try {
			InputStream input=new FileInputStream("C:\\Users\\akash\\eclipse-workspace\\testngdemotest\\gg.properties");
			prop.load(input);
			String a=prop.getProperty("browser"); 
			b.browsername=a;
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

	/*public String guttedar() {		
		String ag= prop.getProperty("browser");
		return ag;

		}*/

}
