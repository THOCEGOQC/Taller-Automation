package com.test.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class Actions extends PageObject{
	
	WebElement el = null;
	
	public WebElement waitObject(WebElement element, int tiempo) {
		
		WebDriverWait wait = new WebDriverWait (getDriver(), tiempo);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public void waitImplicity(int tiempo) {
		getDriver().manage().timeouts().implicitlyWait(tiempo,TimeUnit.SECONDS);
	}
	
	public void quitDriver() {
		getDriver().quit();
	}
}
