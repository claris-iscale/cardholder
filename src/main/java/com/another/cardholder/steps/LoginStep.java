package com.another.cardholder.steps;

import com.another.cardholder.pages.LoginPage;
import com.another.cardholder.utils.Utils;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.*;
@At("https://dev.cardholder.an-other.co.uk/user/login")
public class LoginStep extends ScenarioSteps{
	/**
	 * 
	 */
	private static final long serialVersionUID = -141142077396511352L;
	Utils utils;
	LoginPage loginPage;
	
	@Step
	public void opens_login_page() {
		loginPage.open();
		getDriver().manage().window().maximize();
	}
	
	@Step
	public void input_username(String username) {
		loginPage.inputUsername(username);
	}
	
	@Step
	public void input_password(String password) {
		loginPage.inputPassword(password);
	}
	
	@Step
	public void click_sign_in_button() {
		loginPage.clickSignInButton();
	}
	
	@Step
	public void login_User(String username, String password) {
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickSignInButton();
	}
	
	@Step 
	public void check_current_page_is_login_page(String title) {
//		try {
//			utils.waitForPageToLoad(getDriver());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Expected Login Page Title: "+"["+ title+"]");
		System.out.println("Actual Login Page Title:   "+"["+ loginPage.getTitle()+"]");
		String pageTitle = loginPage.getTitle();
		assertTrue(pageTitle.equals(title));
	}
	
	@Step 
	public void click_forgot_password_link() {
		loginPage.clickForgotPasswordLink();
	}
	
	@Step 
	public void is_recovery(String title) {
		loginPage.clickForgotPasswordLink();
	}
	
	
	
	
}
