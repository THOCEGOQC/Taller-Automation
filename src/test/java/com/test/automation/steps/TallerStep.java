package com.test.automation.steps;

import com.test.automation.pages.TallerPageObject;

import net.thucydides.core.annotations.Step;

public class TallerStep {

	TallerPageObject tallerPageObject;
	
	@Step
	public void startPage() {
	tallerPageObject.open();	
	
	}
	
	@Step
	public void enterTheUserAndPassword(String user, String password) {
		tallerPageObject.insertUSer(user);
	}
	
	@Step
	public void pressTheLoginButton() {
		
	}
	
	@Step
	public void validateTheSuccesfulLogin() {
		
	}
	
}
