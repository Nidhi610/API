package apiTests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.formula.ptg.GreaterThanPtg;
import org.junit.BeforeClass;
//import org.junit.Test;
import org.testng.*;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jayway.jsonpath.JsonPath;

import api.TestData.AddUser;
import api.constants.FileConstants;
import api.utils.CommonUtilities;
import apiReusableUtils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.greaterThan;

public class LoginTest extends APIBaseTest{

	
	@BeforeClass
	public void setURI() throws IOException {
		String uri = CommonUtilities.readFileAndReturnString(FileConstants.URI_FILE_PATH);
		RestAssured.baseURI = JsonPath.read(FileConstants.URI_FILE_PATH, "$.login.prod");
		System.out.println(RestAssured.baseURI);
	}
	
	
	@Test(enabled = false)
	public void loginTC_01()  {
		
//		RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
		
//		Response res = RestAssured.given().header("Content-Type", "application/json").when()
//		.body("{\"username\":\"nid@tekarch.com\", \"password\":\"Admin123\"}").post("/login");
//		System.out.println(res.asPrettyString());
		
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Content-type", "application/json");
		
		HashMap<String, String> logincreds = new HashMap<>();
		logincreds.put("username", "nid@tekarch.com");
		logincreds.put("password", "Admin123");
		
		Response res1 = RestUtils.postReq(logincreds, headers, "/login")
				.then().assertThat().statusCode(201)
				.body(matchesJsonSchema(new File(FileConstants.LOGIN_SCHEMA)))
				.extract().response();
		
//		token = res1.jsonPath().getString("token").replace("[", "").replace("]", "");

	}
	
	@Test(enabled = true)
	public void getData_TC02() {
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Token", token);
		headers.put("Content-type", "application/json");
		
		Response getUserData = RestUtils.getReq(headers, "/getdata").then().statusCode(200).extract().response();
		List<String> accountNumbers = getUserData.jsonPath().getList("accountno");
		assertThat(accountNumbers.size(), greaterThan(1000));
		
		
		System.out.println(getUserData.prettyPrint());
	}
	
	@Test(enabled = false)
	public void addData_TC02() throws JsonProcessingException {
		HashMap<String, String> headers = new HashMap<>();
		headers.put("Token", token);
		headers.put("Content-type", "application/json");
		
		AddUser au = new AddUser("TA-1111111", "5", "5000", "555666");
		String sPayload = CommonUtilities.serializeObject(au);
		Response adduserdata = RestUtils.postReq(sPayload, headers, "/adddata");
		
		System.out.println(adduserdata.prettyPrint());
	}
	
}
