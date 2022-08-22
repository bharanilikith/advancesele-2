package com.Skillrary.genericlib;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ActionListners  extends Baseclass implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution is started "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase is successfully executed "+result.getName());
		
	}

	public void onTestFailure(ITestResult r) {
		int status = r.getStatus();
		String name = r.getMethod().getMethodName();
			Photo p=new Photo();
				try {
					p.screenshot(driver, name);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	

	

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		//System.out.println("Testcase is completed "+context.getName());
		
	}

}
