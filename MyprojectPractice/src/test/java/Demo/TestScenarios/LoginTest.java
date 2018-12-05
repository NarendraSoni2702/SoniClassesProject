package Demo.TestScenarios;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Demo.Module.LoginModule;
import Demo.PO.LoginPO;
import basicframework.base.BaseTest;

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
