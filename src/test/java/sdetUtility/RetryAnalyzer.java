package sdetUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int count = 0;
	private int maxCount = 2;

	@Override

	public boolean retry(ITestResult result) {
		System.out.println("RetryAnalyzer");
		if (count < maxCount) {
			count++;
		    return true;
		}
		return false;
	}
}
