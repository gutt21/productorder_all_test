package grouptestng;

import org.testng.annotations.Test;

public class grouptestclass2 {


	@Test(groups = "akash")
	public void akashs() {
		System.out.println("akash test5");

		
	}

	@Test(groups = {"akash","khadar"})
	public void akash() {
		System.out.println("both test6");
	}
	

	@Test(groups = "khadar")
	public void akash1() {
		System.out.println("khadar test7");
	}

	
	@Test(groups = {"akash","khadar"})
	public void close() {
		System.out.println("both test8");
	}


}
