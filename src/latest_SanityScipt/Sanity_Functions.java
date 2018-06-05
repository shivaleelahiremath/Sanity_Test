package latest_SanityScipt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sanity_Functions {
  
	WebDriverWait wait;
	String studentID;
	
	public void backMain(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("menubutton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-1")).click();
		Thread.sleep(2000);	
	}	

	public void studID(WebDriver driver) throws InterruptedException {
		studentID = driver.findElement(By.cssSelector(".StudentId>a")).getText();
		System.out.println("stud ID -> "+studentID);
	}
	
	public void TELPAS_studID(WebDriver driver) throws InterruptedException {	
		studentID = driver.findElement(By.cssSelector("td.StudentId")).getText();
		System.out.println("stud ID -> "+studentID);
	}
		
	public void asmt_filterOptions(WebDriver driver) throws InterruptedException{
		wait= new WebDriverWait(driver,10); 
		List<WebElement> allElements = driver.findElements(By.name("multiselect_filterpicker")); 
		System.out.println("Filter button selected and Elements present in Filter button: " +allElements.size());  

		for(int x = 0; x < allElements.size(); x++){
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("form#ADF_Form > button > span:nth-child(2)"))).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-multiselect-none"))).click(); 
//			driver.findElement(By.className("ui-multiselect-none")).click();        	   
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-multiselect-filterpicker-option-"+x+""))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-multiselect-close"))).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("html/body/header/bottom/toolbar/form/button")).click();
		Thread.sleep(2000);		
		driver.findElement(By.className("ui-multiselect-none")).click();        	   
		driver.findElement(By.className("ui-multiselect-close")).click();				
		Thread.sleep(4000);
	}
	
	public void filterOptions(WebDriver driver) throws InterruptedException{
		
		List<WebElement> allElements = driver.findElements(By.name("multiselect_filterpicker")); 
		System.out.println("Filter button selected and Elements present in Filter button: " +allElements.size());  

		for(int x = 0; x < allElements.size(); x++){
			driver.findElement(By.cssSelector("button.ui-multiselect.ui-widget.ui-state-default.ui-corner-all")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("ui-multiselect-none")).click();        	   
			driver.findElement(By.id("ui-multiselect-filterpicker-option-"+x+"")).click();
			driver.findElement(By.className("ui-multiselect-close")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.cssSelector("button.ui-multiselect.ui-widget.ui-state-default.ui-corner-all")).click();
		Thread.sleep(2000);		
		driver.findElement(By.className("ui-multiselect-none")).click();        	   
		driver.findElement(By.className("ui-multiselect-close")).click();				
		Thread.sleep(4000);
	}

	public void printButton(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("TangoGridPrintButton")).click();
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("div.ui-dialog-buttonset button:nth-child(2) > span")).click();
		Thread.sleep(2000);
	}
	
	public void tangoExport(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("TangoGridExportButton")).click();
		Thread.sleep(2000);	
	}
	
	public void assessmentType(WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);	
		driver.findElement(By.id("select2-asmttypeselect-container")).click();
		Thread.sleep(2000);	
		List<WebElement> asmtType = driver.findElements(By.className("select2-results__option"));
		System.out.println("Assessment Type present in Filter options are : " +asmtType.size()); 
		for (int i =2; i<=3;i++){
			driver.findElement(By.cssSelector("ul#select2-asmttypeselect-results li:nth-child("+i+")")).click();
		//	driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).click();
			Thread.sleep(2000);		
			driver.findElement(By.id("select2-asmttypeselect-container")).click();
		}	
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("ul#select2-asmttypeselect-results li:nth-child(1)")).click();
		Thread.sleep(2000);		
    }

	public void standards(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-cutoffpicker-container")).click();
		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));
		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		
		for(int i =2;i<=kentroStand.size(); i++){
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("ul#select2-cutoffpicker-results li:nth-child("+i+")")).click();
//			driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("select2-cutoffpicker-container")).click();
		}
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("ul#select2-cutoffpicker-results li:nth-child(1)")).click();
		Thread.sleep(2000);
	}

	public void ADF_Combobox(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-ADF_Default_Combobox-container")).click();
		Thread.sleep(2000);
		List<WebElement> ADFCombo = driver.findElements(By.className("select2-results__option"));
		Thread.sleep(2000);
		System.out.println("ADF combobox present in Filter options are : " +ADFCombo.size()); 
		for (int i =1;i<=ADFCombo.size(); i++){
			Thread.sleep(1000);
			String text = driver.findElement(By.cssSelector("ul#select2-ADF_Default_Combobox-results li:nth-child("+i+")")).getText();
			driver.findElement(By.cssSelector("ul#select2-ADF_Default_Combobox-results li:nth-child("+i+")")).click();
//			String text = driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).getText();
//			driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).click();
			Thread.sleep(2000);
			System.out.println("-->"+text);
			if(text.equals("Custom Range")){
				System.out.println("entered into custom range loop");
				for (int j =1 ; j<=10; j++){
					driver.findElement(By.xpath("//*[@id='ADF_Dialog_Start_Calendar']/div/div/a[1]/span")).click();
					Thread.sleep(1000);	
				}
				driver.findElement(By.xpath("//*[@id='ADF_Dialog_Start_Calendar']/div/table/tbody/tr[2]/td[2]/a")).click();
				driver.findElement(By.id("ADF_Dialog_Go_Button")).click();
				Thread.sleep(4000);
			}
			driver.findElement(By.id("select2-ADF_Default_Combobox-container")).click();
		}
		Thread.sleep(2000);		
		driver.findElement(By.cssSelector("ul#select2-ADF_Default_Combobox-results li:nth-child(1)")).click();
		Thread.sleep(2000);	
	}
	
	public void ADF_calendar(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("ADF_Calendar_Default_Button")).click();
		Thread.sleep(2000);	
		for (int i =1 ; i<=10; i++){
			driver.findElement(By.xpath("//*[@id='ADF_Dialog_Start_Calendar']/div/div/a[1]/span")).click();
			Thread.sleep(1000);	
		}
		driver.findElement(By.xpath("//*[@id='ADF_Dialog_Start_Calendar']/div/table/tbody/tr[2]/td[3]/a")).click();
		driver.findElement(By.id("ADF_Dialog_Go_Button")).click();
		Thread.sleep(4000);
	}
	
	//Yet to complete this feature..
	public void ScoreDetail(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-detailpicker-container")).click();
		Thread.sleep(1000);
		List<WebElement> Demo = driver.findElements(By.cssSelector(".select2-results-dept-0.select2-result.select2-result-unselectable.select2-result-with-children"));	            	
		WebElement data = Demo.get(1);	
		System.out.println(data.getText());
	}
				
	public void search_Student(WebDriver driver) throws InterruptedException{
//		System.out.println("-> "+studentID);
		driver.findElement(By.className("select2-selection__rendered")).click();
		Thread.sleep(2000);	
		WebElement element = driver.findElement(By.className("select2-search__field"));
		element.sendKeys(studentID);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("select2-selection__clear")).click();
		Thread.sleep(2000);	
	}

	public void reme_Search_Student(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-datatypeselect-container")).click();
		Thread.sleep(2000);	
		WebElement element = driver.findElement(By.className("select2-search__field"));
		element.sendKeys(studentID);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("select2-selection__clear")).click();
		Thread.sleep(2000);	
	}
		
	public void performance(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-sortBy-container")).click();
		Thread.sleep(2000);
		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));
		System.out.println("Performance present in Filter options are : " +kentroStand.size());  		
		for(int i =2;i<=kentroStand.size(); i++){
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li["+i+"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("select2-sortBy-container")).click();
		}
		Thread.sleep(2000);		
		driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li[1]")).click();
		Thread.sleep(2000);
	}
		
	public void summ_AllStudents(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-acccheck-container")).click();
		Thread.sleep(1000);
		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));
		System.out.println(" Filter options are : " +kentroStand.size());  		
		for(int i =2;i<=kentroStand.size(); i++){
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("ul#select2-acccheck-results li:nth-child("+i+")")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("select2-acccheck-container")).click();
		}
		Thread.sleep(2000);		
		driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li[1]")).click();
		Thread.sleep(2000);	
	}
	
	public void remediation_FilterOptions(WebDriver driver) throws InterruptedException{

		List<WebElement> allElements = driver.findElements(By.name("multiselect_filterpicker")); 
		System.out.println("remedaion Filter button selected and Elements present in Filter button: " +allElements.size());  

		for(int x = 0; x < allElements.size(); x++){
			driver.findElement(By.xpath("/html/body/header/bottom/toolbar/left/table/tbody/tr[1]/td[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("ui-multiselect-none")).click();        	   
			driver.findElement(By.id("ui-multiselect-filterpicker-option-"+x+"")).click();
			driver.findElement(By.className("ui-multiselect-close")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("/html/body/header/bottom/toolbar/left/table/tbody/tr[1]/td[2]/button")).click();
		Thread.sleep(2000);		
		driver.findElement(By.className("ui-multiselect-none")).click();        	   
		driver.findElement(By.className("ui-multiselect-close")).click();				
		Thread.sleep(4000);
	}
	
	public void panelFilter(WebDriver driver) throws InterruptedException{
//		driver.findElement(By.xpath("//*[@id='filterdrop']/button/span[2]")).click();
		Thread.sleep(2000);		
		List<WebElement> allElements = driver.findElements(By.name("multiselect_filterselector")); 
		System.out.println("panel Filter button selected and Elements present in Filter button: " +allElements.size());  

		for(int x = 0; x < allElements.size(); x++){
			driver.findElement(By.xpath("//*[@id='filterdrop']/button/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("ui-multiselect-none")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.id("ui-multiselect-filterselector-option-"+x+"")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("ui-multiselect-close")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//*[@id='filterdrop']/button/span[2]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.className("ui-multiselect-none")).click();        	   
		driver.findElement(By.className("ui-multiselect-close")).click();				
		Thread.sleep(4000);
	}
	
	public void yearDropDown(WebDriver driver) throws InterruptedException{
		driver.findElement(By.className("select2-selection__rendered")).click();
		List<WebElement> years = driver.findElements(By.className("select2-results__option"));
//		System.out.println(years);
		for (int i =1; i<=years.size();i++){
			driver.findElement(By.cssSelector("ul.select2-results__options li:nth-child("+i+")")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("select2-selection__rendered")).click();
			Thread.sleep(1000);
		}		
		driver.findElement(By.cssSelector("ul.select2-results__options li:nth-child(2)")).click();
		Thread.sleep(1000);
	}
	
	public void rubric_Search_Student(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("select2-studentselect-container")).click();
		Thread.sleep(2000);	
		WebElement element = driver.findElement(By.className("select2-search__field"));
		element.sendKeys(studentID);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("select2-selection__clear")).click();
		Thread.sleep(2000);	
	}

	public void TELPAS_Domain(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("select2-Section-container")).click();
		Thread.sleep(2000);	
		List<WebElement> domain = driver.findElements(By.className("select2-results__option"));
//		System.out.println(years);
		for (int i =1; i<=domain.size();i++){
			driver.findElement(By.cssSelector("ul#select2-Section-results li:nth-child("+i+")")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("select2-Section-container")).click();
			Thread.sleep(1000);
		}		
		driver.findElement(By.cssSelector("ul#select2-Section-results li:nth-child(1)")).click();
		Thread.sleep(1000);		
	}

	public void campusFilter(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("select2-CampusCode-container")).click();
		Thread.sleep(2000);	
		List<WebElement> campusList = driver.findElements(By.className("select2-results__option"));
		System.out.println(campusList.size());
		for (int i =1; i<=campusList.size();i++){
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("ul.select2-results__options li:nth-child("+i+")")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("select2-CampusCode-container")).click();
			Thread.sleep(1000);
		}		
		driver.findElement(By.cssSelector("ul.select2-results__options li:nth-child(1)")).click();
		Thread.sleep(1000);
	}

    //Not using below methods..	
	public void stud_kentroStandard(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("select2-cutoffpicker-container")).click();

		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));

		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		

		for(int i =2;i<kentroStand.size(); i++){

			Thread.sleep(1000);

			driver.findElement(By.xpath("html/body/span[18]/span/span[2]/ul/li["+i+"]")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("select2-cutoffpicker-container")).click();

		}

	}

	public void RC_kentroStandard(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("select2-cutoffpicker-container")).click();

		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));

		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		

		for(int i =2;i<=kentroStand.size(); i++){

			Thread.sleep(1000);

			driver.findElement(By.xpath("html/body/span[2]/span/span[2]/ul/li["+i+"]")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("select2-cutoffpicker-container")).click();

		}

		Thread.sleep(2000);		

		driver.findElement(By.xpath("html/body/span[2]/span/span[2]/ul/li[1]")).click();

		Thread.sleep(2000);

	}

	public void Demo_kentroStandard(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("select2-cutoffpicker-container")).click();

		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));

		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		

		for(int i =2;i<=kentroStand.size(); i++){

			Thread.sleep(1000);

			driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li["+i+"]")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("select2-cutoffpicker-container")).click();

		}

		Thread.sleep(2000);		

		driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li[1]")).click();

		Thread.sleep(2000);

	}

	public void TEKS_kentroStandard(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("select2-cutoffpicker-container")).click();

		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));

		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		

		for(int i =2;i<=kentroStand.size(); i++){

			Thread.sleep(1000);

			driver.findElement(By.xpath("html/body/span[4]/span/span[2]/ul/li["+i+"]")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("select2-cutoffpicker-container")).click();

		}

		Thread.sleep(2000);		

		driver.findElement(By.xpath("html/body/span[4]/span/span[2]/ul/li[1]")).click();

		Thread.sleep(2000);

	}

	public void summ_kentroStandard(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("select2-cutoffpicker-container")).click();

		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));

		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		

		for(int i =2;i<=kentroStand.size(); i++){

			Thread.sleep(1000);

			driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li["+i+"]")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("select2-cutoffpicker-container")).click();

		}

		Thread.sleep(2000);		

		driver.findElement(By.xpath("html/body/span/span/span[2]/ul/li[1]")).click();

		Thread.sleep(2000);

	}

}
