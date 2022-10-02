package dependencetest;

import org.testng.annotations.Test;

public class dependencegroup {

	@Test(groups = "test1")
	public void test() {
		System.out.println("test1");

		
	}

	@Test(groups = "test2")
	public void test1() {
		System.out.println("test1");
	}
	

	@Test(groups = "test1")
	public void test2() {
		System.out.println("test2");
	}

	
	@Test(groups = "test2")
	public void test3() {
		System.out.println("test2");
	}
	
	@Test(groups = "test3")
	public void test4() {
		System.out.println("test3");

		
	}

	@Test(groups = "test3")
	public void test5() {
		System.out.println("test3");
	}
	

	@Test(groups = "test4")
	public void test6() {
		System.out.println("test4");
	}

	
	@Test(groups = "test4")
	public void test7() {
		System.out.println("test4");
	}

}
