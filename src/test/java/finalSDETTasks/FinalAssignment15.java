package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment15 {

	static WebDriver driver;
	
	static String adminId = "menu_admin_viewAdminModule";
	static String pimId = "menu_pim_viewPimModule";
	static String dashboardId = "menu_dashboard_index";
	static String directoryId = "menu_directory_viewDirectory";
	static String maintenanceId = "menu_maintenance_purgeEmployee";
	static String maintenancePgtitleXpath = "//h1[text() = 'Purge Employee Records']";
		
	@Test 
	public static void testDifferentPageTitles () throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
		
		driver.findElement(By.id(adminId)).click();
		
		driver.findElement(By.id(dashboardId)).click();
	   
		driver.findElement(By.id("mp_btn_inner")).click();
		
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.id(dashboardId)).click();
		 
		driver.findElement(By.xpath("//a[@href ='/index.php/leave/viewLeaveList']")).click();
		
  		FinalUtility.closeBroswer(driver);
	}
	
	
	
}
