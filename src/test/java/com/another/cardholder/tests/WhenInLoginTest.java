package com.another.cardholder.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.another.cardholder.steps.LoginStep;
import com.another.cardholder.steps.RecoverPasswordStep;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenInLoginTest {
	
	@FindBy(id="loginform-login")
	private WebElement username;
	
	@Managed
    WebDriver driver;
	

	@Steps
	LoginStep loginStep;
	
	@Steps
	RecoverPasswordStep recoverPasswordStep;
	
	@Test
    public void checkEvernoteStaticPage() {
		loginStep.opens_login_page();
		username.click();
//		loginStep.input_password("pass");
//		loginStep.check_current_page_is_login_page("Sign in");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		loginStep.click_forgot_password_link();
//		recoverPasswordStep.check_current_page_is_recover_password_page("Recover your password");
//		recoverPasswordStep.is_recovery_email_visible();
//		recoverPasswordStep.click_continue_button();
//		recoverPasswordStep.isErrorMessageDisplayed("Email cannot be blank.");
//		recoverPasswordStep.click_back_to_previous_page();
//		
//		loginStep.input_username("username");;
		
   }
	
}
