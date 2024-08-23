package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseCheckoutoverviewPage {
	private WebDriver driver;
	
	
	private By finishbtn=By.xpath("//button[@id='finish']");
	
	
	public SauseCheckoutoverviewPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnfinish() {
		driver.findElement(finishbtn).click();
	}

}
