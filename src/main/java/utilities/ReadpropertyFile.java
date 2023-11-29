package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import constant.FileConstants;

public class ReadpropertyFile {

	
	public static String readPropertyFile(String path, String key) throws IOException {
		File f = new File(FileConstants.LOGIN_TESTDATA_FILE_PATH2);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	

	public static String readUserMenuTestData(String key) throws IOException {
		File f = new File(FileConstants.USER_MENU_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	public static String readAccountDetails(String key) throws IOException {
		File f = new File(FileConstants.ACCOUNT_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	public static String readOpportunities(String key) throws IOException {
		File f = new File(FileConstants.OPPORTUNITIES_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	
	public static String readLeads(String key) throws IOException {
		File f = new File(FileConstants.LEADS_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);  
	}
	
	public static String readContacts(String key) throws IOException {
		File f = new File(FileConstants.CONTACTS_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);  
	}
	

}
 