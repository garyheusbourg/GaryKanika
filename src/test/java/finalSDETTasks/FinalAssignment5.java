package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment5 {
	
	static WebDriver driver;
		
	@Test
	public static void testClickAdminValidate() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		try {
			driver.findElement(By.linkText("Admin")).click();
			String str1 = driver.findElement(By.linkText("User Management")).getText();
			String str2 = driver.findElement(By.linkText("Job")).getText();
			String str3 = driver.findElement(By.linkText("Organization")).getText();
			String str4 = driver.findElement(By.linkText("Qualifications")).getText();
			Assert.assertEquals("User Management", str1);
			Assert.assertEquals("Job", str2);
			Assert.assertEquals("Organization", str3);
			Assert.assertEquals("Qualifications", str4);
		} catch (Exception e) {
			System.out.println("testClickAdminValidate : " + e);
		} finally {
			FinalUtility.closeBroswer(driver);
		}
	}
}
