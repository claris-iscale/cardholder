package com.another.cardholder.utils;

import org.openqa.selenium.WebElement;

public class Utils {

	public void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
}
