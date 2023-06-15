package com.lamdatest.tests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.lamdatest.driver.DriverManager;
import com.lamdatest.pages.CommunityPage;
import com.lamdatest.pages.IntegrationsPage;
import com.lamdatest.pages.LamdatestHomePage;
import com.lamdatest.utils.WebDriverUtil;

public class LamdaTestAssesmentAdvanced_2Test extends BaseTest{
	@Test
	public void ScenarioLTC_Test() throws InterruptedException {
		LamdatestHomePage lamdatestHomePage = new LamdatestHomePage();
		IntegrationsPage integrationsPage = new IntegrationsPage();
		CommunityPage communityPage = new CommunityPage();

		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20))
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*")));
		lamdatestHomePage.getButtonAllowCookie().click();
		WebDriverUtil.scrollActionTillElement(lamdatestHomePage.getLinkSeeAllIntegrations(), "center");

		Actions actions=new Actions(DriverManager.getDriver());
		actions.keyDown(Keys.COMMAND).click(lamdatestHomePage.getLinkSeeAllIntegrations()).keyUp(Keys.COMMAND).perform();

		Set<String> wids = DriverManager.getDriver().getWindowHandles();
		for (String wIds : wids) {
			System.out.println("WindowsId :" + wIds);
		}

		WebDriverUtil.switchToWindow("Integrations");
		String url = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(url, "https://www.lambdatest.com/integrations");
		Reporter.log("Expected url https://www.lambdatest.com/integrations is present", true);

		WebDriverUtil.scrollActionTillElement(integrationsPage.getlinkCodelessAutomation(), "start");
		integrationsPage.getIntegrateTestingElementwithLT().click();

		String title = DriverManager.getDriver().getTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(title, "TestingWhiz Integration | LambdaTest", "Page title is not as expected");
		DriverManager.getDriver().close();
		System.out.println(wids.size());

		WebDriverUtil.switchToWindow("Next-Generation");
		((JavascriptExecutor) DriverManager.getDriver())
				.executeScript("window.location.href='https://www.lambdatest.com/blog';");

		communityPage.getComminityLink().click();
		String commUrl = DriverManager.getDriver().getCurrentUrl();
		Assert.assertEquals(commUrl, "https://community.lambdatest.com/");
		Reporter.log("The URl is same as Expected(https://community.lambdatest.com/)",true);
		
		softAssert.assertAll();
		DriverManager.getDriver().close();

	}


}
