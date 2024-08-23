package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauseLoginpage {
	private WebDriver driver;
	
	
	private By user=By.xpath("//input[@id='user-name']");
	private By password=By.xpath("//input[@id='password']");
	private By LoginButton=By.xpath("//input[@id='login-button']");
	
	
	public SauseLoginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void enterUserName(String username) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(user).sendKeys(username);
	}
	
	public void enterPassword(String pwd) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(LoginButton).click();
	}


}
