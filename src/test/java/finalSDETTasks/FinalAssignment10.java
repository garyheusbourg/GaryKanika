package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment10 {

	static WebDriver driver;
	static String dashboardId = "menu_dashboard_index";
	static String dashboardPgtitleXpath = "//h1[text() = 'Dashboard']";

	@Test  
	public static void testDashboardHeading() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
		driver.findElement(By.id(dashboardId)).click();
		String title = driver.findElement(By.xpath(dashboardPgtitleXpath)).getText();
	 	System.out.println("Dashboard Heading : "  + title);
	    FinalUtility.closeBroswer(driver);
	}
		 
	 
}
