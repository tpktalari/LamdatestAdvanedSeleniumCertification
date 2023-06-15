package com.lamdatest.utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.lamdatest.driver.DriverManager;

public class WebDriverUtil {
	
	/**
	 * This method will scroll down for 500 units
	 * @param driver
	 */
	public static void scrollAction(int yValue)
	{
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,"+yValue+")", "");
	}
	
	//block value should be start or end or center
	public static void scrollActionTillElement(WebElement element,String blockValue)
	{
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].scrollIntoView({block: '"+blockValue+"', behavior: 'smooth'});",element);
	}
	
	public static void switchToWindow(String partialWindowTitle) {
		Set<String> windowIds = DriverManager.getDriver().getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		
		while (it.hasNext()) {
			String winID = it.next();
			String currentTitle = DriverManager.getDriver().switchTo().window(winID).getTitle();
			if (currentTitle.contains(partialWindowTitle)) {
				break;
			}
		}

	}

}
