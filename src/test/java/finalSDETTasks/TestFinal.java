package finalSDETTasks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class TestFinal {

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js;

	@BeforeSuite
	public void beforeSuite() throws InterruptedException {
		FinalUtility.openBroswer(driver);
		FinalUtility.closeBroswer(driver);
	}

	@Test(priority = 1)
	public void openBrowser() throws InterruptedException {
		FinalUtility.openBroswer(driver);
	//	System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
	//	driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
	//	js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		FinalUtility.closeBroswer(driver);
	}

	@Test(priority = 2)
	public void testPrintTitle() throws InterruptedException {
		FinalUtility.openBroswer(driver);
		System.out.println("Title OF This Application : " + driver.getTitle());
		FinalUtility.closeBroswer(driver);
	}

	@Test(priority = 3)
	public void testWriteXPathsCssSelectors() throws InterruptedException {
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

	@Test(priority = 4)
	public void testLoginValidateDashboard() throws InterruptedException {
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

	@Test(priority = 5)
	public void testClickAdminValidate() throws InterruptedException {
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
