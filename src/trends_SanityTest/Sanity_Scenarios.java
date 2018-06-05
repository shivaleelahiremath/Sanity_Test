package trends_SanityTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sanity_Scenarios {

	Sanity_Functions sanityFun = new Sanity_Functions();
	
	public void kentro_Tab(WebDriver driver) throws InterruptedException{

		System.out.println("----------Kentro tab-------------");
		driver.findElement(By.xpath("//*[@id='radio']/label[1]/span")).click();
		Thread.sleep(2000);
		
		//Kentro assessment view..
//		sanityFun.assessmentType(driver);
//		sanityFun.asmt_kentroStandard(driver);
//		sanityFun.filterOptions(driver);
//		sanityFun.ADF_Combobox(driver);
//		sanityFun.ADF_calendar(driver);
//		sanityFun.printButton(driver);
//		sanityFun.tangoExport(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(2000);
		System.out.println("selected kentro assessment..");
				
		//Kentro Student tab..
		
//		sanityFun.filterOptions(driver);		
//		sanityFun.stud_kentroStandard(driver);		
		sanityFun.ScoreDetail(driver);
		
		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected TEKS mastery tab..");

		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected RC mastery tab..");
		
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Item analysis tab..");
		
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Demography tab..");

		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Remediation tab..");
		
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected summary tab..");
		
		sanityFun.backMain(driver);
		System.out.println("----------Kentro tab completed-------------");
		
	}
	
	public void staar_Tab(WebDriver driver) throws InterruptedException{
		
		System.out.println("-----------Staar tab-----------");

		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(2000);
		System.out.println("selected starr assessment..");
		
		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected TESK mastery tab..");
		
		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected RC mastery tab..");
		
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Item analysis tab..");
		
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Demography tab..");
		
		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Remediation tab..");
		
		//select Rubrics tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected rubrics tab..");
		
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected summary tab..");
		
		sanityFun.backMain(driver);
		System.out.println("--------STAAR tab completed--------");
				
	}
	
	public void telpas_Tab(WebDriver driver) throws InterruptedException{
		
		System.out.println("----------Telpas_Tab-----------");
		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
	    System.out.println("selected telpas assessment..");
	    
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Item analysis..");
		
		//select SE mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected SE mastery tab..");
				
		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected RC mastery tab..");
					
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Demography tab..");
				
		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Remediation tab..");
				
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
	    Thread.sleep(2000);
		System.out.println("selected summary tab..");
			
	    sanityFun.backMain(driver);
	    System.out.println("----------Telpas_Tab completed--------");
	
	}
	
	public void lion_Tab(WebDriver driver) throws InterruptedException{
		System.out.println("----------Lion_Tab-----------");
		
		driver.findElement(By.xpath("//*[@id='radio']/label[4]/span")).click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		System.out.println("selected lion assessment..");
		
		//select Instructional tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Instructional tab..");
				
		//select Analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Analysis tab..");
						
		//select Reading tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Reading tab..");
						
		//select Foundation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Foundation tab..");
		
		//select History tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected History tab..");

		//select Details tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Details tab..");
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Summary tab..");
		
		sanityFun.backMain(driver);
		System.out.println("------------LION_tab completed-------------");
		
	}
	
	public void kReady_Tab(WebDriver driver) throws InterruptedException{
		System.out.println("----------Kready tab-----------");
		driver.findElement(By.xpath("//*[@id='radio']/label[5]/span")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		System.out.println("selected Kready assessment..");
		
		//select Math tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Math tab..");
				
		//select Science tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected science tab..");
						
		//select Skill Checklist tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Skill Checklist tab..");
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected summary tab..");
		
		sanityFun.backMain(driver);
		System.out.println("---------Kready_tab completed-----------");
		
	}
	
	public void tpri_tjl_Tab(WebDriver driver) throws InterruptedException{
		
		System.out.println("------------TPRI/TJL tab-------------");
		driver.findElement(By.xpath("//*[@id='radio']/label[6]/span")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		System.out.println("selected TPRI/TJL assessment..");
		
		//select SCR tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected SCR tab..");
				
		//select PA tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected PA tab..");
						
		//select GK tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected GK tab..");
							
		//select WR tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected WR tab..");
		
		//select READ tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected READ tab..");
				
		//select COMP tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected COMP tab..");
		
		//select Export tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[8]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected EXPORT tab..");
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Summary tab..");
		
		sanityFun.backMain(driver);
		
		System.out.println("----------TPRI/TJL tab completed----------");
			
	}
	
	public void cpalls_Tab(WebDriver driver) throws InterruptedException{
		
		System.out.println("------------CPALLS tab-----------");
		
		driver.findElement(By.xpath("//*[@id='radio']/label[7]/span")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		System.out.println("selected CPALLS assessment..");
		
		//select PA tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected PA tab..");
				
		//select Math tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Math tab..");
						
		//select Observables tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Observables tab..");
							
		//select Science tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected science tab..");
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected summary tab..");
		
		sanityFun.backMain(driver);
		
		System.out.println("----------CPALLS tab completed------------");
		
	}
	
	public void stateAccountability_Tab(WebDriver driver) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
		System.out.println("------------State Accountability----------------");
		//Selecting STAAR tab on assessment module..
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menubutton"))).click();
		Thread.sleep(1000);
		System.out.println("selected menu button..");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-10"))).click();
		Thread.sleep(4000);
		System.out.println("selected state accountability option..");
		
//		driver.findElement(By.xpath("html/body/content/div[1]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		System.out.println("selected assessment..");
			
		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected TEST Mastery tab..");
		
		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected RC Mastery tab..");
		
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected ITEM Analysis tab..");
		
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Demographics tab..");
		
		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Remediation tab..");
		
		//select Rubrics tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[8]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected Rubrics tab..");
		
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		System.out.println("selected summary tab..");
		
		sanityFun.backMain(driver);
		System.out.println("-----------State Accountability tab completed-------------");
		
	}

}
