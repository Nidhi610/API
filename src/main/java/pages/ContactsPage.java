package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReadpropertyFile;

public class ContactsPage extends BasePage{

	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//*[@id=\"Contact_Tab\"]/a")
	public WebElement contactsLink;
	
	@FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	public WebElement newButton;
	
	@FindBy(xpath = "//*[@id=\"name_lastcon2\"]")
	public WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"con4\"]")
	public WebElement accountName;
	
	@FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
	public WebElement saveButton;

	@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a")
	public WebElement newViewLink;
	
	@FindBy(xpath = "//*[@id=\"fname\"]")
	public WebElement viewName;

	@FindBy(xpath = "//*[@id=\"devname\"]")
	public WebElement viewUniqueName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement viewUniqueSaveButton; 
	
	@FindBy(xpath = "//*[@id=\"fcf\"]")
	public WebElement viewDropdown; 
	
	@FindBy(xpath = "//*[@id=\"fcf\"]/option[9]")
	public WebElement recentlyCreated;
	
	@FindBy(xpath = "//*[@id=\"fcf\"]/option[5]")
	public WebElement myContacts;
	
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th") 
	public WebElement  recentContactsName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")
	public WebElement cancleButton;
	
	public boolean selectNew(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectNew = false;
		Actions action = new Actions(driver);
		if(newButton.isDisplayed()) {
			action.moveToElement(newButton).click().build().perform();
			Thread.sleep(2000);
			lastName.sendKeys(ReadpropertyFile.readContacts("lastName"));
			accountName.sendKeys(ReadpropertyFile.readContacts("accountName"));
			Thread.sleep(2000);
			saveButton.click();
			isSelectNew = true;
		}
		return isSelectNew;
	}
	
	public boolean selectNewView(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectNewView = false;
		Actions action = new Actions(driver);
		if(newViewLink.isDisplayed()) {
			action.moveToElement(newViewLink).click().build().perform();
			Thread.sleep(2000);
			if(viewName.isDisplayed()) {
				try {
					viewUniqueName.sendKeys(ReadpropertyFile.readContacts("viewUniqueName"));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			viewName.sendKeys(ReadpropertyFile.readContacts("viewName"));
			Thread.sleep(2000);
			viewUniqueSaveButton.click();
			isSelectNewView = true;
		}
		return isSelectNewView;
	}
	
	public boolean selectRecentlyCreated(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectRecentlyCreated = false;
		Actions action = new Actions(driver);
		if(viewDropdown.isDisplayed()) {
			action.moveToElement(viewDropdown).click().build().perform();
			myContacts.click();
			Thread.sleep(2000);
			isSelectRecentlyCreated = true;
		}
		return isSelectRecentlyCreated;
	}
	
	public boolean selectMyContacts(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectMyContacts = false;
		Actions action = new Actions(driver);
		if(viewDropdown.isDisplayed()) {
			action.moveToElement(viewDropdown).click().build().perform();
			recentlyCreated.click();
			Thread.sleep(2000);
			isSelectMyContacts = true;
		}
		return isSelectMyContacts;
	}
	
	public boolean selectRecentContactsName(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectRecentContactsName = false;
		Actions action = new Actions(driver);
		if(recentContactsName.isDisplayed()) {
			action.moveToElement(recentContactsName).click().build().perform();
			Thread.sleep(2000);
			isSelectRecentContactsName = true;
		}
		return isSelectRecentContactsName;
	}
	
	public boolean errorViewUniqueName(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectNewView = false;
		Actions action = new Actions(driver);
		if(newViewLink.isDisplayed()) {
			action.moveToElement(newViewLink).click().build().perform();
			Thread.sleep(2000);
			viewUniqueName.sendKeys(ReadpropertyFile.readContacts("viewUniqueName"));
			Thread.sleep(2000);			viewUniqueSaveButton.click();
			isSelectNewView = true;
		}
		return isSelectNewView;
	}
	
	public boolean newViewCancleButton(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectRecentlyCreated = false;
		Actions action = new Actions(driver);
		if(newViewLink.isDisplayed()) {
			action.moveToElement(newViewLink).click().build().perform();
			viewName.sendKeys(ReadpropertyFile.readContacts("viewName2"));
			viewUniqueName.clear();
			viewUniqueName.sendKeys(ReadpropertyFile.readContacts("viewUniqueName"));
			Thread.sleep(2000);
			cancleButton.click();
			isSelectRecentlyCreated = true;
		}
		return isSelectRecentlyCreated;
	}
	
	public boolean selectNew2(WebDriver driver) throws InterruptedException, IOException {
		boolean isSelectNew = false;
		Actions action = new Actions(driver);
		if(newButton.isDisplayed()) {
			action.moveToElement(newButton).click().build().perform();
			Thread.sleep(2000);
			lastName.sendKeys(ReadpropertyFile.readContacts("lastName2"));
			accountName.sendKeys(ReadpropertyFile.readContacts("accountName2"));
			Thread.sleep(2000);
			saveButton.click();
			isSelectNew = true;
		}
		return isSelectNew;
	}
}
