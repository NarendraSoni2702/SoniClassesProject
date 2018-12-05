package soniclasses.MyprojectPractice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utility.ConfigReader;

public class invokeBrowser {

	public static void main(String[] args) throws Exception
	{
		ConfigReader reader = new ConfigReader();
		String rootPath= System.getProperty("user.dir");
		String driverPath= rootPath+"/Drivers/"+reader.ie_path();
		
		System.setProperty(reader.ie_Driver(), driverPath);
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(reader.geturl());
		driver.findElement(By.id(reader.getuser_loc())).sendKeys(reader.getusername());
		driver.findElement(By.id(reader.getpassword_loc())).sendKeys(reader.getpassword());
		driver.findElement(By.xpath(reader.click_loginbtn())).click();
	}
}
