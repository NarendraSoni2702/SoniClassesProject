package Demo.TestScenarios;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basicframework.base.BaseTest;
import freeCRMDemo.Module.LoginModule;
import freeCRMDemo.PO.LoginPO;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void LoginToGmail(){
		InvokeBrowser();
		LinkedHashMap<String, String> testCaseData=datareader.getTestCaseData("Login", 3);
		LoginModule lm = new LoginModule(driver, configfileReader);
		lm.LaunchApplication();
		lm.LoginToApplication(testCaseData);
	}
}
