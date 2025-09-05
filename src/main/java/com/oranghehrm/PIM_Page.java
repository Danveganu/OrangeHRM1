package com.oranghehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_Page {
	
	
	WebDriver ldriver;
	public PIM_Page(WebDriver driver) {
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='PIM']")
	WebElement PIM;
	
	
	
	
	
	

}
