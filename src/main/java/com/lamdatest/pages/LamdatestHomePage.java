package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.driver.DriverManager;

public class LamdatestHomePage {
	@FindBy(xpath="//a[text()='See All Integrations']")private WebElement linkSeeAllIntegrations;
//	@FindBy(className = "//div[@class='cookies__bar ']//p")private WebElement cookiesElement;
	@FindBy(xpath="//span[.='Allow Cookie']")private WebElement buttonAllowCookie;
//	@FindBy(xpath="//span[.='X']")private WebElement buttonCloseCookie;
	
	public LamdatestHomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public WebElement getLinkSeeAllIntegrations() {
		return linkSeeAllIntegrations;
	}
	
//	public WebElement getCookiesElement() {
//		return cookiesElement;
//	}
//
	public WebElement getButtonAllowCookie() {
		return buttonAllowCookie;
	}
	
	
//
//	public WebElement getButtonCloseCookie() {
//		return buttonCloseCookie;
//	}
	
	

}
