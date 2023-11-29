package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.FileConstants;
import constant.WaitConstants;
import utilities.CommonUtils;
import utilities.ReadpropertyFile;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"Account_Tab\"]/a")
	public WebElement accountLink;  

	@FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	public WebElement newAccountLink; 
	
	@FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	public WebElement newAccountName;
	
	@FindBy(xpath = "//*[@id=\"acc6\"]")
	public WebElement type;
	
	@FindBy(xpath = "//*[@id=\"acc6\"]/option[7]")
	public WebElement technologyPartner;
	
	@FindBy(xpath = "//*[@id=\"00NHu00000PEd4F\"]")
	public WebElement customerPriority;
	
	@FindBy(xpath = "//*[@id=\"00NHu00000PEd4F\"]/option[2]")
	public WebElement customerPriorityHigh;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[2]")  
	public WebElement saveAndNewButton;
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	public WebElement creatNewView;
	
	@FindBy(xpath = "//*[@id=\"fname\"]")
	public WebElement viewName;
	
	@FindBy(xpath = "//*[@id=\"devname\"]")  
	public WebElement viewUniqueName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement newViewSaveButton;
	
	@FindBy(xpath = "//a[@href='/ui/list/FilterEditPage?id=00BHu00000FL5Yo&retURL=%2F001&cancelURL=%2F001%2Fo']")
	public WebElement edit;

	@FindBy(xpath = "//*[@id=\"fname\"]")
	public WebElement editViewName;

	@FindBy(xpath = "//*[@id=\"fcol1\"]")
	public WebElement accountName;
	
	@FindBy(xpath = "//*[@id=\"fcol1\"]/option[3]")
	public WebElement field;

	@FindBy(xpath = "//*[@id=\"fop1\"]")
	public WebElement operator;
	
	@FindBy(xpath = "//*[@id=\"fop1\"]/option[2]")
	public WebElement operatorValue;
	
	@FindBy(xpath = "//*[@id=\"fval1\"]")
	public WebElement value;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	public WebElement editSaveButton;

	@FindBy(xpath = "//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")
	public WebElement mergeAccount;
	
	@FindBy(xpath = "//*[@id=\"srch\"]")
	public WebElement findAccountChar;
	
	@FindBy(xpath = "//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")  
	public WebElement findAccountButton;

	@FindBy(xpath = "//*[@id=\"cid0\"]") 
	public WebElement check1;

	@FindBy(xpath = "//*[@id=\"cid1\"]") //a[contains(text(),'Accounts with last activity > 30 days')]
	public WebElement check2;
	
	@FindBy(xpath = "//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]")
	public WebElement nextMergeButton;
	
	@FindBy(xpath = "//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]") 
	public WebElement mergeButton;
	
	@FindBy(xpath = "//a[contains(text(),'Accounts with last activity > 30 days')]") 
	public WebElement AccountsLastActivity;
	
	@FindBy(xpath = "//*[@id=\"ext-gen148\"]") 
	public WebElement dateField;
	
	@FindBy(xpath = "//div[@class='x-combo-list-item x-combo-selected']") 
	public WebElement createdDate;  
	
	@FindBy(xpath = "//*[@id=\"ext-gen154\"]") 
	public WebElement to;  
	
	@FindBy(xpath = "//*[@id=\"ext-gen279\"]") 
	public WebElement today;  
	
	@FindBy(xpath = "//*[@id=\"ext-gen49\"]") 
	public WebElement unsavedReportPageSaveButton;  
	
	@FindBy(xpath = "//*[@id=\"saveReportDlg_reportNameField\"]") 
	public WebElement reportName;  
	
	@FindBy(xpath = "//*[@id=\"saveReportDlg_DeveloperName\"]") 
	public WebElement reportUniqueName;
	
	@FindBy(xpath = "//*[@id=\"ext-gen309\"]") 
	public WebElement reportSaveButton; 
	
	@FindBy(xpath = "//button[@id='ext-gen63']") 
	public WebElement runReport; 
	
	
	
//	
//	public boolean selectAccount() throws IOException {
//		boolean isSelectAccount = false;
//		if(accountLink.isDisplayed()) {
//			accountLink.click();
//			isSelectAccount = true;
//		}
//		return isSelectAccount;
//	}
	
	public boolean creatNewAccount(WebDriver driver) throws IOException, InterruptedException {
		boolean isCreatNewAccount = false;
		Actions action = new Actions(driver);
		if(CommonUtils.waitForElement(driver, newAccountLink)) {
			action.moveToElement(newAccountLink).click().build().perform();
			System.out.println("click");
			if(CommonUtils.waitForElement(driver, newAccountName)) {
				newAccountName.sendKeys(ReadpropertyFile.readAccountDetails("newAccountName"));
				Thread.sleep(2000);
				type.click();
				Thread.sleep(1000);
				technologyPartner.click();
				customerPriority.click();
				Thread.sleep(1000);
				customerPriorityHigh.click();
				saveAndNewButton.click();
				isCreatNewAccount = true;
			}
		}
		return isCreatNewAccount;
	}
	
	public boolean creatNewView(WebDriver driver) throws IOException {
		boolean isCreatNewView = false;
		Actions action = new Actions(driver);
		if(CommonUtils.waitForElement(driver, creatNewView)) {
			action.moveToElement(creatNewView).click().build().perform();
			if(CommonUtils.waitForElement(driver, viewName)) {
				viewName.sendKeys(ReadpropertyFile.readAccountDetails("viewName"));
				System.out.println("view name");
				viewName.sendKeys(ReadpropertyFile.readAccountDetails("viewUniqueName"));
				System.out.println("viewunique name");
				newViewSaveButton.click();
				System.out.println("save");
				isCreatNewView = true;
			}
		}
		return isCreatNewView;
	}
	
	public boolean clickEdit(WebDriver driver) throws IOException {
		boolean isEdit = false;
		Actions action = new Actions(driver);
		if(CommonUtils.waitForElement(driver, edit)) {
			action.moveToElement(edit).click().build().perform();
			if(CommonUtils.waitForElement(driver, editViewName)) {
				editViewName.sendKeys(ReadpropertyFile.readAccountDetails("editViewName"));
				System.out.println("editViewName");
				accountName.click();
				field.click();
				operator.click();
				operatorValue.click();
				value.clear();
				value.sendKeys(ReadpropertyFile.readAccountDetails("value"));
				editSaveButton.click();
				isEdit = true;
			}
		}
		return isEdit;
	}
	
	public boolean clickMergeAccount(WebDriver driver) throws IOException, InterruptedException {
		boolean isMergeAccount = false;
		Actions action = new Actions(driver);
		if(CommonUtils.waitForElement(driver, mergeAccount)) {
			action.moveToElement(mergeAccount).click().build().perform();
			if(CommonUtils.waitForElement(driver, findAccountChar)) {
				findAccountChar.sendKeys(ReadpropertyFile.readAccountDetails("findAccountChar"));
				findAccountButton.click();
				if(CommonUtils.waitForElement(driver, check1)) {
					check1.click();
					check2.click();
					nextMergeButton.click();
					mergeButton.click();
					Thread.sleep(2000);
					Alert alert = driver.switchTo().alert();
					String alertText = alert.getText();
					alert.accept(); 
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
				}
			}
		}
		return isMergeAccount;
	}
	
	public boolean clickAccountLastActivityHistory(WebDriver driver) throws InterruptedException, IOException {
		boolean isAccountLastActivityHistory = false;
		Actions action = new Actions(driver);
		if(CommonUtils.waitForElement(driver, AccountsLastActivity)) {
			action.moveToElement(AccountsLastActivity).click().build().perform();
			if(CommonUtils.waitForElement(driver, dateField)) {
				dateField.click();
				createdDate.click();
				to.click();
				today.click();
				Thread.sleep(1000);
				unsavedReportPageSaveButton.click();
				reportName.sendKeys(ReadpropertyFile.readAccountDetails("reportName"));
				reportUniqueName.sendKeys(ReadpropertyFile.readAccountDetails("reportUniqueName"));
				reportSaveButton.click();
				Thread.sleep(2000);
				if (runReport.isDisplayed () ) {
					if (CommonUtils.waitForElement(driver, runReport)) {
						runReport.click();
					}
				}
				runReport.click();
				isAccountLastActivityHistory = true;
			}
		}
		return isAccountLastActivityHistory;
	}
	
}


