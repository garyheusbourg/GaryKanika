package finalSDETTasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment1 {
	
	static WebDriver driver;
		
	@Test
	public static void openBrowser() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.closeBroswer(driver);
	}

}
