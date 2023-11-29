package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.FileConstants;
import utilities.CommonUtils;
import utilities.ReadpropertyFile;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	public WebElement username;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"error\"]")
	public WebElement wrongPassword;
	
	@FindBy(id = "Login")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"rememberUn\"]")
	public WebElement rememberMe;
	
	@FindBy(id = "error")
	public WebElement errorMessage; //*[@id="error"]
	
	@FindBy(xpath = "//*[@id=\"forgot_password_link\"]") 
	public WebElement forgotPassword;
	
	@FindBy(id = "un")
	public WebElement forgotUserName;
	
	@FindBy(id = "//a[text()='Return to Login']")
	public WebElement returnToLoginButton;
	
	
	
	public boolean selectRememberMeCheckBox() {
		logger.info("LoginPage : selectRememberMeCheckBox : Started");
		boolean isSelected = false;
		if(! rememberMe.isSelected()) {
			logger.info("LoginPage : selectRememberMeCheckBox : remember me checkbox selected");
			rememberMe.click();
			isSelected = true;
		}
		logger.info("LoginPage : selectRememberMeCheckBox : Ended");
		return isSelected;
	}
	
	public void loginIntoApp(WebDriver driver) throws IOException, InterruptedException {
		
		driver.get(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "testurl"));
		logger.info("LoginPage : loginIntoApp : started");
		if(CommonUtils.waitForElement(driver, username)) {
			username.sendKeys(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
			password.sendKeys(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "password"));
			loginButton.click();
			logger.info("LoginPage : loginIntoApp : clicked ion login button");
		}
		
	}
	
	public void loginIntoAppWithNoPassword(WebDriver driver) throws IOException, InterruptedException {
		
		driver.get(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "testurl"));
		if(CommonUtils.waitForElement(driver, username)) {
			username.sendKeys(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
			password.clear();
			loginButton.click();
		}
	}
	
	public void loginIntoAppWithForgotPassword(WebDriver driver) throws IOException, InterruptedException {
		
		driver.get(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "testurl"));
		if(CommonUtils.waitForElement(driver, username)) {
			username.sendKeys(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
			forgotPassword.click();
			Thread.sleep(2000);
		}
	}
	
	public void loginIntoAppWithIncorrectDetail(WebDriver driver) throws IOException, InterruptedException {
		
		driver.get(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "testurl"));
		if(CommonUtils.waitForElement(driver, username)) {
			username.sendKeys(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH, "username"));
			password.sendKeys(ReadpropertyFile.readPropertyFile(FileConstants.LOGIN_TESTDATA_FILE_PATH, "password"));
			loginButton.click();
			wrongPassword.isDisplayed();
			Thread.sleep(2000);
		}
	}
	
	
	
	
}
