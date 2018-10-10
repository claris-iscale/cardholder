package com.another.cardholder.pages;

import org.openqa.selenium.WebElement;

import com.another.cardholder.utils.Utils;	

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class RecoverPasswordPage extends PageObject{
	Utils utils;
	
	@FindBy(id="recoveryform-email")
	WebElement recoveryEmail;
	
	@FindBy(className="btn btn-primary btn-block")
	WebElement continueButton;
	
	@FindBy(className="help-block")
	WebElement helpBlock;
	
	@FindBy(className="panel-title")
	WebElement panelHeader;
	
	public void isRecoveryEmailVisible() {
		recoveryEmail.isDisplayed();
	}
	
	public void clickContinueButton() {
		utils.clickButton(continueButton);
	}

	public String helpBlockValue() {
		return helpBlock.getText();
	}
	
	
}
