package pages;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonUtils;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Home")
	public WebElement home;
	
	@FindBy(xpath = "//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")
	public WebElement firstLastNameLink;
	
	@FindBy(xpath = "//*[@id=\"AllTab_Tab\"]/a/img")
	public WebElement plusSign;
	
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input")
	public WebElement customizeTab;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[2]")
	public WebElement appLauncherAvailableTabs;

	@FindBy(xpath = "//*[@id=\"duel_select_0_right\"]/img")
	public WebElement add;

	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement save;
	
	@FindBy(xpath = "//*[@id=\"duel_select_1\"]/option[10]")
	public WebElement appLauncherSelectTabs;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0_left\"]/img")
	public WebElement remove;
	
	@FindBy(xpath = "//*[@id=\"homeCalendarSection\"]/div/div[2]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr[4]/td[6]")
	public WebElement todayDate;
	
	@FindBy(className = "mCalendar")
	public WebElement calendarElement;
	
	@FindBy(tagName = "td")
	public List<WebElement> dateElements;
	
	@FindBy(xpath = "//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a")
	public WebElement pm8Link;
	
	@FindBy(xpath = "//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")
	public WebElement subjectComboIcon;
	
	@FindBy(xpath = "/html/body/div[2]/ul/li[5]/a")
	public WebElement other;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement saveNewEvent;
	
	@FindBy(xpath = "//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a")
	public WebElement pm4Link;
	
	@FindBy(xpath = "//*[@id=\"EndDateTime_time\"]")
	public WebElement endDropdown;
	
	@FindBy(xpath = "//*[@id=\"timePickerItem_38\"]")
	public WebElement endTime;
	
	
	// Home
	public boolean selectHome(WebDriver driver) throws IOException, InterruptedException {
			boolean isSelectHome = false;
			if(home.isDisplayed()) {
				firstLastNameLink.click();
				System.out.println("firstLastNameLink clicked");
				isSelectHome = true;
			}
			System.out.println("Home");
			return isSelectHome;
	}
	
	//	Edit Profile
//	public boolean selectEdit(WebDriver driver) throws IOException, InterruptedException {
//		boolean isSelectEdit = false;
//		if {
//			isSelectEdit = true;
//		}
//		return isSelectEdit;
//	}
//	
	public boolean customizeTab(WebDriver driver) throws IOException, InterruptedException {
		boolean isSelectcustomizeTab = false;
		if(plusSign.isDisplayed()) {
			plusSign.click();
			Thread.sleep(2000);
			customizeTab.click();
			Thread.sleep(2000);
			appLauncherAvailableTabs.click();
			add.click();
			Thread.sleep(1000);
			save.click();
			Thread.sleep(1000);
			home.click();
			customizeTab.click();
			Thread.sleep(1000);
			appLauncherSelectTabs.click();
			remove.click();
			Thread.sleep(1000);
			save.click();
			isSelectcustomizeTab = true;
		}
		return isSelectcustomizeTab;
	}
	
	public boolean newEvent(WebDriver driver) throws IOException, InterruptedException {
		boolean isNewEvent = false;
		if (CommonUtils.waitForElement(driver, calendarElement)){
			Date currentDate = new Date();
			Calendar calender = Calendar.getInstance();
			calender.setTime(currentDate);
			int day = calender.get(Calendar.DAY_OF_MONTH);
			for(WebElement dateElement : dateElements) {
				if(dateElement.getText().equals(String.valueOf(day))) {
					dateElement.click();
					break;
				}
			}
			Thread.sleep(2000);
			pm4Link.click();
			String mainWindowHandle = driver.getWindowHandle();
			subjectComboIcon.click();
			Set<String> windowHandles = driver.getWindowHandles();
			 for (String handle : windowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		         }
		      }
			 Thread.sleep(1000);
			 other.click();
			 driver.switchTo().window(mainWindowHandle);
			 saveNewEvent.click();
			isNewEvent = true;
		}
		return isNewEvent;
	}
	
	public boolean newEvent2(WebDriver driver) throws IOException, InterruptedException {
		boolean isNewEvent = false;
		if (CommonUtils.waitForElement(driver, calendarElement)){
			Date currentDate = new Date();
			Calendar calender = Calendar.getInstance();
			calender.setTime(currentDate);
			int day = calender.get(Calendar.DAY_OF_MONTH);
			for(WebElement dateElement : dateElements) {
				if(dateElement.getText().equals(String.valueOf(day))) {
					dateElement.click();
					break;
				}
			}
			Thread.sleep(2000);
			String mainWindowHandle = driver.getWindowHandle();
			subjectComboIcon.click();
			Set<String> windowHandles = driver.getWindowHandles();
			 for (String handle : windowHandles) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		         }
		      }
			 Thread.sleep(1000);
			 other.click();
			 driver.switchTo().window(mainWindowHandle);
			 endDropdown.click();
			 Set<String> windowHandles2 = driver.getWindowHandles();
			 for (String handle : windowHandles2) {
		            if (!handle.equals(mainWindowHandle)) {
		                driver.switchTo().window(handle);
		                break;
		         }
		      }
			 endTime.click();
			 saveNewEvent.click();
			isNewEvent = true;
		}
		return isNewEvent;
	}
	
}
