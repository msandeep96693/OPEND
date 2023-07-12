package com.opend.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Opend.OP_Base;
import com.Opend.OP_Dashboard;
import com.Opend.OP_Loginpage;
import com.Opend.OP_NormalCampaign;
import com.Opend.OP_contacts;
import com.Opend.OP_creatives;


public class Opend_Scenarios extends OP_Base{
	
	OP_Loginpage Login;
	OP_Dashboard board;
	OP_NormalCampaign NCampaign;
	OP_creatives Create;
	OP_contacts contact;
	
	@Test(priority = 1)
	public void OP_LoginOperation() throws InterruptedException {
		Login = new OP_Loginpage(driver);
		Login.opendlogin();
	}
	
	@Test(priority = 2, enabled = false)
	public void OP_DashboardOperation() throws InterruptedException {
		board = new OP_Dashboard(driver);
		board.OpendDashboard();
	}
	@Test(priority = 3, enabled = false)
	public void OP_NormalcampaignOPeration() throws InterruptedException {
		NCampaign = new OP_NormalCampaign(driver);
		NCampaign.Normalcampaign_01();
	}
	@Test(priority = 4, enabled = false)
	public void OP_CreativeOperation() throws InterruptedException {
		Create = new OP_creatives(driver);
		Create.OpendCreative();
	}
	@Test(priority = 2, enabled = true)
	public void OP_contactoperation() throws InterruptedException {
		contact = new OP_contacts(driver);
		contact.Opendcontact();
	}

}
