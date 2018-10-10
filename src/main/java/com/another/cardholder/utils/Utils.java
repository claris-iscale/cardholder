package com.another.cardholder.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils{
	
	
	public void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public void assertTrue() {
		assertTrue();
	}
	
	public void waitForPageToLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
	
	
}
