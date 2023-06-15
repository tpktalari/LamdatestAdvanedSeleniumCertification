package com.lamdatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.driver.DriverManager;

public class CommunityPage {
	@FindBy(xpath = "//a[text()='Community']")private WebElement linkCommunity;
	
	public CommunityPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	public WebElement getComminityLink() {
		return linkCommunity;
	}
}
