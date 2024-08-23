package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseProductPage {
	
	private WebDriver driver;
	
	
	private By AddTocart=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	public SauseProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void clickOnAddToCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AddTocart).click();
	}

}
