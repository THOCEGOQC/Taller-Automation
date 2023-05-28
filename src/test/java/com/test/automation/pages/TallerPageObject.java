package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.utils.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://inventario-billar.net/login.php")

public class TallerPageObject extends PageObject {

	Actions actions;
	WebElement el =null;
	
	@FindBy(id = "usuario")
	public static WebElement txtUser;
	
	public void insertUSer(String user) {
		actions.waitObject (txtUser, 10);
		txtUser.sendKeys(user);
	}
}
