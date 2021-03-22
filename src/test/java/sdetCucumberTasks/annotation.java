package sdetCucumberTasks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class annotation {
	
	static JavascriptExecutor js;
	static String title = "";
	public static WebDriver driver;
	
	@Before(order=0)
	public void setUp() throws InterruptedException {
		getDriver();
		login();
	}
	
	@Given("^When I am in OrangeHRP Application$")
	public void getDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("chrome://settings/clearBrowserData");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	@Then("^Login to Application$")
	public void login() throws InterruptedException  {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		 
	}
	 
	@When("^Dashboard page is available$")
	public static void validateDashboard() throws InterruptedException {
		 
	}
	
	@And("^click on Admin menu$")
	public static void validateClickAdmin() throws InterruptedException {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	} 
	
	@Given("^When I click on Admin Link$")
	public void clickAdmin( ) throws InterruptedException {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	@Then("^Click on Job$")
	public void clickJob( ) throws InterruptedException {
		driver.findElement(By.id("menu_admin_Job")).click();
	}
	
	@And("^Validate test - Job Title$")
	public void validateJobTitle( ) throws InterruptedException {
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	}
	
	@Given("^When I click on Dashboard Link$")
	public void clickDashboard( ) throws InterruptedException {
		driver.findElement(By.id("menu_dashboard_index")).click();
	}
		
	@Then("^Click on Performance Link$")
	public void clickPerformance( ) throws InterruptedException {
		driver.findElement(By.id("menu__Performance")).click();
	}
	
	@Then("^Click on PIM Link$")
	public void clickPIM( ) throws InterruptedException {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}
	
	@Then("^Click on Directory Link$")
	public void clickDirectory( ) throws InterruptedException {
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
	}
	
	@Then("^Click on Maintenance Link$")
	public void clickMaintenance( ) throws InterruptedException {
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
	}
	
	@And("^Get Admin Title$")
	public void getPerformanceTitle( ) throws InterruptedException {
		title = driver.findElement(By.xpath("//h1[text() = 'System Users']")).getText();
	 	System.out.println("AdminTitle : " + title);
	}
	
	@And("^Get PIM Title$")
	public void getPIMTitle( ) throws InterruptedException {
		title = driver.findElement(By.xpath("//h1[text() = 'Employee Information']")).getText();
	 	System.out.println("PIMTitle : " + title);
	}
	
	@And("^Get Directory Title$")
	public void getDirectoryTitle( ) throws InterruptedException {
		title = driver.findElement(By.xpath("//h1[text() = 'Search Directory']")).getText();
	 	System.out.println("DirectoryTitle : " + title);
	}
	
	@And("^Get Maintenance Title$")
	public void getMaintenanceTitle( ) throws InterruptedException {
		title = driver.findElement(By.xpath("//h1[text() = 'Purge Employee Records']")).getText();
	 	System.out.println("MaintenanceTitle : " + title);
	}
	
	 	
	@After(order=0)
	public void tearDown() {
	    driver.quit();
	}
 }