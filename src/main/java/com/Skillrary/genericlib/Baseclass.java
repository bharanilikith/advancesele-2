package com.Skillrary.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
/**
 * 
 * @author QSP
 *
 */
public class Baseclass {
	/**
	 * Open the application
	 */
	public WebDriver driver;
	public WebDriverUtilies utilies;
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports reports;
	public static ExtentTest test;
	public Photo p;
	
	@BeforeSuite
	public void configBS() {
	 htmlreport=new ExtentHtmlReporter(Autoconstant.reportspath);
	 htmlreport.config().setDocumentTitle("SkillRaryReports");
	 htmlreport.config().setTheme(Theme.DARK);
	 reports=new ExtentReports();
	 reports.attachReporter(htmlreport);
	 
		
	}
	
	
	
	@BeforeMethod
	public void configBM() throws FileNotFoundException, IOException {
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		utilies=new WebDriverUtilies();
		driver.get(utilies.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}
	/**
	 * close the application
	 * @throws IOException 
	 */
	
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
	
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() {
		
		htmlreport.flush();
		reports.flush();
	}
	

}
