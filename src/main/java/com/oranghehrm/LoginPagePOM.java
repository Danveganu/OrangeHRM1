package com.oranghehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPagePOM {
	
	
	WebDriver ldriver;
	public LoginPagePOM(WebDriver driver) {
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement requiredmsg;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement wrngpswd;
	
	public void getUsername(String uname) {
		username.sendKeys(uname);
	}
	public void getPass(String passwd) {
		pass.sendKeys(passwd);
	}
	public void getLoginbtn() {
		 loginbtn.click();
	}
	//validation message
	public void MsgRequired() {
		String actual=requiredmsg.getText();
		String expected="Required";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		}
	public void wrongpswd() {
		String actual=wrngpswd.getText();
		String expected="Invalid credentials";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		
	}}
