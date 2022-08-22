package com.Skillrary.PomPages;
/**
 * 
 * @author QSP
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author QSP
 *
 */
public class Login {
	public WebDriver driver;
	/**
	 * Elements of login  page
	 */
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumTainingOption;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}


	public WebElement getCourseTab() {
		return courseTab;
	}

	public WebElement getSeleniumTainingOption() {
		return seleniumTainingOption;
	}
	
	public AddCart clickCource() {
		seleniumTainingOption.click();
		return new AddCart(driver);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
