package com.Opend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OP_Dashboard {

	WebDriver driver;
	public OP_Dashboard(WebDriver driver) {
		this.driver= driver;
	}
	By Opendframe_01 = By.xpath("//iframe[@title='DashBoard']");
	By Dropdwon_02 = By.xpath("(//div[@class='button'])[2]");
	By Option_01 = By.xpath("//label[.='Normal']");
	By Option_02 = By.xpath("//label[.='Recurring']");
	By campaign_btn = By.xpath("//input[@type='submit']");
	
	public void OpendDashboard() throws InterruptedException {
		WebElement OpendSwitch = driver.findElement(Opendframe_01);
		driver.switchTo().frame(OpendSwitch);
		Thread.sleep(3000);
		driver.findElement(Dropdwon_02).click();
		Thread.sleep(3000);
		driver.findElement(Option_01).click();
		Thread.sleep(2000);
		driver.findElement(Option_02).click();
		Thread.sleep(2000);
		driver.findElement(campaign_btn).click();
	}
}
