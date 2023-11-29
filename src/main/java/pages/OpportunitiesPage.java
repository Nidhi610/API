package pages;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Today;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonUtils;
import utilities.ReadpropertyFile;

public class OpportunitiesPage extends BasePage {

	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"Opportunity_Tab\"]/a")
	public WebElement opportunitiesLink;
	
	@FindBy(xpath = "//*[@id=\"fcf\"]")
	public WebElement viewDropdown;

	@FindBy(xpath = "//*[@id=\"fcf\"]/option")  
	public List<WebElement> viewDropdownOptions;
	
	@FindBy(xpath = "//td[contains(@class,'pbButton')]//input[contains(@type,'button')]")  
	public WebElement newOpportunitieButton;
	
	@FindBy(xpath = "//*[@id=\"opp3\"]")  
	public WebElement opportunityName;
	
	@FindBy(xpath = "//*[@id=\"opp4\"]")  
	public WebElement accountName;
	
	@FindBy(xpath = "//*[@id=\"opp9\"]")  
	public WebElement closeDate;
	
	@FindBy(xpath = "//*[@id=\"datePicker\"]/div[2]/div/a")  
	public WebElement date;
	
	@FindBy(xpath = "//*[@id=\"datePicker\"]/div[2]/div/a")  
	public WebElement stage;
	
	@FindBy(xpath = "//*[@id=\"opp11\"]/option[3]")  
	public WebElement stageOption;
	
	@FindBy(xpath = "//*[@id=\"opp12\"]")  
	public WebElement probability ;
	
	@FindBy(xpath = "//*[@id=\"opp6\"]")  
	public WebElement leadSource;
	
	@FindBy(xpath = "//*[@id=\"opp6\"]/option[4]")  
	public WebElement leadSourceOpt;
	
	@FindBy(xpath = "//*[@id=\"opp17\"]")  
	public WebElement primaryCampaignSource;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")  
	public WebElement saveNewOppertnity;
	
	@FindBy(xpath = "//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")  
	public WebElement pipelineLink;
	
	@FindBy(xpath = "//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")  
	public WebElement stuckOppertnityLink;
	
	@FindBy(xpath = "//*[@id=\"quarter_q\"]")  
	public WebElement interval;
	
	@FindBy(xpath = "//*[@id=\"quarter_q\"]/option[3]")  
	public WebElement intervalOption;
	
	@FindBy(xpath = "//*[@id=\"open\"]")  
	public WebElement include;
	
	@FindBy(xpath = "//*[@id=\"open\"]/option[2]")  
	public WebElement includeOption;
	
	@FindBy(xpath = "//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input")  
	public WebElement runReport;
	
	
	public boolean verifyOpportunitiesDropdown() throws IOException, InterruptedException {
		boolean isVerified = false;
		viewDropdown.click();
		Thread.sleep(2000);
		String[] expectedViewDetails = ReadpropertyFile.readOpportunities("viewDetails").split(",");

		for (int i = 0; i < expectedViewDetails.length; i++) {
			String actualOPtion = viewDropdownOptions.get(i).getText();

			if (expectedViewDetails[i].equals(actualOPtion)) {
				System.out.println(actualOPtion + " : " + expectedViewDetails[i]);
			} else {
				isVerified = false;
			}
		}
		return isVerified; 
	}
	
	public boolean creatNewOppertunity(WebDriver driver) throws InterruptedException, IOException {
		boolean isCreatNewOppertunity = false;
		Actions action = new Actions(driver);
		if(newOpportunitieButton.isDisplayed()) {
			action.moveToElement(newOpportunitieButton).click().build().perform();
			opportunityName.sendKeys(ReadpropertyFile.readOpportunities("opportunityName"));
			accountName.sendKeys(ReadpropertyFile.readOpportunities("accountName"));
			closeDate.click();
			date.click();
			stage.click();
			stageOption.click();
			probability.sendKeys(ReadpropertyFile.readOpportunities("probability"));
			primaryCampaignSource.sendKeys(ReadpropertyFile.readOpportunities("primaryCampaignSource"));
			leadSource.click();
			leadSourceOpt.click();
			saveNewOppertnity.click();
			
			Thread.sleep(3000);
			
			isCreatNewOppertunity = true;
		}
		return isCreatNewOppertunity;
	}
	
	public boolean clickPipeline(WebDriver driver) throws InterruptedException, IOException {
		boolean isClickPipeline = false;
		Actions action = new Actions(driver);
		if(pipelineLink.isDisplayed()) {
			action.moveToElement(pipelineLink).click().build().perform();
			isClickPipeline = true;
		}
		return isClickPipeline;
	}
	
	public boolean clickStuckOppertunity(WebDriver driver) throws InterruptedException, IOException {
		boolean isclickStuckOppertunity = false;
		Actions action = new Actions(driver);
		if(stuckOppertnityLink.isDisplayed()) {
			action.moveToElement(stuckOppertnityLink).click().build().perform();
			isclickStuckOppertunity = true;
		}
		return isclickStuckOppertunity;
	}
	
	public boolean clickQuarterlySummary(WebDriver driver) throws InterruptedException, IOException {
		boolean isClickQuarterlySummary = false;
		Actions action = new Actions(driver);
		if(interval.isDisplayed()) {
			action.moveToElement(interval).click().build().perform();
			intervalOption.click();
			include.click();
			includeOption.click();
			runReport.click();
			isClickQuarterlySummary = true;
		}
		return isClickQuarterlySummary;
	}
}
