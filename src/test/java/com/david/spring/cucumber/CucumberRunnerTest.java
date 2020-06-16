package com.david.spring.cucumber;

import com.hpe.alm.octane.OctaneCucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@RunWith(OctaneCucumber.class)
//The below was done to insure a good run no matter what other feature files may be added.
/*@CucumberOptions(plugin = {"junit:leanftResults.xml"}, features="classpath:advantage.feature",
		format= {"pretty", "html:target/cucumber-pretty-report"})//the feature to execute
@RunWith(Cucumber.class)*/
@CucumberOptions(
		features = {"src/test/java/com/david/spring/cucumber/features"},
		plugin = {
				"pretty", 
				"html:target/cucumber"
		}) 
public class CucumberRunnerTest {

}
