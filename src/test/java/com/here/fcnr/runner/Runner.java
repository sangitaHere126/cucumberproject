package com.here.fcnr.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		strict=false,
		monochrome=true,
		features= {"src/test/resources/"},
		glue= {"com.here.fcnr.steps"},
		plugin={"html:target/site/cucumber-html",
				"json:target/cucumber1.json "}
	
				
		
		
		
		)
public class Runner {

}
