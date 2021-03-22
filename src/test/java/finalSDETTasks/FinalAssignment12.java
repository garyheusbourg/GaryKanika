package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import sdetUtility.FinalUtility;
import sdetUtility.RetryAnalyzer;
import org.openqa.selenium.TakesScreenshot;

public class FinalAssignment12 implements IRetryAnalyzer {

	static WebDriver driver;
	static String dashboardId = "menu_dashboard_index";
	static int counter = 0;

	@Test(retryAnalyzer=FinalAssignment12.class)
	public static void testRetryAnalyzer() throws InterruptedException {
		counter++;
		if (counter < 3) {
			dashboardId = "";
		} else {
			dashboardId = "menu_dashboard_index";
		}

		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
		driver.findElement(By.id(dashboardId)).click();
		Shutterbug.shootPage(driver).withName("SDET Selenium Task12 ").save();
		FinalUtility.closeBroswer(driver);

	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
