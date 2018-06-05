package latest_SanityScipt;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sanity_Scenarios {

	public static Logger log=Logger.getLogger("Sanity_Test");
	Sanity_Functions sanityFun = new Sanity_Functions();

	public void kentro_Tab(WebDriver driver) throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver,10); 

		log.info("----------Kentro tab-------------");
		System.out.println("Kenyro tab..");
		driver.findElement(By.xpath("//*[@id='radio']/label[1]/span")).click();
		Thread.sleep(2000);

		//Kentro assessment view..
		sanityFun.assessmentType(driver);
		sanityFun.standards(driver);
		sanityFun.asmt_filterOptions(driver);
		sanityFun.ADF_Combobox(driver);
		sanityFun.ADF_calendar(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		driver.findElement(By.id("select2-ADF_Default_Combobox-container")).click();
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("ul#select2-ADF_Default_Combobox-results li:nth-child(5)")).click();
		Thread.sleep(4000);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(2000);
		log.info("selected kentro assessment..");

		//Kentro Student tab..
		
		sanityFun.studID(driver);
		sanityFun.filterOptions(driver);		
		sanityFun.standards(driver);		
	//  sanityFun.ScoreDetail(driver); (Yet to complete...)
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected TEKS mastery tab..");
		//SE tab..
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//Skill tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected RC mastery tab..");

		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Item analysis tab..");

		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Demography tab..");

		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Remediation tab..");

		sanityFun.remediation_FilterOptions(driver);
		sanityFun.reme_Search_Student(driver);
		sanityFun.performance(driver);
		sanityFun.printButton(driver);

		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");

		//Summary Overall tab..
		sanityFun.filterOptions(driver);
		sanityFun.summ_AllStudents(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);

		//Summary SE tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		sanityFun.panelFilter(driver);
		//		sanityFun.filterOptions(driver);
		//		sanityFun.asmt_kentroStandard(driver);

		//Summary RC tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		//		sanityFun.filterOptions(driver);
		//		sanityFun.asmt_kentroStandard(driver);

		sanityFun.backMain(driver);
		log.info("----------Kentro tab completed-------------");
		System.out.println("----------Kentro tab completed------------");
	}

	public void staar_Tab(WebDriver driver) throws InterruptedException{

		log.info("-----------Staar tab-----------");

		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(4000);

		//Maintenance STAAR assessment view...

		sanityFun.asmt_filterOptions(driver);
		sanityFun.yearDropDown(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		WebElement title = driver.findElement(By.xpath("//*[@id='Title']/div/input"));
		title.sendKeys("English");
		title.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,10); 
	  //driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(2000);
		log.info("selected starr assessment..");
		
		//Maintenance STAAR Student tab..
		
		sanityFun.studID(driver);
		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected TESK mastery tab..");

		//SE tab..
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//Skill tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected RC mastery tab..");

		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Item analysis tab..");

		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Demography tab..");

		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);	

		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
		Thread.sleep(2000);

		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Remediation tab..");

		sanityFun.remediation_FilterOptions(driver);
		sanityFun.reme_Search_Student(driver);
		sanityFun.standards(driver);
		sanityFun.performance(driver);
		sanityFun.printButton(driver);

		//select Rubrics tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		log.info("selected rubrics tab..");

		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.rubric_Search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");

		//Summary Overall tab..
		sanityFun.filterOptions(driver);
		sanityFun.summ_AllStudents(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);

		//Summary SE tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		sanityFun.panelFilter(driver);
//		sanityFun.standards(driver);
		//sanityFun.filterOptions(driver);
		//sanityFun.asmt_kentroStandard(driver);

		//Summary RC tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		sanityFun.backMain(driver);
		log.info("--------STAAR tab completed--------");

	}

	public void telpas_Tab(WebDriver driver) throws InterruptedException{

		log.info("----------Telpas_Tab-----------");
		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
//		Thread.sleep(4000);
		
		sanityFun.printButton(driver);
//		sanityFun.tangoExport(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
//		driver.findElement(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		log.info("selected telpas assessment..");
		
		sanityFun.TELPAS_studID(driver);
		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Item analysis..");
		
		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
	
		//select SE mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected SE mastery tab..");

		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected RC mastery tab..");
		
		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Demography tab..");

		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Remediation tab..");

		sanityFun.performance(driver);
		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.reme_Search_Student(driver);
		
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");

		sanityFun.summ_AllStudents(driver);
		sanityFun.filterOptions(driver);
		sanityFun.TELPAS_Domain(driver);
		
		sanityFun.backMain(driver);
		log.info("----------Telpas_Tab completed--------");

	}

	public void lion_Tab(WebDriver driver) throws InterruptedException{

		log.info("----------Lion_Tab-----------");

		driver.findElement(By.xpath("//*[@id='radio']/label[4]/span")).click();
		Thread.sleep(2000);
		
//		sanityFun.filterOptions(driver);
		sanityFun.yearDropDown(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		driver.findElement(By.xpath("//*[@id='SchoolYear']/left")).click();
		Thread.sleep(2000);
		//*[@id="SchoolYear"]/left
		WebDriverWait wait = new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		log.info("selected lion assessment..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Instructional tab..
//		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Instructional tab..");
	
		//select Analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Analysis tab..");
		String[] tabs = {"Reference", "SEMastery", "Comparison"};
		for (int i =0;i<=tabs.length;i++){
			driver.findElement(By.xpath("//*[@id='radio']/label["+(i+1)+"]/span")).click();		
			System.out.println(tabs[i]);
			sanityFun.filterOptions(driver);
			sanityFun.printButton(driver);
			sanityFun.tangoExport(driver);
		}
		
		//select Reading tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Reading tab..");
		
		//Comprehension tab..
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//Vocabulary tab
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();		
		Thread.sleep(2000);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Foundation tab..
//		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Foundation tab..");

		//select History tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected History tab..");

		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Details tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Details tab..");

		String[] DetailTabs = {"FFD", "EMR", "BEG", "DEV", "BRG", "INM", "PRO", "ADV+"};
		for (int i =0;i<=DetailTabs.length;i++){
			driver.findElement(By.xpath("//*[@id='radio']/label["+(i+1)+"]/span")).click();		
			System.out.println(DetailTabs[i]);
			sanityFun.filterOptions(driver);
			sanityFun.printButton(driver);
			sanityFun.tangoExport(driver);
		}
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Summary tab..");
		sanityFun.filterOptions(driver);
		
		sanityFun.backMain(driver);
		log.info("------------LION_tab completed-------------");

	}

	public void kReady_Tab(WebDriver driver) throws InterruptedException{
		log.info("----------Kready tab-----------");
		driver.findElement(By.xpath("//*[@id='radio']/label[5]/span")).click();
		Thread.sleep(2000);
		
		sanityFun.asmt_filterOptions(driver);
		sanityFun.ADF_Combobox(driver);
		sanityFun.ADF_calendar(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		WebDriverWait wait = new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		log.info("selected Kready assessment..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Math tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Math tab..");

		String[] mathTabs = {"All", "Screening", "Inventory"};
		for (int i=2; i<mathTabs.length; i++){
			driver.findElement(By.xpath("//*[@id='radio']/label["+(i+1)+"]/span")).click();
			Thread.sleep(2000);
			sanityFun.filterOptions(driver);
			sanityFun.printButton(driver);
			sanityFun.tangoExport(driver);
		}	
		
		//select Science tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected science tab..");
		
		String[] scienceTabs = {"All", "Screening", "Inventory"};
		for (int i=0; i<scienceTabs.length; i++){
			driver.findElement(By.xpath("//*[@id='radio']/label["+(i+1)+"]/span")).click();
			Thread.sleep(2000);
			sanityFun.filterOptions(driver);
			sanityFun.printButton(driver);
			sanityFun.tangoExport(driver);
		}	
		
		//select Skill Checklist tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Skill Checklist tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");
		sanityFun.filterOptions(driver);
		
		sanityFun.backMain(driver);
		log.info("---------Kready_tab completed-----------");

	}

	public void tpri_tjl_Tab(WebDriver driver) throws InterruptedException{

		log.info("------------TPRI/TJL tab-------------");
		driver.findElement(By.xpath("//*[@id='radio']/label[6]/span")).click();
		Thread.sleep(2000);
		
		sanityFun.filterOptions(driver);
		sanityFun.yearDropDown(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

//		WebElement year = driver.findElement(By.xpath("//*[@id='select2-releaseYearDropDown-container']"));
//		year.click();
//		driver.findElement(By.xpath("/html/body/span[5]/span/span[1]/input")).sendKeys("2014-2015");
//		year.sendKeys(Keys.ENTER);	
//		Thread.sleep(2000);
			    
		WebDriverWait wait = new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		log.info("selected TPRI/TJL assessment..");

		//Student tab..
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select SCR tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected SCR tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select PA tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected PA tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select GK tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected GK tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select WR tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected WR tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select READ tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected READ tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select COMP tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		log.info("selected COMP tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
			
		//select Export tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[8]/tab")).click();
		Thread.sleep(2000);
		log.info("selected EXPORT tab..");

//		sanityFun.printButton(driver);
//		sanityFun.tangoExport(driver);
		
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);
//		sanityFun.printButton(driver);
//		sanityFun.tangoExport(driver);
	
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Summary tab..");

		sanityFun.filterOptions(driver);

		sanityFun.backMain(driver);

		log.info("----------TPRI/TJL tab completed----------");
		
	}

	public void cpalls_Tab(WebDriver driver) throws InterruptedException{

		log.info("------------CPALLS tab-----------");

		driver.findElement(By.xpath("//*[@id='radio']/label[7]/span")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("select2-selection__rendered")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("ul.select2-results__options li:nth-child(2)")).click();
		Thread.sleep(1000);
		
		sanityFun.filterOptions(driver);
		sanityFun.yearDropDown(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
	
		WebDriverWait wait = new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("tbody#MaintenanceAssessmentListGrid > tr:nth-child(1) > td.go"))).click();
		
		Thread.sleep(3000);
		log.info("selected CPALLS assessment..");
		
		//Student tab..
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select PA tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected PA tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Math tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Math tab..");
		
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Observables tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Observables tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Science tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected science tab..");

		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[1]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");

		sanityFun.filterOptions(driver);
		
		sanityFun.backMain(driver);

		log.info("----------CPALLS tab completed------------");

	}

	public void TEA_stateAccountability_Tab(WebDriver driver) throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver,10); 
		log.info("------------State Accountability tab for TEA----------------");
		//Selecting STAAR tab on assessment module..
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menubutton"))).click();
		Thread.sleep(1000);
		log.info("selected menu button..");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-10"))).click();
		Thread.sleep(4000);
		log.info("selected state accountability option..");

		sanityFun.yearDropDown(driver);
		sanityFun.campusFilter(driver);
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		WebElement title = driver.findElement(By.xpath("//*[@id='Title']/div/input"));
		title.sendKeys("English");
		title.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		log.info("selected assessment..");

		sanityFun.TELPAS_studID(driver);
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected TEST Mastery tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//Select SE tab 
		driver.findElement(By.xpath("//*[@id'radio']/label[2]/span")).click();
		Thread.sleep(2000);
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected RC Mastery tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected ITEM Analysis tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Demographics tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Remediation tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.reme_Search_Student(driver);
		sanityFun.performance(driver);
		
		//select Rubrics tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[8]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Rubrics tab..");

		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");

		//Summary Overall tab..
		sanityFun.filterOptions(driver);
		sanityFun.summ_AllStudents(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);

		//Summary SE tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		sanityFun.panelFilter(driver);
		//sanityFun.standards(driver);
		//sanityFun.filterOptions(driver);
		//sanityFun.asmt_kentroStandard(driver);

		//Summary RC tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);
		
		sanityFun.backMain(driver);
		log.info("-----------State Accountability tab completed for TEA-------------");

	}

	public void Tango_stateAccountability_Tab(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub		
		WebDriverWait wait = new WebDriverWait(driver,10); 
		log.info("------------State Accountability for Tango----------------");
		//Selecting STAAR tab on assessment module..
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menubutton"))).click();
		Thread.sleep(1000);
		log.info("selected menu button..");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-10"))).click();
		Thread.sleep(4000);
		log.info("selected state accountability option..");

		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(4000);
		
		sanityFun.yearDropDown(driver);
		sanityFun.campusFilter(driver);
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		WebElement title = driver.findElement(By.xpath("//*[@id='Title']/div/input"));
		title.sendKeys("English");
		title.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/content/div[1]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[1]/td[2]/img"))).click();
		Thread.sleep(3000);
		log.info("selected assessment..");

		sanityFun.TELPAS_studID(driver);
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select TEKS mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[3]/tab")).click();
		Thread.sleep(2000);
		log.info("selected TEST Mastery tab..");

		//SE tab
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//Select SKILL tab 
		driver.findElement(By.xpath("//*[@id'radio']/label[2]/span")).click();
		Thread.sleep(2000);
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
				
		//select RC mastery tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[4]/tab")).click();
		Thread.sleep(2000);
		log.info("selected RC Mastery tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Item analysis tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[5]/tab")).click();
		Thread.sleep(2000);
		log.info("selected ITEM Analysis tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select Demography tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[6]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Demographics tab..");
		
		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);

		//select Remediation tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[7]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Remediation tab..");

		sanityFun.standards(driver);
		sanityFun.filterOptions(driver);
		sanityFun.printButton(driver);
		sanityFun.reme_Search_Student(driver);
		sanityFun.performance(driver);
		
		//select Rubrics tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[8]/tab")).click();
		Thread.sleep(2000);
		log.info("selected Rubrics tab..");
		
		sanityFun.filterOptions(driver);
		sanityFun.standards(driver);
		sanityFun.search_Student(driver);
		sanityFun.printButton(driver);
		sanityFun.tangoExport(driver);
		
		//select summary tab..
		driver.findElement(By.xpath("/html/body/header/top/tabs/a[2]/tab")).click();
		Thread.sleep(2000);
		log.info("selected summary tab..");

		//Summary Overall tab..
		sanityFun.filterOptions(driver);
		sanityFun.summ_AllStudents(driver);
		sanityFun.standards(driver);
		sanityFun.printButton(driver);

		//Summary SE tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[2]/span")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		sanityFun.panelFilter(driver);

		//Summary RC tab..
		driver.findElement(By.xpath("//*[@id='radio']/label[3]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sortradio']/label[2]")).click();
		Thread.sleep(2000);

		sanityFun.backMain(driver);
		log.info("-----------State Accountability tab completed for Tango-------------");

	}

}
