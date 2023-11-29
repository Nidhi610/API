package listenerss;

import java.io.IOException;
import java.util.jar.Attributes.Name;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import testCase.BaseTest;
import utilities.CommonUtils;

public class SaleforceListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		
		BaseTest.test.pass(MarkupHelper.createLabel(result.getName() + " PASSED", ExtentColor.GREEN));
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		BaseTest.test.fail(result.getName() + "Test Failed");
		BaseTest.test.fail(MarkupHelper.createLabel(result.getName() + " FAILED", ExtentColor.RED));
		try {
			BaseTest.test.addScreenCaptureFromBase64String(CommonUtils.getScreenshot(BaseTest.getDriver()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
