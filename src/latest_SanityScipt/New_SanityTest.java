package latest_SanityScipt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

/*
Extending the sanity automation test to cover all basic functionalities like 
Assessment Type, 
drop downs(Filter options and Standards), 
year selection,
Custom Date range,
search student, 
Print and 
Export for TRENDS modules.
*/
public class New_SanityTest {

	public static Logger log=Logger.getLogger("Sanity_Test");
	WebDriver driver;
	Sanity_Scenarios sanityTest = new Sanity_Scenarios();
	
	@BeforeTest
	public void setUp() throws InterruptedException{
		//opening Chrome browser..
		System.setProperty("webdriver.chrome.driver", "/Users/shivaleelah/Downloads/chromedriver");		
		driver = new ChromeDriver();				
		//Launching the application..
//		driver.manage().window().maximize();
//		driver.get("http://trends.tangosoftware.com");
		driver.get("http://tangocentralweb-aldodev.us-east-1.elasticbeanstalk.com");
		log.info("---------------------Sanity Test-------------------------");
		log.info("Trends Application launched successfully..");
//		reportsLog.info("Trends Application launched successfully..");
	}
	
	

	//Shivaleela@TX_BrownsvilleISD, Shivaleela@TX_ComalISD, TX_HarlingenCISD, TX_RioGrandeCityCISD
	@Test
	public void Login(){
		//Login functionality..
		log.info("-----------------------Sanity test : TX_HarlingenCISD--------------------------- ");
		driver.findElement(By.name("loginEmail")).sendKeys("Shivaleela@TX_BrownsvilleISD");
		driver.findElement(By.name("password")).sendKeys("Shivu123");
		driver.findElement(By.id("loginbutton")).click();
		log.info("Login successful...");
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
		sanityTest.TEA_stateAccountability_Tab(driver);	
		sanityTest.Tango_stateAccountability_Tab(driver);	
//		log.info("-----------------------Sanity test completed for district: TX_BrownsvilleISD--------------------------- ");
	}
	
	@AfterTest(enabled = false)
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.id("gearbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signoutbutton")).click();	
		log.info("logged out successful...");
		log.info("------------------Sanity Test Completed for district: TX_LosFresnosCISDTest02----------------");
		driver.quit();
	}

}
