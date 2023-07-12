package com.Opend;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OP_creatives {

	WebDriver driver;
	public OP_creatives(WebDriver driver) {
		this.driver= driver;
	}
	
	//By Creative_Btn = By.xpath("//li[@class='creatives-menu']");  //*[@id="sidebar"]/ul/li[4]/a
	By Creative_Btn = By.xpath("//a[.='Creatives']");
	By verify_Creative_text = By.xpath("//h2[@class='main-title']");
	By Add_Creative_btn = By.xpath("//a[@class='crt_camp_btn change-btn-width']");
	By adv_drop = By.xpath("//select[@ng-model='advertiser_selected']");
	By template_Name = By.xpath("//input[@ng-model='templateName']");
	By template_groupID = By.xpath("//select[@ng-model='group_id']");
	By preheader_text = By.xpath("//input[@ng-model='preheaderText']");
	By Template_body_frame = By.xpath("//iframe[@title='Rich Text Editor, email_ckeditor']");
	By Edit_body = By.xpath("//body[@contenteditable='true']");
	By add_btn = By.xpath("(//button[@ng-model='add-view'])[1]");

	
	public void OpendCreative() throws InterruptedException {
		driver.findElement(Creative_Btn).click();
		Thread.sleep(2000);
		boolean text_creative = driver.findElement(verify_Creative_text).isDisplayed();
		Assert.assertTrue(text_creative);
		System.out.println(text_creative);
		Thread.sleep(2000);
		driver.findElement(Add_Creative_btn).click();
		Thread.sleep(2000);
		WebElement advertiser = driver.findElement(adv_drop);
		Select sel = new Select(advertiser);
		sel.selectByVisibleText("Automobiles (sandeep@active.agency)");
		Thread.sleep(2000);
		driver.findElement(template_Name).sendKeys("Test_B2C");
		Thread.sleep(2000);
		WebElement Group_ID = driver.findElement(template_groupID);
		Select sel01 = new Select(Group_ID);
		sel01.selectByVisibleText("Default Group");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(preheader_text).sendKeys("Mega Offer, Big Millions Stock offer");
		Thread.sleep(2000);
//		JavascriptExecutor js01 = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		WebElement Body_frame = driver.findElement(Template_body_frame);
		driver.switchTo().frame(Body_frame);
		Thread.sleep(2000);
		driver.findElement(Edit_body).sendKeys("Mega OFFER, BIG MIILIONS STOCK OFFER");
		Thread.sleep(2000);
		JavascriptExecutor js02 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//driver.findElement(add_btn).click();
		WebElement print_text = driver.findElement(add_btn);
		System.out.println(print_text);
		
	}
}
