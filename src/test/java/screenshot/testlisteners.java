package screenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class testlisteners extends testclasss implements ITestListener {

	
	     public void onTestFailure(ITestResult result) {
			try {
				
				screenshot(result.getTestContext().getName()+"/"+result.getMethod().getMethodName()+".png");
			    System.out.println(result.getMethod().getMethodName());
			    System.out.println("test fail ");
		}catch (Exception e) {
			
		}
		
		
	}

	
	
}
