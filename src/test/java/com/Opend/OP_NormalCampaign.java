package com.Opend;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OP_NormalCampaign {

	WebDriver driver;
	public OP_NormalCampaign(WebDriver driver) {
		this.driver= driver;
	}
	By Campaign01= By.xpath("//li[@class='campaigns-menu removeLSB']");
	//By create_btn = By.xpath("//a[.=' Start New Campaign']");
	By dropdown_01 = By.xpath("//select[@ng-model='campaign_status']");
	//By dropdown_02 = By.xpath("//select[@ng-model='selectuser']");
	By dropdown_02 = By.xpath("By dropdown_02 = By.xpath(\"//select[@ng-model='selectuser']\");");
	By Editable = By.xpath("(//button[.='Edit'])[2]");
	By camp_name= By.xpath("(//input[@id='camp_name_id'])[1]");
	//By AdvOption_01 = By.xpath("//option[.='Automobiles (sandeep@active.agency)']");
	By Camp_Group=By.xpath("(//select[@ng-model='campaign_group'])[1]");
	By ADV_costType= By.xpath("(//label[.='Free'])[1]");
	By country = By.xpath("(//select[@ng-model='country_iso'])[1]");
	By Aud_Reach =By.xpath("(//select[@ng-model='audience_type'])[1]");
	By Camp_category = By.xpath("(//input[@ng-model='audience_category_text'])[1]");
	By Categ_option = By.xpath("//label[.='Automotive']");
	By Btn =By.xpath("(//button[.='Select'])[2]");
	By Sub_Categ = By.xpath("(//input[@ng-model='functionalareaText'])[1]");
	By Sub_categ_option = By.xpath("(//label[.='Select All'])[1]");
	By Categ_Btn=By.xpath("(//button[.='Select'])[1]");
	By PB = By.xpath("//input[@ng-model='publisherText']");
	By PB_list = By.xpath("//label[.='Latch 2']");
	By PB_btn = By.xpath("(//button[.='Select'])[3]");
	By PB_Cost_type = By.xpath("(//label[.='Free'])[2]");
	By proseed = By.xpath("(//button[.='Proceed'])[2]");
	
	// second step of campaign Xpath (Element Address)
	
	By verify_name = By.xpath("(//span[.=' Campaign Template'])[1]");
	By from_name = By.xpath("//select[@ng-model='checkfromname']");
	By Subject_line=By.xpath("//input[@id='subjectone']");
	By first_name= By.xpath("(//a[.='{first name}'])[1]");
	By Template_Saved = By.id("uploadBtn1");
	By Select_Template = By.xpath("(//button[.='Select'])[1]");
	By Temp_Frame = By.xpath("//iframe[@title='Rich Text Editor, email_ckeditor']");
	By Edit_body = By.xpath("//body[@contenteditable='true']");
	By proseed_01 = By.xpath("(//button[.='Proceed'])[3]");
	
	// Third Step of campaign Xpath (Element Address)
	
	By Verify_name_01 = By.xpath("(//span[.='Choose Audience'])[1]");
	By gender = By.xpath("//label[.='Male']");
	By drag_age = By.xpath("//span[@aria-valuenow='18']");
	By drop_age = By.xpath("//span[@aria-valuenow='61']");
	By Email_domain = By.xpath("//label[.='Custom']");
	By incl_emailDomain = By.xpath("//button[@data-toggle='dropdown']");
	By domain_selectall = By.xpath("//label[.='  Select all']");
	By Advance_option = By.xpath("//label[.='Enable']");
	By Email_status = By.xpath("//select[@ng-model='selectemailstatus']");
	By Calender = By.xpath("(//button[@class='date-button'])[1]");
	By prevoius_btn = By.xpath("//i[@class='fa fa-angle-left']");
	//By next_btn = By.xpath("//i[@class='fa fa-angle-right']");
	By Selected_date = By.xpath("(//span[.='01'])[1]");
	By proseed_03 = By.xpath("(//button[.='Proceed'])[4]");
	
	// fourth step of campaign xpath (Element Address)
	
	By Verify_name_02 = By.xpath("(//span[.='Targeting & Send Options'])[1]");
	By AR_opened = By.xpath("//input[@ng-model='slider.value']");
	By AR_others = By.xpath("//input[@ng-model='slider_others.value']");
	By Schedule = By.xpath("//label[.='Create a Campaign Schedule']");
	
	public void Normalcampaign_01() throws InterruptedException {
		driver.findElement(Campaign01).click();
		Thread.sleep(3000);
		WebElement Statusdown = driver.findElement(dropdown_01);
		Select sel = new Select(Statusdown);
		sel.selectByVisibleText("Saved");
		Thread.sleep(2000);
		/*WebElement ADVoption = driver.findElement(dropdown_02);
		Select sel_01 = new Select(ADVoption);
		Thread.sleep(3000);
		sel.selectByIndex(64);*/
		Thread.sleep(2000);
		driver.findElement(Editable).click();
		Thread.sleep(2000);
		System.out.println("First Step of Campaign");
		Thread.sleep(2000);
		driver.findElement(camp_name).sendKeys("Test Suff Open");
		Thread.sleep(2000);
		WebElement  Camp_Group_drop= driver.findElement(Camp_Group);
		Select sel_02 = new Select(Camp_Group_drop);
		sel_02.selectByVisibleText("Default");
		Thread.sleep(2000);
		driver.findElement(ADV_costType).click();
		Thread.sleep(2000);
		WebElement country_name = driver.findElement(country);
		Select sel_03 = new Select(country_name);
		sel_03.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,506)");
		WebElement Audience_Reach = driver.findElement(Aud_Reach);
		Select sel_04 = new Select(Audience_Reach);
		sel_04.selectByVisibleText("UK Consumer Data");
		Thread.sleep(2000);
		driver.findElement(Camp_category).click();
		Thread.sleep(3000);
		Set<String> Pid = driver.getWindowHandles();
		for(String id :Pid) {
			driver.switchTo().window(id);
			Thread.sleep(2000); 
			}
		driver.findElement(Categ_option).click();
		Thread.sleep(2000);
		driver.findElement(Btn).click();
		Thread.sleep(3000);
		driver.findElement(Sub_Categ).click();
		Thread.sleep(2000);
		Set<String> Pid01 = driver.getWindowHandles();
		for(String id1 :Pid01) {
			driver.switchTo().window(id1);
		Thread.sleep(2000);
		driver.findElement(Sub_categ_option).click();
		Thread.sleep(2000);
		driver.findElement(Categ_Btn).click();
		Thread.sleep(2000);
		driver.findElement(PB).click();
		Thread.sleep(2000);
		driver.findElement(PB_list).click();
		Thread.sleep(2000);
		driver.findElement(PB_btn).click();
		Thread.sleep(2000);
		driver.findElement(PB_Cost_type).click();
		Thread.sleep(2000);
		driver.findElement(proseed).click();
		
		/* Second Step of campaign i.e : Campaign Template
		-----------------------------------------------------------*/
		
		WebElement text = driver.findElement(verify_name);
		String actual_text= "Campaign Template";
		String Expected_Text = text.getText();
		Assert.assertEquals(actual_text, Expected_Text);
		System.out.println(Expected_Text);
		Thread.sleep(2000);
		//Assert.assertEquals(actual_text, Expected_Text);
		WebElement from_Cname = driver.findElement(from_name);
		Select sel_05 = new Select(from_Cname);
		sel_05.selectByVisibleText("[List Name]");
		Thread.sleep(3000);
		driver.findElement(Subject_line).sendKeys("Test Campaign");
		Thread.sleep(2000);
		driver.findElement(first_name).click();
		Thread.sleep(2000);
		JavascriptExecutor js_03 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,527)");
//		driver.findElement(Template_Saved).click();
//		Thread.sleep(2000);
//		Set<String> Pid_03 =driver.getWindowHandles();
//		for(String id_03 :Pid_03) {
//			driver.switchTo().window(id_03);
//		}
//		driver.findElement(Select_Template).click();
//		Thread.sleep(2000);
		WebElement Frame = driver.findElement(Temp_Frame);
		driver.switchTo().frame(Frame);
		driver.findElement(Edit_body).sendKeys("aaaaaaaaa");
		
//		JavascriptExecutor js_04 = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(4000);
		driver.findElement(proseed_01).click();
		Thread.sleep(4000);
		
		/* Third Step of campaign i.e : Choose Audience
		-----------------------------------------------------------*/
		
		WebElement text_01 = driver.findElement(Verify_name_01);
		String actual_text_01 = "Choose Audience";
		String Expected_text_01 = text_01.getText();
		org.testng.Assert.assertEquals(actual_text_01, Expected_text_01);
		System.out.println(Expected_text_01);
		Thread.sleep(2000);
		driver.findElement(gender).click();
		Thread.sleep(2000);
		/*WebElement drag_01 = driver.findElement(drag_age);
		WebElement Drop_01 = driver.findElement(drop_age);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_01, Drop_01);*/
		Thread.sleep(2000);
		JavascriptExecutor js_05 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(Email_domain).click();
		Thread.sleep(2000);
		driver.findElement(incl_emailDomain).click();
		Thread.sleep(2000);
		driver.findElement(domain_selectall).click();
		Thread.sleep(2000);
		driver.findElement(incl_emailDomain).click();
		Thread.sleep(2000);
		driver.findElement(Advance_option).click();
		Thread.sleep(2000);
		JavascriptExecutor js_06 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		WebElement Email_status_opened = driver.findElement(Email_status);
		Select sel_06 = new Select(Email_status_opened);
		sel_06.selectByVisibleText("Opened");
		Thread.sleep(2000);
		driver.findElement(Calender).click();
		Thread.sleep(2000);
		driver.findElement(prevoius_btn).click();
		Thread.sleep(1000);
		driver.findElement(prevoius_btn).click();
		//driver.findElement(next_btn).click();
		Thread.sleep(2000);
		driver.findElement(Selected_date).click();
		Thread.sleep(2000);
		driver.findElement(proseed_03).click();
		Thread.sleep(5000);
		
		
		/* Fourth Step of campaign i.e : Targetting and send options
		----------------------------------------------------------------*/
		
		WebElement text_02 = driver.findElement(Verify_name_02);
		String actual_text_02= "Targeting & Send Options";
		String Expected_text_02 = text_02.getText();
	    org.testng.Assert.assertEquals(actual_text_02, Expected_text_02);
	    Thread.sleep(2000);
	    driver.findElement(AR_opened).clear();
	    Thread.sleep(2000);
		driver.findElement(AR_opened).sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(AR_others).clear();
		Thread.sleep(2000);
		driver.findElement(AR_others).sendKeys("5");
		Thread.sleep(2000);
		JavascriptExecutor js_07 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700");
		Thread.sleep(2000);
		driver.findElement(Schedule).click();
		
		
		}
	}
}

	

