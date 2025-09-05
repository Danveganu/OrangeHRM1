package com.oranghehrm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdminPagePOM {
	WebDriver driver;
	public AdminPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")
	WebElement clicklink_admin;
	@FindBy(xpath="//span[normalize-space()='User Management']")
	WebElement click_usermanagement;
	@FindBy(xpath="//a[normalize-space()='Users']")
	WebElement click_user;
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement click_onAdd;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement employrrname;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']")
	WebElement username;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input' and text()='ESS']")
	WebElement select_userrole;
	
	@FindBy(css=".oxd-select-text-input")
	WebElement ESS;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
	WebElement selectstatus;
	
	@FindBy(xpath="//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")
	WebElement Statusselect;
	@FindBy(xpath="//div[contains(text(),'Enabled')]")
	WebElement enable;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--focus oxd-input--error']")
	WebElement passwrd;
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement cofirmpasswrd;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement clicksave;
	
	
	public void clicklink_admin() {
		clicklink_admin.click();;
	}
	public void click_usermanagement() {
		click_usermanagement.click();;
	}
	public void click_user() {
		click_user.click();
	}
		
	public void click_onAdd() {
		click_onAdd.click();
	}
	public void employeeName(String ename) {
		employrrname.sendKeys(ename);//Linda Anderson
	}
	public void username(String Username) {
		username.sendKeys(Username);//linda.ess
	}
	public void select_userrole1() throws InterruptedException {
		ESS.sendKeys(Keys.DOWN);
		Thread.sleep(300);
		ESS.sendKeys(Keys.DOWN);
		ESS.sendKeys(Keys.ENTER);}
	public void selectstatus() throws InterruptedException {
		enable.sendKeys(Keys.DOWN);
		Thread.sleep(300);
		enable.sendKeys(Keys.DOWN);
		enable.sendKeys(Keys.ENTER);

	}
	public void passwrd(String pass) {
		passwrd.sendKeys(pass);
	}
	public void cofirmpasswrd(String confirmpass) {
		cofirmpasswrd.sendKeys(confirmpass);
	}
	public void clicksave() {
		clicksave.click();
	}

}


