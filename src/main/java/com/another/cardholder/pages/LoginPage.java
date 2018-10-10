package com.another.cardholder.pages;

import org.openqa.selenium.WebElement;

import com.another.cardholder.utils.Utils;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.cardholder.an-other.co.uk/user/login")
public class LoginPage extends PageObject{
	
	Utils utils;
	
	@FindBy(id="loginform-login")
	private WebElement username;
	
	@FindBy(id="loginform-password")
	private WebElement password;
	
//	public void inputUsername(String username) {
//		this.username.sendKeys(username);
//	}
//	
//	public void inputPassword(String password) {
//		this.password.sendKeys(password);
//	}
	
	public void inputUsername(String username) {
		utils.inputValue(this.username, username);
	}
	
	public void inputPassword(String password) {
		utils.inputValue(this.password, password);
	}
	
}
