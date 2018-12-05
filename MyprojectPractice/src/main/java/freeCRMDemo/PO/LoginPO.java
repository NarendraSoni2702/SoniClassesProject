package freeCRMDemo.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicframework.base.BasePageObject;

public class LoginPO extends BasePageObject{
	
	WebDriver driver;
	public LoginPO(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	By userName= By.xpath("");
	By password=By.xpath("");
	By loginButton= By.xpath("");
	
	
	public void setUserName(String uName){
		typeOnElement(userName,uName);
	}
	
	public void setPassword(String pName){
		typeOnElement(password,pName);
	}
	
	public void clickOnLoginButton(){
		clickOnElement(loginButton);
	}

}
