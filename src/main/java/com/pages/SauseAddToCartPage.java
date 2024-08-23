package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseAddToCartPage {
	private WebDriver driver;
	
	
	private By checkout=By.xpath("//button[@id='checkout']");
	
	
	public SauseAddToCartPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickoncheckout() {
		driver.findElement(checkout).click();
	}
	

}
