package com.another.cardholder.steps;

import static org.junit.Assert.assertTrue;

import com.another.cardholder.pages.RecoverPasswordPage;
import com.another.cardholder.utils.Utils;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RecoverPasswordStep extends ScenarioSteps{
	
	Utils utils;
	RecoverPasswordPage recoverPasswordPage;
	
	public void is_recovery_email_visible() {
		recoverPasswordPage.isRecoveryEmailVisible();
	}
	
	public void click_continue_button() {
		recoverPasswordPage.clickContinueButton();
	}
	
	@Step 
	public void check_current_page_is_recover_password_page(String title) {
//		try {
//			utils.waitForPageToLoad(getDriver());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		String pageTitle = recoverPasswordPage.getTitle();
		System.out.println("Recover Password Page title: "+ recoverPasswordPage.getTitle());
		assertTrue(pageTitle.equals(title));
	}
	
	public void isErrorMessageDisplayed(String errorMessage) {
		assertTrue(recoverPasswordPage.helpBlockValue().equals(errorMessage));
	}

	public void click_back_to_previous_page() {
		getDriver().navigate().back();
	}
	
}
