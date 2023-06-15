package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.driver.DriverManager;

public class IntegrationsPage {
	@FindBy(xpath = "//div[@id='codeless_row']/*[text()='Codeless Automation']")private WebElement linkCodelessAutomation;
	@FindBy(xpath="//div[@id=\"codeless_row\"]//*[text()='Testing Whiz']/../a")private WebElement linkIntTWLT;
	public IntegrationsPage() {
		PageFactory.initElements(DriverManager.getDriver(),this);
	}
	
	public WebElement getlinkCodelessAutomation() {
		return linkCodelessAutomation;
	}
	public WebElement getIntegrateTestingElementwithLT() {
		return linkIntTWLT;
	}
}
