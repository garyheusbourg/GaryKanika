package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment7 {

	static WebDriver driver;

	@Test(priority = 1)
	public static void testPriority1() throws InterruptedException {
		System.out.println("priority = 1");
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.closeBroswer(driver);
	}
	
	@Test(priority = 2)
	public static void testPriority2() throws InterruptedException {
		System.out.println("priority = 2");
	}
}
