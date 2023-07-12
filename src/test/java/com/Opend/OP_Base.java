package com.Opend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OP_Base {

	public WebDriver driver;
	@BeforeClass
	public void Beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	By Onelement = By.xpath("(//span[.='AO'])[1]");
	By logout_btn= By.xpath("//a[.='Logout']");
	
	@AfterClass
	public void Afterclass() throws InterruptedException {
//		WebElement move = driver.findElement(Onelement);
//		Actions act = new Actions(driver);
//		act.moveToElement(move).perform();
//		Thread.sleep(2000);
//		driver.findElement(logout_btn).click();
//		Thread.sleep(3000);
		driver.close();
	}
}
