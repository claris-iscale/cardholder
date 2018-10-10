package com.another.cardholder.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.another.cardholder.pages.LoginPage;
import com.another.cardholder.steps.LoginStep;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenInLoginTest {
	
	@Managed
    WebDriver driver;
	
	LoginPage loginPage;
	@Steps
	LoginStep loginStep;
	
	
	
	@Test
    public void checkEvernoteStaticPage() {
		loginStep.open_login_page();
        loginStep.input_username("username");
        loginStep.input_password("corre");
    }
	
}
