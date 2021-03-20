package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment6 {

	static WebDriver driver;

	@BeforeSuite
	public static void testBeforeSuite() throws InterruptedException {
		System.out.println("@BeforeSuite");
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.closeBroswer(driver);
	}

	@Test
	public static void unitTest() {
		System.out.println("@Test");
	}
	
}
