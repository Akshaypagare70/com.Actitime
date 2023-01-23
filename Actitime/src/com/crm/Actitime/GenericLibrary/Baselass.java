package com.crm.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.Actitime.objectRepository.LoginPage;

public class Baselass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	ReadDataFromProperty r=new ReadDataFromProperty();
	
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database is connected",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected",true);
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Url = r.readdatafromproperty("url");
		driver.get(Url);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String UN = r.readdatafromproperty("username");
		String PW = r.readdatafromproperty("password");
        LoginPage lp=new LoginPage(driver);
         lp.logintoActitime(UN, PW);
		
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}

}
