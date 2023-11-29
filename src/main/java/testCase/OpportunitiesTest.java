package testCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constant.WaitConstants;
import pages.LoginPage;
import pages.OpportunitiesPage;
import pages.UserMenuPage;
import utilities.CommonUtils;

public class OpportunitiesTest extends BaseTest {
	
	WebDriver driver = BaseTest.getDriver();
	OpportunitiesPage opp;
	
	@BeforeClass
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	@Test (priority = 1)
	public void opportunities_TC15() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.verifyOpportunitiesDropdown(), "fail");            
		BaseTest.test.info("Dropdown verified");
	}
	
	@Test (priority = 1)
	public void editOpportunitiesTest_TC16() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.creatNewOppertunity(driver), "");
		BaseTest.test.info("created new oppertunity");
	}
	
	@Test (priority = 1)
	public void pipelineTest_TC17() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.clickPipeline(driver), "");
		BaseTest.test.info("Selected pipeline");
	}
	
	@Test (priority = 1)
	public void stuckOppertunityLinkTest_TC18() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.clickStuckOppertunity(driver), "");
		BaseTest.test.info("Selected stuck oppertunity");
	}
	
	@Test (priority = 1)
	public void quarterlySummaryLinkTest_TC19() throws IOException, InterruptedException {
		
		opp = new OpportunitiesPage(driver);
		CommonUtils.waitForElement(driver, opp.opportunitiesLink);
		opp.opportunitiesLink.click();
		Thread.sleep(4000);
		Assert.assertTrue(opp.clickQuarterlySummary(driver), "");
		BaseTest.test.info("Selected quarterly summary");
	}
		
}
