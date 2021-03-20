package finalSDETTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import sdetUtility.FinalUtility;

public class FinalAssignment13 {

	static WebDriver driver;
	static String pimId = "menu_pim_viewPimModule";
	
	@Test  
	public static void testTask13() throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
		driver.findElement(By.id(pimId)).click();
		WebElement element = driver.findElement(By.id("empsearch_employee_name_empName"));
		element.clear();
		element.click();
		Thread.sleep(2000);
		element.sendKeys("Linda Anderson".trim());
	 	
		Shutterbug.shootPage(driver).withName("SDET Selenium Task13").save();
	    FinalUtility.closeBroswer(driver);
	}

}

