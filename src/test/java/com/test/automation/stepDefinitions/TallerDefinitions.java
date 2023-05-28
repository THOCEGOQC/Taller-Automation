package com.test.automation.stepDefinitions;

import com.test.automation.steps.TallerStep;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TallerDefinitions {

	
	@Steps
	TallerStep tallerStep;
	
	@Given("Start inventory page")
	public void StartInventoryPage() {
		tallerStep.startPage();
	}
	
	@And("I enter the user \"([^\"]*)\"$ and the password \"([^\"]*)\"$")
	public void enterTheUserAndPassword(String user, String password) {
		tallerStep.enterTheUserAndPassword(user, password);
	}
	
	@When("I click the login button")
	public void pressTheLoginButton() {
		tallerStep.pressTheLoginButton();
	}
	
	@Then("I validate the succesful login")
	public void validateTheSuccesfulLogin() {
		tallerStep.validateTheSuccesfulLogin();
	}
	
}
