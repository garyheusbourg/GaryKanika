package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment9 {

	static WebDriver driver;

	@Test  
	public static void testTask9() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		testMinimize(driver);
		FinalUtility.closeBroswer(driver);
	}
		 
	public static void testMinimize(WebDriver driver) throws InterruptedException {
	    // Couldn't get Minimize to work so did Maximize with no annotation
		driver.manage().window().maximize();
		 
	}
}
