package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class testclass {

	@Test
	public void testmethod1() {
		System.out.println(" i'm inside testmethod1 ");
	}
	
	@Test
	public void testmethod2() {
		System.out.println(" i'm inside testmethod2 ");
	}
	
	@Test(timeOut = 1000)
	public void testmethod3() throws Exception {
		Thread.sleep(2000);
		System.out.println(" i'm inside testmethod3 ");
	}
	
	@Test(dependsOnMethods = "testmethod3")
	public void testmethod4() {
		System.out.println(" i'm inside testmethod4 ");
	}
	
	
}
