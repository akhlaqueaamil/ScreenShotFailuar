package ScreenShotFailuar.ScreenShotFailuar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListerner extends Base implements   ITestListener{
	public void onFinish(ITestContext arg0) {
		
	}
    public void onStart(ITestContext arg0) {
	
    }
    public void onTestFailedButWithinSuccesspercentage(ITestResult arg0){
    	
    }
    public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());
    }
    public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
	
	}
    public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}

