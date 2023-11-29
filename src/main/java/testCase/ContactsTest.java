package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.LeadsPage;
import pages.LoginPage;
import pages.OpportunitiesPage;
import utilities.CommonUtils;

public class ContactsTest extends BaseTest{

	WebDriver driver = BaseTest.getDriver();
	ContactsPage cp;
	
	@BeforeClass
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	@Test (priority = 1)
	public void newContactsTest_TC26() throws IOException, InterruptedException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.selectNew(driver), "");
		BaseTest.test.info("Selected new");
	}
	
	@Test (priority = 1)
	public void newViewTest_TC27() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.selectNewView(driver), "");
		BaseTest.test.info("Selected new view");
	}
	
	@Test (priority = 1)
	public void recentlyCreatedTest_TC28() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.selectRecentlyCreated(driver), "");
		BaseTest.test.info("Selected recently created");
	}

	@Test (priority = 1)
	public void newViewTest_TC29() throws InterruptedException, IOException {
	
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.selectMyContacts(driver), "");
		BaseTest.test.info("Selected my contacts");
	}
	
	@Test (priority = 1)
	public void recentContactsNameTest_TC30() throws InterruptedException, IOException {
	
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.selectRecentContactsName(driver), "");
		BaseTest.test.info("Selected recent contacts name");
	}
	
	@Test (priority = 1)
	public void errorViewUniqueNameTest_TC31() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.errorViewUniqueName(driver), "");
		BaseTest.test.info("Selected view unique name");
	}
	
	@Test (priority = 1)
	public void cancleButtonTest_TC32() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.newViewCancleButton(driver), "");
		BaseTest.test.info("Selected new view cancle button");
	}
	
	@Test (priority = 1)
	public void newContactWithErrorTest_TC33() throws InterruptedException, IOException {
		
		cp = new ContactsPage(driver);
		CommonUtils.waitForElement(driver, cp.contactsLink);
		cp.contactsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.selectNew2(driver), "");
		BaseTest.test.info("Selected new");
	}
	
}
