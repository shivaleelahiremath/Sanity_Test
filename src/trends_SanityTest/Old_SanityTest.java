package trends_SanityTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Old_SanityTest {
	
	WebDriver driver;
	Sanity_Scenarios sanityTest = new Sanity_Scenarios();
	
	@BeforeTest
	public void setUp() throws InterruptedException{
		System.out.println("command line execution...");

		//opening Chrome browser..
		System.setProperty("webdriver.chrome.driver", "/Users/shivaleelah/Downloads/chromedriver");		
		driver = new ChromeDriver();				
		//Launching the application..
		driver.manage().window().maximize();
		driver.get("http://trends.tangosoftware.com");
		System.out.println("Launched Trends web link..");
//		reportsLog.info("Trends Application launched successfully..");
	}

	//Shivaleela@TX_BrownsvilleISD, Shivaleela@TX_ComalISD, TX_HarlingenCISD, TX_RioGrandeCityCISD
	@Test
	public void Login(){
		//Login functionality..
		driver.findElement(By.id("loginEmail")).sendKeys("Shivaleela@TX_HarlingenCISD");
		driver.findElement(By.id("password")).sendKeys("Shivu123");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login successfully...");
//		reportsLog.info("Login successfully..");
	}
	
	@Test
	public void sanityScenarios() throws InterruptedException{

		sanityTest.kentro_Tab(driver);
    	sanityTest.staar_Tab(driver);
		sanityTest.telpas_Tab(driver);
		sanityTest.lion_Tab(driver);
		sanityTest.kReady_Tab(driver); 
		sanityTest.tpri_tjl_Tab(driver);
		sanityTest.cpalls_Tab(driver); 
		sanityTest.stateAccountability_Tab(driver);	
		
	}
	
/*	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.id("gearbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signoutbutton")).click();	
		System.out.println("logged out successfully...");
	}
*/
}

