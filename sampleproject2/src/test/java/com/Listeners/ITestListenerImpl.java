package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImpl extends ExtentReportListener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
//	System.out.println("Method started"+ result.getName());	
	}
	
	public void onFinish(ITestContext contextFinish)
	{
//	System.out.println("onFinish method finished");
	}

	public void onStart(ITestContext context) 
	{		
	}	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	System.out.println("Method failed with certain success percentage"+ result.getName());
	}
	
	public void onTestFailure(ITestResult result) 
	{

	}

	public void onTestSkipped(ITestResult result) 
	{
//	System.out.println("Method skipped"+ result.getName());
	}
		
	public void onTestSuccess(ITestResult result) {
		
	}

}
