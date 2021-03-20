package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import sdetUtility.FinalUtility;
import org.openqa.selenium.TakesScreenshot;

public class FinalAssignment11 {

	static WebDriver driver;
	static String dashboardId = "menu_dashboard_index";
	
	@Test  
	public static void testITestListener() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
		driver.findElement(By.id(dashboardId)).click();
		Shutterbug.shootPage(driver).withName("SDET Selenium Task11").save();
	    FinalUtility.closeBroswer(driver);
	}

}

