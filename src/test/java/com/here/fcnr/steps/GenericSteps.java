package com.here.fcnr.steps;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.here.fcnr.webdriver.WebConnector;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//passes object of webconnector in all the classes. Same Object

public class GenericSteps {

	WebConnector con;
	
	public GenericSteps(WebConnector con){
		this.con=con;
	}
	
	@Before
	public void before(Scenario s){
		System.out.println("***bef**** "+s.getName());
		con.initReports(s.getName());
	}
	
	@After
	public void after(){
		System.out.println("***aft****");
		con.quit();
	}
	@Given("^I open (.*)$")
	public void openBrowser(String browserName){
		System.out.println("Opening browser " +browserName);
		con.openBrowser(browserName);
	}
	
	@And("^I go to (.*)$")
	public void navigate(String urlKey) throws InterruptedException {
		System.out.println("Navigating to " +urlKey);
		con.navigate(urlKey);
		
	}
	
	@And("^I type (.*) in (.*) field$")
	public void type(String data, String locatorKey){
		System.out.println("Typing in " +locatorKey+ " data: "+data);
		con.type(data, locatorKey);
	}
	
	@And("^I click on (.*)$")
	public void click(String locatorKey){
		con.infoLog("Clicking in "+locatorKey);
		con.click(locatorKey);
	}
	
	@And("^I click (.*) and wait for (.*)$")
	public void clickAndWait(String src,String target) {
		con.infoLog("Clicking on "+ src);
		con.clickAndWait(src, target, 20);	
	}
	
	@And("^I clear (.*)$")
	public void clear(String locatorKey) {
		con.infoLog("Clearing in "+locatorKey);
		con.clear(locatorKey);
	}
	
	@And("^I wait for page to load$")
	public void waitForPageToLoad() {
		con.waitForPageToLoad();
	}
	
	@And("^I select (.*) from (.*)$")
	public void select(String data,String locatorKey) {
		con.infoLog("Selecting from "+ locatorKey);
		con.select(locatorKey,data);
	}
	
	@When("^I accept alert$")
	public void iAcceptAlert() {
		con.acceptAlertIfPresent();
	}
}
