package com.ds.automation.bussinessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePageElementMap {
	private final WebDriver browser;
	public BasePageElementMap(WebDriver driver){
		this.browser = driver;
	
	
		PageFactory.initElements(driver, this); 
	}
	
	public WebDriver getBrowser() {
		return browser;
	}
}
