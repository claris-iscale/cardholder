package com.another.cardholder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.cardholder.an-other.co.uk/user/login")
public class LoginPage extends PageObject{
	

	
	@FindBy(id="loginform-login")
	private WebElement username;
	
	@FindBy(id="loginform-password")
	private WebElement password;
	
	public void inputUsername(String username) {
		this.username.sendKeys(username);
	}
	
	
	
}
