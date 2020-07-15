package com.david.spring.cucumber.steps;

import com.david.spring.cucumber.pageobjects.duckduckgo.DuckduckgoHomePage;
import com.david.spring.cucumber.pageobjects.duckduckgo.DuckduckgoResultsPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DummyStepsSearchEngine extends ParentSteps {
	
	private static final Logger logger = LoggerFactory.getLogger(DummyStepsSearchEngine.class);
	private DuckduckgoHomePage homePage;
	private DuckduckgoResultsPage resultsPage;

	@Given("^I am on the search engine dummy home page \"([^\"]*)\"$")
	public void i_am_on_the_search_engine_dummy_home_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@Given("^I enter a dummy string \"([^\"]*)\"$")
	public void i_enter_a_dummy_string(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@When("^I press the dummy search button$")
	public void i_press_the_dummy_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@Then("^I should see some dummy results$")
	public void i_should_see_some_dummy_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	throw new PendingException();
	}

	@After
	public void afterScenario(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			if (screenshotOnFailure) {
				Date now = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDDHHmmss");
				String timestamp = sdf.format(now);
				
				File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
				File destFile = new File(screenshotDestinationFolder
						+ timestamp + "_"
						+ scenario.getName().replaceAll(" ", "_") + ".png");
				FileUtils.moveFile(srcFile, destFile);
				logger.info("Screenshot taken: " + destFile.getAbsolutePath());
			}
		}
	}

}
