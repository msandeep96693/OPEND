package com.Opend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OP_Loginpage {

	WebDriver driver;
	public OP_Loginpage(WebDriver driver) {
		this.driver= driver;
	}
	By username=By.xpath("//input[@id='email_id']");
	By password=By.id("password");
	By Login_btn=By.xpath("//button[.='Sign In']");
	
	
	public void opendlogin() throws InterruptedException {
		driver.findElement(username).sendKeys("admin@opend.com");
		Thread.sleep(2000);
		driver.findElement(password).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(Login_btn).click();
		Thread.sleep(5000);
		
	}
}
