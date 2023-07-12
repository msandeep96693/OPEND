package com.Opend;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OP_contacts {

	WebDriver driver;
	public OP_contacts(WebDriver driver) {
		this.driver = driver;
	}
	
	By admin_contact = By.xpath("//li[@class='contact-menu removeLSB']");
	By search_contact = By.xpath("//input[@placeholder='Search Contacts']");
	By Status_Contact = By.xpath("//select[@ng-model='status_search']");
	By PB_list = By.xpath("//select[@id='publisher_list']");
	By verify_PB = By.xpath("(//span[@class='camp-list-body ng-binding'])[2]");
	By reset_btn = By.xpath("//button[.='Reset']");
	
	// create a contact xpath 
	
	By create_contact = By.xpath("//a[@class='crt_camp_btn change-btn-width']");
	By publisher_drop = By.xpath("(//select[@ng-model='publisher_select'])[1]");
	By contact_name = By.xpath("//input[@ng-model='list_name']");
	By AT_name = By.xpath("//input[@ng-click='open_audience_type();']");
	By search_bar_01 = By.xpath("//input[@ng-model='searchTypeMultiSelect']");
	By select_uk_consumer = By.xpath("//label[.='UK Consumer Data']");
	By select_btn_01 = By.xpath("(//button[.='Select'])[2]");
	By CPM_Payout_price = By.xpath("//input[@ng-model='cpm_payout_price']");
	By usage_limit = By.xpath("//input[@ng-model='usage_limit']");
	By Sub_camp_category = By.xpath("//input[@ng-model='selectedValue']");
	By search_bar_02 = By.xpath("//input[@ng-model='searchTextMultiSelect']");
	By select_automotive = By.xpath("//label[.='Automotive']");
	By select_btn_02 = By.xpath("(//button[.='Select'])[1]");
	By country_drop = By.xpath("//select[@ng-model='country']");
	By upload = By.id("uploadFile");
	By Default_name = By.xpath("//input[@ng-model='contacts_from_name']");
	By add_contact = By.xpath("//button[.='Add']");
	
	
	public void Opendcontact() throws InterruptedException {
		
		// By using filter , search and status a contact and publisher
		
		driver.findElement(admin_contact).click();
		Thread.sleep(2000);
		driver.findElement(search_contact).sendKeys("API");
		Thread.sleep(2000);
		WebElement status = driver.findElement(Status_Contact);
		Select sel_01 = new Select(status);
		sel_01.selectByVisibleText("Active");
		Thread.sleep(2000);
		WebElement PB_drop = driver.findElement(PB_list);
		Select sel_02 =new Select(PB_drop);
		sel_02.selectByVisibleText("Myntra (sandeep@active.agency)");
		Thread.sleep(2000);
		boolean PB_Name = driver.findElement(verify_PB).isDisplayed();
		Assert.assertTrue(PB_Name);
		System.out.println("PB_Name "+PB_Name);
		Thread.sleep(2000);
		driver.findElement(reset_btn).click();
		
		// create a contact ....
		
		
		driver.findElement(create_contact).click();
		Thread.sleep(2000);
		WebElement PB_name_drop = driver.findElement(publisher_drop);
		Select sel_03 = new Select(PB_name_drop);
		sel_03.selectByVisibleText("Myntra (sandeep@active.agency)");
		Thread.sleep(2000);
		driver.findElement(contact_name).sendKeys("Test_Elastic");
		Thread.sleep(2000);
		driver.findElement(AT_name).click();
		Thread.sleep(2000);
		Set<String> Pid = driver.getWindowHandles();
		for(String Cid : Pid) {
			driver.switchTo().window(Cid);
		}
		driver.findElement(search_bar_01);
		Thread.sleep(2000);
		driver.findElement(select_uk_consumer).click();
		Thread.sleep(2000);
		driver.findElement(select_btn_01).click();
		Thread.sleep(2000);
		JavascriptExecutor js_01 = (JavascriptExecutor) driver;
		js_01.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(CPM_Payout_price).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(usage_limit).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(Sub_camp_category).click();
		Thread.sleep(2000);
		Set<String> pid_01 = driver.getWindowHandles();
		for(String Cid_01 : pid_01) {
			driver.switchTo().window(Cid_01);
		}
		driver.findElement(search_bar_02).sendKeys("AU");
		Thread.sleep(2000);
		driver.findElement(select_automotive).click();
		Thread.sleep(2000);
		driver.findElement(select_btn_02).click();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(country_drop);
		Select sel_04 = new Select(drop);
		sel_03.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		JavascriptExecutor js_02 = (JavascriptExecutor) driver;
		js_01.executeScript("window.scrollBy(0,550)");
		Thread.sleep(2000);
		WebElement upload_file = driver.findElement(upload);
		upload_file.sendKeys("/home/active34/Documents/B2C Contact LIst/B2C folder/CTest02_B2C_250.csv");
		Thread.sleep(2000);  
		driver.findElement(Default_name).sendKeys("Test Mails");
		Thread.sleep(2000);
		JavascriptExecutor js_03 = (JavascriptExecutor) driver;
		js_01.executeScript("window.scrollBy(0,1420)");
		Thread.sleep(2000);
		boolean get_text = driver.findElement(add_contact).isDisplayed();
		Assert.assertTrue(get_text);
		System.out.println(get_text);
		Thread.sleep(2000);
		driver.findElement(add_contact).click();
		
		// Data mapping 
		
	}
	

}
