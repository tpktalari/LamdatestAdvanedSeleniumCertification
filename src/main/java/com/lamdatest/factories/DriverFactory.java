package com.lamdatest.factories;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import com.lamdatest.enums.ConfigProperties;
import com.lamdatest.utils.PropertyFileUtil;



public final class DriverFactory {
	private DriverFactory() {
	}
	@Parameters(value={"browser","version","platform"})
	public static WebDriver getDriver(String browser,String version,String platform) throws MalformedURLException {
		WebDriver driver = null;
		String runmode = PropertyFileUtil.readDataFromPropertyFile(ConfigProperties.RUNMODE);
		String username="pavankumar61652";
		String accesskey="b3axE7GOgBOsw24q0VNjQSFaczGbBKg5SS7v5260ITN40lAPP4";
	    String gridURL = "@hub.lambdatest.com/wd/hub";
		
			if (runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("browserName", browser);
		        capabilities.setCapability("version", version);
		        capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any available one
		        capabilities.setCapability("build", "LambdaTestAdvancedSeleniumAssesment");
		        capabilities.setCapability("name", "LambdaTest_Assesment");
		        capabilities.setCapability("network", true);
		        capabilities.setCapability("video", true);
		        capabilities.setCapability("visual", true);
		        capabilities.setCapability("console", true);
				driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
			} else {
				driver = new ChromeDriver();
			}

		return driver;
	}

}
