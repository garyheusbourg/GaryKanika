package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment14 {

	static WebDriver driver;
	static String adminId = "menu_admin_viewAdminModule";
 	static String pimId = "menu_pim_viewPimModule";
	static String dashboardId = "menu_dashboard_index";
	static String directoryId = "menu_directory_viewDirectory";
	static String maintenanceId = "menu_maintenance_purgeEmployee";
			
	@Test 
	public static void testCssSelectors () throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
	 
		driver.findElement(By.cssSelector("#menu_dashboard_index")).click(); // CSS
	 
		driver.findElement(By.cssSelector("#menu_pim_viewPimModule")).click(); // CSS
	 
		driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee")).click(); // CSS
	 
		driver.findElement(By.cssSelector("#menu_time_viewTimeModule")).click(); // CSS
	 
		driver.findElement(By.cssSelector("#menu_dashboard_index")).click(); // CSS
	 
		WebElement element1 = driver.findElement(By.cssSelector("a[href*='assignLeave']"));
			 	
		driver.findElement(By.cssSelector("#menu_dashboard_index")).click(); // CSS
	 
		//WebElement element2 = driver.findElement(By.cssSelector("a[href*='/index.php/time/viewEmployeeTimesheet']"));
		//element2.click();
	 
		FinalUtility.closeBroswer(driver);
	}
	
	
	
}
