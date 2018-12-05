package Demo.Module;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import Demo.PO.LoginPO;
import basicframework.base.ConfigfileReader;

public class LoginModule {
	WebDriver driver;
	ConfigfileReader configfileReader;
	public LoginModule(WebDriver driver,ConfigfileReader configfileReader){
		this.driver=driver;
		this.configfileReader=configfileReader;
	}
	
	public void LaunchApplication(){
		
		String url = null;
		if(configfileReader.getEnvironment().equalsIgnoreCase("QA"))
			url=configfileReader.getQAUrl();
		else if(configfileReader.getEnvironment().equalsIgnoreCase("DEV"))
			url=configfileReader.getDevUrl();
		else if (configfileReader.getEnvironment().equalsIgnoreCase("UAT"))
			url=configfileReader.getUATUrl();
		
		driver.get(url);
	}

	public void LoginToApplication(LinkedHashMap<String, String> testCaseData){
		LoginPO lp = new LoginPO(driver);
		lp.setUserName(testCaseData.get("UserName"));
		lp.setPassword(testCaseData.get("Password"));
		lp.clickOnLoginButton();
	}
}
