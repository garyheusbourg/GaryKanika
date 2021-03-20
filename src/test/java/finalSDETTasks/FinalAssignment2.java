package finalSDETTasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment2 {
	
	static WebDriver driver;
	
	@Test
	public static void testPrintTitle() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		System.out.println("Title OF This Application : " + driver.getTitle());
		FinalUtility.closeBroswer(driver);
	}

}
