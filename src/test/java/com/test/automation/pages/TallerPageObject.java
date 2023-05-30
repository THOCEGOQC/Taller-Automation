package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.utils.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://inventario-billar.net/login.php")

public class TallerPageObject extends PageObject {

	Actions actions;
	WebElement el = null;

	@FindBy(id = "usuario")
	public static WebElement txtUser;

	@FindBy(id = "password")
	public static WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Ingresar']")
	public static WebElement buttonIngresar;

	public void insertUSer(String user) {
		actions.waitObject(txtUser, 10);
		txtUser.sendKeys(user);
		actions.waitImplicity(10000);
	}

	public void insertPassword(String password) {
		txtPassword.sendKeys(password);

	}

	public void clicButton() {
		buttonIngresar.click();

	}

}
