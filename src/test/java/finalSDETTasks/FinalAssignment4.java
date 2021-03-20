package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment4 {
	
	static WebDriver driver;
		
	@Test
	public static void testLoginValidateDashboard() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		try {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			String str1 = driver.findElement(By.linkText("Dashboard")).getText();
			Assert.assertEquals("Dashboard", str1);
		} catch (Exception e) {
			System.out.println("testLoginValidateDashboard : " + e);
		} finally {
			FinalUtility.closeBroswer(driver);
		}
	}
}
