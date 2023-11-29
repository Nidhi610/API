package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LeadsPage;
import pages.LoginPage;
import pages.OpportunitiesPage;
import utilities.CommonUtils;

public class LeadsTest extends BaseTest {

	WebDriver driver = BaseTest.getDriver();
	LeadsPage lp;
	
	@BeforeClass
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	@Test (priority = 1)
	public void leads_TC20() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
	}
	
	@Test (priority = 1)
	public void dropdownVerifyTest_TC21() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test (priority = 1)
	public void dropdownVerifyTest_TC22() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.creatTodayLeads(driver), "");
		BaseTest.test.info("Selected today leads");
	}
	
	@Test (priority = 1)
	public void goVerifyTest_TC23() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.goVerify(driver), "");
		BaseTest.test.info("Selected go verify");
	}
	
	@Test (priority = 1)
	public void todayLeadVerifyTest_TC24() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.todayLeadPage(driver), "");
		BaseTest.test.info("Selected today lead page");
	}
	
	@Test (priority = 1)
	public void newLeadVerifyTest_TC25() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		CommonUtils.waitForElement(driver, lp.leadsLink);
		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.creatNewLead(driver), "");
		BaseTest.test.info("created new lead");
	}
	
	
	
//	 verify session & dropdown verify baki
	
}
