package TPRI_TJL;

import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TPRITJL_UserNavigation_RegressionTest {
	String sheetPath = "/Users/shivaleelah/Desktop/RGCISD_Users.xls";
	int rowCount, colCount;
	TPRITJL_RegressionScenario FunTest= new TPRITJL_RegressionScenario();
	WebDriver driver;
	
	@BeforeSuite
	public void setUp(){    
		System.setProperty("webdriver.chrome.driver", "/Users/shivaleelah/Downloads/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://trends.tangosoftware.com");		
	}
	
	@BeforeTest
	public void login() throws InterruptedException{
		driver.findElement(By.id("loginEmail")).sendKeys("shivaleela@TX_Tangosoftware");
		driver.findElement(By.id("password")).sendKeys("Shivu123");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
	}
	
	@Test
    public void getExcel() throws Exception{
		Workbook wbook= Workbook.getWorkbook(new File(sheetPath));
		Sheet sht = wbook.getSheet(0);
		rowCount = sht.getRows();
		colCount = sht.getColumns();
		for(int i=2; i<7; i++){
			
			String UserType = sht.getCell(0, i).getContents();
			String Email = sht.getCell(1, i).getContents();
			String title = sht.getCell(2, i).getContents();
			String grade = sht.getCell(3, i).getContents();
			String studentid = sht.getCell(4, i).getContents();
			System.out.println("----------------"+UserType +":"+ Email +"-------------------------");
	    	FunTest.NavigateStaff_Tab(driver, Email);
	    	FunTest.assessmentFilter(driver, title, grade);
	    	FunTest.studentTab(driver, studentid);
	    	FunTest.SCRTab(driver, studentid);
	    	FunTest.PATab(driver, studentid);
	    	FunTest.GKTab(driver, studentid);
	    	FunTest.WRTab(driver, studentid);
	    	FunTest.READTab(driver, studentid);
	        FunTest.COMPTab(driver, studentid);
	        FunTest.SummTab(driver);
	        System.out.println("Ends-----------------------------------------");
	        driver.findElement(By.id("menubutton")).click();
	        driver.findElement(By.xpath("//*[@id='ui-id-1']/a")).click();
		}
	        
	        
    }
	
//    @AfterSuite
//    public void tearDown(){
//    	driver.quit();
//    }

}
