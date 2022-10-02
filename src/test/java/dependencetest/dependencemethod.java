package dependencetest;

import org.testng.annotations.Test;

public class dependencemethod {

	
	String depend;
	@Test
	public void order() {
		System.out.println("order packing");
		depend="akash guttedar";
	}
	@Test
	//@Test(dependsOnMethods = "order")
	public void ordertracking() throws Exception {
		if(depend=="akash guttedar") {                         //without dependence
		System.out.println("order tracking");
		}
		else {
			throw new Exception(" i am creating exception");
		}
	}
	//@Test
	@Test(dependsOnMethods = "order")
	public void ordercancel() throws Exception {
		if(depend=="akash guttedar") {                         //with dependence
			System.out.println("order cancel");		
		}else {
			throw new Exception();
		}	
	}
	
}
