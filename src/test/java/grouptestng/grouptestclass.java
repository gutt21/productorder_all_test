package grouptestng;

import org.testng.annotations.Test;

public class grouptestclass {

	@Test(groups = "akash")
	public void akashs() {
		System.out.println("akash test1");

		
	}

	@Test(groups = {"akash","khadar"})
	public void akash() {
		System.out.println("both test2");
	}
	

	@Test(groups = "khadar")
	public void akash1() {
		System.out.println("khadar test3");
	}

	
	@Test(groups = {"akash","khadar"})
	public void close() {
		System.out.println("both test4");
	}

}
