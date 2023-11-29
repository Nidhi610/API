package testCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constant.FileConstants;
import pages.LoginPage;
import pages.UserMenuPage;
import tests.BaseTest;
import utilities.CommonUtils;
import utilities.ReadExcelData;
import utilities.ReadpropertyFile;

public class UserMenuTest extends BaseTest {
	
	WebDriver driver;
	UserMenuPage ump ;
	
	@BeforeClass
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}

	@Test (priority = 1)
	public void userMenuDropDownVerify_TC5() throws InterruptedException, IOException {
		
		ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		ump.userMenu.click();
		Assert.assertTrue(ump.verifyUserMenuItem(), "fail");
		BaseTest.test.info("Verified User Menu items");
	}
	
	@Test (priority = 2)
	public void myProfileVerify_TC6() throws InterruptedException, IOException {
		
		ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		BaseTest.test.info("Username element is visible");
		
		ump.userMenu.click();
		BaseTest.test.info("clicked on usermenu");
		
		Assert.assertTrue(ump.selectMyProfile(), "");
		BaseTest.test.info("Selected my profile");
		CommonUtils.waitForElement(driver, ump.profilePage);
		BaseTest.test.info("profile page loaded");
		Assert.assertTrue(ump.isProfilePageVisible(), "");
		
		ump.editContact(driver);
		Assert.assertTrue(ump.verifyEditContactPopUp(driver), "");
		BaseTest.test.info("Edit contact pop up verified");
		Assert.assertTrue(ump.verfiyLastNameChangeInAboutTab(driver, ReadpropertyFile.readUserMenuTestData("lastName")), "");
		BaseTest.test.info("Verified last name change");
		
		Assert.assertTrue(ump.verifyCreatePost(driver, "Hello welcome to Java"));
		BaseTest.test.info("Verified create post");
		
		Assert.assertTrue(ump.verifyFileUpload(driver, FileConstants.LOGIN_TESTDATA_FILE_PATH));
		BaseTest.test.info("Verified file upload");
		
		Assert.assertTrue(ump.verifyPhotoUpload(driver, FileConstants.PROFILE_PHOTO_FILE_PATH));
		BaseTest.test.info("Verified photo upload");
	}
		
	@Test (priority = 3)
	public void mySettingTest_TC7() throws InterruptedException, IOException {
		
		ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		ump.userMenu.click();
		BaseTest.test.info("clicked on usermenu");
		
		Assert.assertTrue(ump.selectMySetting(), "");
		BaseTest.test.info("Selected my setting");
		
		ump.clickPersonal(driver);
		Assert.assertTrue(ump.selectLoginHistory(driver), "");
		BaseTest.test.info("Selected login history");
		
		Assert.assertTrue(ump.clickDisplayAndLayout(driver), "");
		BaseTest.test.info("Selecteddisplay and layout");
		
		ump.selectEmail(driver);
		Assert.assertTrue(ump.clickEmailSetting(driver), "");
		BaseTest.test.info("Selected email setting");
		
		ump.selectCalendarAndReminder(driver);
		Assert.assertTrue(ump.activityReminder(driver), "");
		BaseTest.test.info("Selected activity reminder");
	}
	
	@Test (priority = 4)
	public void developerConsoleTest_TC8() throws InterruptedException, IOException {
		
		ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		ump.userMenu.click();
		Assert.assertTrue(ump.selectDeveloperConsole(driver), "");
		BaseTest.test.info("Selected developer console");
	}
	
	@Test (priority = 5)
	public void logoutTest_TC9() throws InterruptedException, IOException {
		
		ump = new UserMenuPage(driver);
		CommonUtils.waitForElement(driver, ump.userMenu);
		ump.userMenu.click();
		Assert.assertTrue(ump.selectLogout(driver), "");
		BaseTest.test.info("Selected logout");
	}
}
