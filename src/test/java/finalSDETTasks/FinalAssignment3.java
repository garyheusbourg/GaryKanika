package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment3 {
	
	static WebDriver driver;
		
	@Test
	public static void testWriteXPathsCssSelectors() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		try {
			driver.findElement(By.id("frmLogin")); // xpath
			driver.findElement(By.cssSelector("#frmLogin")); // CSS
			driver.findElement(By.id("txtUsername")); // xpath
			driver.findElement(By.cssSelector("#txtUsername")); // CSS
			driver.findElement(By.id("txtPassword")); // xpath
			driver.findElement(By.cssSelector("#txtPassword")); // CSS
			driver.findElement(By.id("btnLogin")); // xpath
			driver.findElement(By.cssSelector("#btnLogin")); // CSS
			driver.findElement(By.linkText("Forgot your password?"));
			driver.findElement(By.cssSelector("#forgotPasswordLink")); // CSS
			driver.findElement(By.id("divLogo"));
			driver.findElement(By.cssSelector("#divLogo")); // CSS
		} catch (Exception e) {
			System.out.println("testWriteXPathsCssSelectors : " + e);
		} finally {
			FinalUtility.closeBroswer(driver);
		}
	}

}
