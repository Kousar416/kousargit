package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseCheckoutPage {
	private WebDriver driver;
	
	private By firstname=By.xpath("//input[@id='first-name']");
	private By lastname=By.xpath("//input[@id='last-name']");
	private By postcode=By.xpath("//input[@id='postal-code']");
	private By continuebtn=By.xpath("//input[@id='continue']");
	
	public SauseCheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterfirstName(String firstName) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(firstname).sendKeys(firstName);
	}
	
	public void enterlastName(String lastName) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(lastname).sendKeys(lastName);
	}
	
	public void enterpostalCode(String postcodenum) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(postcode).sendKeys(postcodenum);
	}
	
	public void clickOncontinue() {
		driver.findElement(continuebtn).click();
	}
	

}
