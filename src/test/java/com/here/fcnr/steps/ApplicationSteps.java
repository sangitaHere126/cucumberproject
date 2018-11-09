package com.here.fcnr.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.here.fcnr.webdriver.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ApplicationSteps {
	WebConnector con;
	
	public ApplicationSteps(WebConnector con){
		this.con=con;
	}

	@Then("^Login should be (.*)$")
	public void validateLogin(String expectedResult){
		
		//con.validateLogin(expectedResult);
	}
	
@And("^I login inside application$")
	public void login(Map<String, String> data){
		System.out.println(data.get("Username")); //old way - old picocontainer
		System.out.println(data.get("Password"));
		con.login(data.get("Username"),data.get("Password"));
	} 
/*	@And("^I Login inside application$")
	public void login(List<String> data) { //new way - piccocontainer
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		con.login(data.get(0),data.get(1));
		
	} */
	
	
}
