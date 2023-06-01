package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.utils.Actions;

import junit.framework.Assert;
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
	
	@FindBy(xpath = "//h1[contains(text(), 'Bienvenido')]")
	public static WebElement lblWelcome;
	
	@FindBy(xpath = "//h2[contains(text(), 'Login en la Sede:')]")
	public static WebElement lblWelcome2;

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
	
	public void validateUser(String user) {
		actions.waitObject(lblWelcome, 5);
		Assert.assertTrue(lblWelcome.getText().contains(user));
		//Assert.assertEquals(user, lblWelcome.getText());
	}
	
	public void validateCampus(String campus) {
		actions.waitObject(lblWelcome2, 5);
		Assert.assertNotSame(lblWelcome2, campus);
		actions.quitDriver();
	}

}
