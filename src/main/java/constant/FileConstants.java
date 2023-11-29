package constant;

import utilities.CommonUtils;

public class FileConstants {

	public static final String LOGIN_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\testdata.xlsx";
	
	public static final String LOGIN_TESTDATA_FILE_PATH2 = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\config.properties";
	
	public static final String USER_MENU_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\userMenuTestData.properties";

	public static final String PROFILE_PHOTO_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\Screenshot_1615105312.png";

	public static final String ACCOUNT_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\accountDetails.properties";

	public static final String 	OPPORTUNITIES_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\opportunities.properties";

	public static final String 	LEADS_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\leads.properties";

	public static final String 	CONTACTS_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\configFilesData\\contacts.properties";

	public static final String 	REPORT_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\reports"+CommonUtils.getStringDateAndTime()+"_Saleforce_Selenium_Project.html";

	public static final String 	SCREENSHOT_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\reports"+CommonUtils.getStringDateAndTime()+"_Saleforce_Selenium_Project.PNG";

}
