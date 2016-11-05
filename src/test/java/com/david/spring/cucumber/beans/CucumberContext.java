package com.david.spring.cucumber.beans;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CucumberContext {
	
	// Useful for testing the Dependency Injection only
	@Bean("Sample")
	public Sample getSample() {
		return new Sample();
	}
	
//	@Bean("WebDriver")
//	public FirefoxDriver getFirefoxWebDriver() {
//		System.setProperty("webdriver.gecko.driver", "/usr/bin/firefox");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		return new FirefoxDriver(capabilities);
//	}
	
	@Bean(name="WebDriver", destroyMethod="close")
	public SharedWebDriver getFirefoxWebDriver() {
		return new SharedWebDriver();
	}
	
	@Bean("WebDriverWait")
	public WebDriverWait getWebDriverWait() {
		return new WebDriverWait(getFirefoxWebDriver(), 5);
	}

}