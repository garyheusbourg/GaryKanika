package finalSDETTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sdetUtility.FinalUtility;

public class FinalAssignment8 {

	static WebDriver driver;
	static String title = "";
	static String preTitle = "";
	static String adminId = "menu_admin_viewAdminModule";
	static String adminPgtitleXpath = "//h1[text() = 'System Users']";
	static String pimId = "menu_pim_viewPimModule";
	static String pimPgtitleXpath = "//h1[text() = 'Employee Information']";
	static String dashboardId = "menu_dashboard_index";
	static String dashboardPgtitleXpath = "//h1[text() = 'Dashboard']";
	static String directoryId = "menu_directory_viewDirectory";
	static String directoryPgtitleXpath = "//h1[text() = 'Search Directory']";
	static String maintenanceId = "menu_maintenance_purgeEmployee";
	static String maintenancePgtitleXpath = "//h1[text() = 'Purge Employee Records']";
		
	@Test 
	public static void testDifferentPageTitles () throws InterruptedException {
		driver = FinalUtility.getDriver(driver);
		FinalUtility.openBroswer(driver);
		FinalUtility.login(driver);
		
		preTitle = "Admin Page Title : ";
		testWrtitePageTitles(driver, adminPgtitleXpath, adminId, preTitle);
			
		preTitle = "PIM Page Title : ";
		testWrtitePageTitles(driver, pimPgtitleXpath, pimId, preTitle);
		
		preTitle = "Dashboard Page Title : ";
		testWrtitePageTitles(driver, dashboardPgtitleXpath, dashboardId, preTitle);
		 
		preTitle = "Directory Page Title : ";
		testWrtitePageTitles(driver, directoryPgtitleXpath, directoryId, preTitle);
		
		preTitle = "Maintenance Page Title : ";
		testWrtitePageTitles(driver, maintenancePgtitleXpath, maintenanceId, preTitle);
					
		FinalUtility.closeBroswer(driver);
	}
	
	public static void testWrtitePageTitles (WebDriver driver, String xpath,
			                                 String id, String preTitle ) throws InterruptedException {
		driver.findElement(By.id(id)).click();
		title = driver.findElement(By.xpath(xpath)).getText();
	 	System.out.println(preTitle + title);
	}
	
}
