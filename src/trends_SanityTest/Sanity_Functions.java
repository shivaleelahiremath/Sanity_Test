package trends_SanityTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sanity_Functions {

	public void backMain(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("menubutton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ui-id-1")).click();
		Thread.sleep(2000);	
	}

	public void filterOptions(WebDriver driver) throws InterruptedException{

		List<WebElement> allElements = driver.findElements(By.name("multiselect_filterpicker")); 
		System.out.println("Filter button selected and Elements present in Filter button: " +allElements.size());  

		for(int x = 0; x < allElements.size(); x++){
			driver.findElement(By.xpath("html/body/header/bottom/toolbar/form/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("ui-multiselect-none")).click();        	   
			driver.findElement(By.id("ui-multiselect-filterpicker-option-"+x+"")).click();
			driver.findElement(By.className("ui-multiselect-close")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("html/body/header/bottom/toolbar/form/button")).click();
		Thread.sleep(2000);		
		driver.findElement(By.className("ui-multiselect-none")).click();        	   
		driver.findElement(By.className("ui-multiselect-close")).click();				
		Thread.sleep(4000);
	}

	public void printButton(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("TangoGridPrintButton")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("/html/body/div[20]/div[3]/div/button[2]/span")).click();
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
		for (int i =1; i<=3;i++){
			driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).click();
			Thread.sleep(2000);		
			driver.findElement(By.id("select2-asmttypeselect-container")).click();
		}		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li[1]")).click();
		Thread.sleep(2000);		
	}

	public void asmt_kentroStandard(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-cutoffpicker-container")).click();
		List<WebElement> kentroStand = driver.findElements(By.className("select2-results__option"));
		System.out.println("Kentro standards present in Filter options are : " +kentroStand.size());  		
		for(int i =2;i<=kentroStand.size(); i++){
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("select2-cutoffpicker-container")).click();
		}
		Thread.sleep(2000);		
		driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li[1]")).click();
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
			String text = driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).getText();
			driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li["+i+"]")).click();
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
		driver.findElement(By.xpath("html/body/span[6]/span/span[2]/ul/li[2]")).click();
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
	
	public void ScoreDetail(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("select2-detailpicker-container")).click();
		Thread.sleep(1000);
		List<WebElement> scoreDetail = driver.findElements(By.className("select2-results__option"));
		System.out.println("Score details : " +scoreDetail.size());  		
		

	}

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
}
