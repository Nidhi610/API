package testCase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constant.WaitConstants;
import pages.AccountPage;
import pages.LoginPage;
//import tests.BaseTest;
import utilities.CommonUtils;

public class AccountTest extends BaseTest {

	WebDriver driver = BaseTest.getDriver();
	AccountPage acc;
	
	@BeforeClass
	public void navigateToHome() throws IOException, InterruptedException {
		driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoApp(driver);
	}
	
	@Test (priority = 1)
	public void accountTest_TC10() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		System.out.println("accountlink click");
		Assert.assertTrue(acc.creatNewAccount(driver), "");
		BaseTest.test.info("Selected creat new account");
	}
	
	@Test (priority = 1)
	public void newViewLinkTest_TC11() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		Assert.assertTrue(acc.creatNewView(driver), "");
		BaseTest.test.info("Selected creat new view");
	}
	
	@Test (priority = 1)
	public void editLinkTest_TC12() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		Assert.assertTrue(acc.clickEdit(driver), "");
		BaseTest.test.info("Selected edit");
	}
	
	@Test (priority = 1)
	public void mergeAccountTest_TC13() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		Assert.assertTrue(acc.clickMergeAccount(driver), "");  alert baki
		BaseTest.test.info("Selected mergr account");
	}
	
	@Test (priority = 1)
	public void historyTest_TC14() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		CommonUtils.waitForElement(driver, acc.accountLink);
		acc.accountLink.click();
		Assert.assertTrue(acc.clickAccountLastActivityHistory(driver), "");  
		BaseTest.test.info("Selected last activity history");
	}
		
}
