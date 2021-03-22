package sdetUtility;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.AfterClass;

public class FinalUtility {

	static JavascriptExecutor js;
	static WebDriver driver;

	public static WebDriver getDriver(WebDriver driver) throws InterruptedException {
		//killIEAndClearCacheChrome();
		System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void openBroswer(WebDriver driver) throws InterruptedException {
		driver.get("chrome://settings/clearBrowserData");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void login(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	public static String driverGetTitleByID(WebDriver driver, String id) throws InterruptedException {
		String title = "";
		String xpath = "//h1[text() = 'System Users']";
		title = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(" Page Title For Menus");
		return title;
	}

	public static void closeBroswer(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	 /**
	  * KillIEAndClearCache
	  * @throws IOException, InterruptedException
	  * Kill any browser session and clear cache
	 */
	public static void killIEAndClearCacheChrome() {
		
		ArrayList<String> tasksList = new ArrayList<>();
		tasksList.add("taskkill /F /IM chrome.exe");
		tasksList.add("taskkill /F /IM driver.exe");
		tasksList.add("taskkill /F /IM chromedriver.exe");
				
	    try { 
	    	for (String task : tasksList) {
	    		Runtime runtime = Runtime.getRuntime();
	    		Process runTimeProcess = runtime.exec(task);
	    		runTimeProcess.waitFor();				
			}
	    } catch (Exception e) {
	    	System.out.println("CodesRecompUtil - killIEAndClearCache : Exception " + e);
		    
		}
	}

}
