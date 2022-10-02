package dataprovide;

import org.testng.annotations.Test;

  public class datacalling {

	@Test(dataProvider = "data",dataProviderClass = datatestclass2.class)
	public void test(Object name) {
		
		System.out.println(name);
	}
}
