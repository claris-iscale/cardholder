package com.another.cardholder.steps;

import com.another.cardholder.pages.LoginPage;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@At("https://dev.cardholder.an-other.co.uk/user/login")
public class LoginStep extends ScenarioSteps{
	LoginPage loginPage;
	
	@Step
	public void input_username(String username) {
		loginPage.inputUsername(username);
	}
	
	@Step
	public void open_login_page() {
		loginPage.open();
		getDriver().manage().window().maximize();
	}
	
	@Step
	public void input_password(String password) {
		loginPage.inputUsername(password);
	}
}
