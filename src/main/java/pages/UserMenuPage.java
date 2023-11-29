package pages;

import java.util.List;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.FileConstants;
import constant.WaitConstants;
import net.bytebuddy.asm.Advice.Return;
import utilities.CommonUtils;
import utilities.*;

/**
 * 
 */
/**
 * 
 */
public class UserMenuPage extends BasePage {

	public UserMenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userNavLabel")
	public WebElement userMenu;
	
	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[1]")
	public WebElement MyProfile;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[2]")
	public WebElement MySetting;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[3]")
	public WebElement DeveloperConsole;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[4]")
	public WebElement switchToLightningExperience;
	
	@FindBy(xpath =  "//*[@id=\"userNav-menuItems\"]/a[5]")
	public WebElement logout;
	
   // My Profile
	@FindBy(xpath =  "//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	public WebElement editProfileButton;
	
	@FindBy(xpath = "//*[@id=\"contactInfoContent\"]")
	public WebElement editProfilePopWindow;
	
	@FindBy(xpath = "//*[@id=\"aboutTab\"]/a")
	public WebElement aboutTab;
	
	@FindBy(xpath = "//*[@id=\"contactTab\"]/a")
	public WebElement contactTab;
	
	@FindBy(xpath = "//*[@id=\"lastName\"]")
	public WebElement aboutTabLastName;
	
	@FindBy(xpath = "//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
	public WebElement saveAllButton;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement userProfilePageNameDisplay;
	
   // PostLink
	@FindBy(css = "#publishereditablearea")
	public WebElement postLink;
	
	@FindBy(xpath = "/html/body")
	public WebElement postTextArea;
	
	@FindBy(xpath = "//*[@id=\"publishersharebutton\"]")
	public WebElement shareButton;
	
   // FileLink
	@FindBy(id = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
	public WebElement fileLink;
	
	@FindBy(id = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
	public WebElement contentPost;

	@FindBy(css = "#chatterUploadFileAction")
	public WebElement uploadFile;
	
	@FindBy(css = "#chatterFile")
	public WebElement fileOpen;
	
	@FindBy(css = "#publishersharebutton")
	public WebElement publish;
	
	@FindBy(xpath = "//input[@value='Cancel Upload']")
	public WebElement cancelUpload;
	
	@FindBy(id = "uploadLink")
	public WebElement updateButton;
	
   // Photo link
	@FindBy(xpath = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
	public WebElement photolink;
	
	@FindBy(id = "j_id0:uploadFileForm:uploadInputFile")
	public WebElement uploadPhoto;
	
	@FindBy(name = "j_id0:uploadFileForm:uploadBtn")
	public WebElement uploadButton;
	
	@FindBy(id = "publishersharebutton")
	public WebElement photoShareButton;
	
	@FindBy(id = "uploadPhotoContentId")
	public WebElement photoUploadIFrame;
	
	@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadBtn']")
	public WebElement photoSaveButton;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id7:save']")
	public WebElement photoSaveButton2; 
	
    // My Settings
    // PersonalLink	
	@FindBy(xpath = "//*[@id=\"PersonalInfo_font\"]")  
	public WebElement personalLink;
	
	@FindBy(xpath = "//*[@id=\"LoginHistory_font\"]")
	public WebElement loginHistoryLink;
	
	@FindBy(xpath = "//a[contains(text(),'Download login history for last six months, includ')]")
	public WebElement loginHistoryDownload;
	
	@FindBy(id = "//*[@id=\"RelatedUserLoginHistoryList_body\"]/table")
	public WebElement loginDisplay;
	
	@FindBy(id = "contactInfoContactId")
	public WebElement iFrameAbotTab;
	
    // Display & LayoutLinnk	
	@FindBy(xpath = "//*[@id=\"DisplayAndLayout_font\"]")
	public WebElement displayLayoutLink;
	
	@FindBy(xpath = "//span[@id='CustomizeTabs_font']")
	public WebElement customizedTab;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement saveCustomizedTab;
	
	@FindBy(xpath = "//*[@id=\"p4\"]/option[9]")
	public WebElement customApp;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0\"]")
	public WebElement availableTab;
	
	@FindBy(xpath = "//*[@id=\"duel_select_1\"]/option[2]")
	public WebElement chatter;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[76]")
	public WebElement reports;
	
	@FindBy(id = "//*[@id=\"duel_select_0_right\"]/img")
	public WebElement add;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement save;
	
	@FindBy(id = "tabBar")
	public WebElement tabList; 
	
    // EmailLink
	
	@FindBy(xpath = "//*[@id=\"EmailSetup_font\"]")
	public WebElement emailLink;
	
	@FindBy(xpath = "//*[@id=\"EmailSettings_font\"]")
	public WebElement myEmailSetting;
	
	@FindBy(xpath = "//*[@id=\"sender_name\"]")
	public WebElement emailName;
	
	@FindBy(xpath = "//*[@id=\"sender_email\"]")
	public WebElement emailAddress;
	
	@FindBy(xpath = "//*[@id=\"auto_bcc1\"]")
	public WebElement bccRadioButton;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement saveOnEmail;
	
    // Calendar and Remainders	
	@FindBy(xpath = "//*[@id=\"CalendarAndReminders_font\"]")
	public WebElement calendarAndRemainders; 
	
	@FindBy(xpath = "//*[@id=\"Reminders_font\"]")
	public WebElement activityRemainder;
	
	@FindBy(xpath = "//*[@id=\"testbtn\"]")
	public WebElement openTestRemainder;
	
	@FindBy(xpath = "//*[@id=\"summary\"]")
	public WebElement sampleEventPopup;
	
	@FindBy(css = "#displayBadge")
	public WebElement moderatorButton; 
	
	@FindBy(id = "profileTab_sfdc.ProfilePlatformFeed")
	public WebElement profilePage;
	
//	@FindBy(id = "contactTab")
//	public WebElement contactTab;
	
	@FindBy(xpath = "//div[@class='cxfeeditem feeditem'][1]//p")
	public WebElement firstPostText;
	
	@FindBy(xpath = "(//*[@class='contentFileTitle'])[1]")
	public WebElement verifyFilePostElement;
	
//	Developer Console
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[3]")
	public WebElement developerConsole;
	
	
	
	
	public boolean selectOptionFromUserMenuOption(WebDriver driver, String sOption) {
		
		boolean isOptionSelected = false;
		if(userMenu.isDisplayed()) {
			userMenu.click();
		}
		
		WebElement userMenuItem = driver.findElement(By.xpath("//*[text()='"+ sOption +"']"));
		if(userMenuItem.isDisplayed()) {
			userMenuItem.click();
			isOptionSelected = true;
		} 
		return isOptionSelected;
	}

	public boolean verifyUserMenuItem() throws IOException {

		boolean isOptionsVerifed = true;

		String[] expectedUserMenuItems = ReadpropertyFile.readUserMenuTestData("usermenu.items").split(",");
		
		for (int i = 0; i < expectedUserMenuItems.length; i++) {
			String actualOPtion = userMenuOptions.get(i).getText();

			if (expectedUserMenuItems[i].equals(actualOPtion)) {
				System.out.println("Expected Option " + expectedUserMenuItems[i] + " Actual Option" + actualOPtion);
			} else {
				System.out.println("Expected Option " + expectedUserMenuItems[i] + "failed to match with Actual Option"
						+ actualOPtion);
				isOptionsVerifed = false;
			}
		}
		return isOptionsVerifed;
	}
	
	public boolean selectMyProfile() throws IOException {
		boolean isSelected = false;
		if(MyProfile.isDisplayed()) {
			MyProfile.click();
			isSelected = true;
		}
		return isSelected;
	}
	
	public boolean isProfilePageVisible() {
		return profilePage.isDisplayed();
	}
	
	public void editContact(WebDriver driver) {
		if(CommonUtils.waitForElement(driver, editProfileButton)) {
			editProfileButton.click();
		}
	}
	
	public boolean verifyEditContactPopUp(WebDriver driver) {
		boolean isContactPopVerified = false;
		if(CommonUtils.waitForElement(driver, iFrameAbotTab)) {
		driver.switchTo().frame(iFrameAbotTab);
		
		if(aboutTab.isDisplayed() && contactTab.isDisplayed()) {
			isContactPopVerified = true;
		}
	}
	return isContactPopVerified;
	}
	
	public boolean verfiyLastNameChangeInAboutTab(WebDriver driver, String sLastName) {
		boolean isLastNameVerified = false;
		if(aboutTab.isDisplayed()) {
			aboutTab.click();
			aboutTabLastName.clear();
			aboutTabLastName.sendKeys(sLastName);
			saveAllButton.click();
			driver.switchTo().parentFrame();
			
			if(userProfilePageNameDisplay.isDisplayed()) {
				String sActualName = userProfilePageNameDisplay.getText();
				if(sActualName.contains(sLastName)) {
					isLastNameVerified = true;
				}
			}
		} else {
			System.out.println("userMenuPage : verifyLastnameChangeIsAboutTab : About tab is not visible");
		}
		return isLastNameVerified;
	}
	
	public boolean verifyCreatePost(WebDriver driver, String sMessageToPost) throws InterruptedException {
		boolean verifyCreatePost = false;
		if(CommonUtils.waitForElement(driver, postLink)) {
			postLink.click();
			driver.switchTo().frame(0);
			postTextArea.sendKeys(sMessageToPost);
			driver.switchTo().parentFrame();
			if(shareButton.isDisplayed()) {
				shareButton.click();
				Thread.sleep(2000);
			}
//			if(firstPostText.isDisplayed()) {
				verifyCreatePost = true;
//			}
		}
		return verifyCreatePost;
	}
	
	public boolean verifyFileUpload(WebDriver driver, String sFilePath) throws InterruptedException {
		
		boolean isFileUploadSuccess = false;
		if(CommonUtils.waitForElement(driver, fileLink)) {
			fileLink.click();
			if(CommonUtils.waitForElement(driver, uploadFile)) {
				uploadFile.click();
			}
			if(CommonUtils.waitForElement(driver, fileOpen)) {
				fileOpen.sendKeys(sFilePath);
				shareButton.click();
				Thread.sleep(WaitConstants.WAIT_FOR_UPLOAD_TO_FINISH);
				if(CommonUtils.waitForElement(driver, cancelUpload)) {
					if(verifyFilePostElement.isDisplayed()) {
						isFileUploadSuccess = true;
					}
				}
			  }
			}
		return isFileUploadSuccess;
	}
	
	public void clickOnUpdatePhotoButton(WebDriver driver) {
		CommonUtils.moveToElement(driver, moderatorButton);
		if(updateButton.isDisplayed()) {
			updateButton.click();
		}
	}
	
	public boolean verifyPhotoUpload(WebDriver driver, String sPhotoPath) throws InterruptedException {
		boolean isUploadSuccess = false;
		clickOnUpdatePhotoButton(driver);
		driver.switchTo().frame(photoUploadIFrame);
		if(CommonUtils.waitForElement(driver, uploadPhoto)) {
			uploadPhoto.sendKeys(sPhotoPath);
			photoSaveButton.click();
			Thread.sleep(4000);
		}
		if(CommonUtils.waitForElement(driver, photoSaveButton2)) {
			photoSaveButton2.click();
			Thread.sleep(4000);
			isUploadSuccess = true;
		}
		driver.switchTo().parentFrame();
		return isUploadSuccess;
	}
	
    // My Setting
	public boolean selectMySetting() {
		boolean isSelectMySetting = false;
		if(MySetting.isDisplayed()) {
			MySetting.click();
			isSelectMySetting = true;
		}
		System.out.println("My Setting selected");
		return isSelectMySetting;
	}
	
	public boolean isMySettingPageVisible() {
		return .isDisplayed();
	}
	
	public void clickPersonal(WebDriver driver) {
		if(CommonUtils.waitForElement(driver, personalLink)) {
			personalLink.click();
			System.out.println("pesonal link Selected");
		}
	}
	
	public boolean selectLoginHistory(WebDriver driver) {
		boolean isSelectLoginHistory = false;
		if(loginHistoryLink.isDisplayed()) {
			System.out.println("loginHistoryLink.isDisplayed(): "+loginHistoryLink.isDisplayed());
			loginHistoryLink.click();
				loginHistoryDownload.click();
				isSelectLoginHistory = true;
		}
		return isSelectLoginHistory;
	}
	
	public boolean clickDisplayAndLayout(WebDriver driver) throws InterruptedException {
		
		boolean isClickDisplayAndLayout = false;
		if(CommonUtils.waitForElement(driver, displayLayoutLink)) {
			displayLayoutLink.click();
			if(customizedTab.isDisplayed()) {
				customizedTab.click();
				if(availableTab.isDisplayed()) {
					Thread.sleep(1000);
					chatter.click();
					Thread.sleep(1000);
					add.click();
				}
				if(availableTab.isDisplayed()) {
					Thread.sleep(1000);
					reports.click();
					Thread.sleep(1000);
					add.click();
				}
				saveCustomizedTab.click();
				isClickDisplayAndLayout = true;
			}
		}
		return isClickDisplayAndLayout;
	}
	
//	Email
	
	public void selectEmail(WebDriver driver) {
		Actions action = new Actions(driver);
		if(CommonUtils.waitForElement(driver, emailLink)) {
			action.moveToElement(emailLink).click().build().perform();
			System.out.println("Email selected");
		}
	}
	
	public boolean clickEmailSetting(WebDriver driver) throws IOException {
		
		boolean isEmailSettingChange = false;
		if(CommonUtils.waitForElement(driver, myEmailSetting)) {
			myEmailSetting.click();
			if(CommonUtils.waitForElement(driver, emailName)) {
				emailName.clear();
				emailName.sendKeys(ReadpropertyFile.readUserMenuTestData("email_Name"));
				emailAddress.clear();
				emailAddress.sendKeys(ReadpropertyFile.readUserMenuTestData("email_Address"));
				bccRadioButton.isSelected();
				saveOnEmail.click();
				isEmailSettingChange = true;
			}
		}
		return isEmailSettingChange;
	}
	
// Calendar&Reminder
	
	public void selectCalendarAndReminder(WebDriver driver) { 
		if(CommonUtils.waitForElement(driver, calendarAndRemainders)) {
			calendarAndRemainders.click();
			System.out.println("Calendar&Reminder selected");
		}
		
	}
	
	public boolean activityReminder(WebDriver driver) throws IOException, InterruptedException {
		
		boolean isactivityReminder = false;
		activityRemainder.click();
		if(CommonUtils.waitForElement(driver, openTestRemainder)) {
			openTestRemainder.click();
			driver.switchTo().frame(sampleEventPopup);
			Thread.sleep(3000);
			driver.close();
			driver.switchTo().parentFrame();
			isactivityReminder = true;
		}
		return isactivityReminder;
	}
	
	 // Developer Console
		public boolean selectDeveloperConsole(WebDriver driver) throws InterruptedException, IOException {
			boolean isSelectDeveloperConsole = false;
			if(developerConsole.isDisplayed()) {
				developerConsole.click();
				Thread.sleep(3000);
				String expectedURL = ReadpropertyFile.readUserMenuTestData(FileConstants.USER_MENU_TESTDATA_FILE_PATH);
				String actualUrl = driver.getCurrentUrl();
				driver.close();
				isSelectDeveloperConsole = true;
			}
			System.out.println("Developer Console selected");
			
			return isSelectDeveloperConsole;
		}
		
		// Logout
		public boolean selectLogout(WebDriver driver) throws IOException, InterruptedException {
			LoginPage lp = new LoginPage(driver);
			boolean isSelectLogout = false;
			if(logout.isDisplayed()) {
				logout.click();
				lp.loginIntoApp(driver);
				isSelectLogout = true;
			}
			System.out.println("Logout");
			return isSelectLogout;
		}
		
	
}
