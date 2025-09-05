package com.orangehrm.testcase;

import java.time.Duration;

import org.testng.annotations.Test;

import com.oranghehrm.BaseClass;
import com.oranghehrm.LoginPagePOM;

public class LoginPageTest extends BaseClass {
	
	
	@Test
	public void aloginfunction() {
		
		
		LoginPagePOM login = new LoginPagePOM(driver);
		login.getUsername("Admin");
		login.getPass("admin123");
		login.getLoginbtn();
		System.out.println("User login sucessfully");
		}
	@Test
	public void bloginfunction() {
		
		LoginPagePOM login = new LoginPagePOM(driver);
		logger.info("username missing");
		login.getUsername("");
		login.getPass("admin123");
		login.getLoginbtn();
		login.MsgRequired();
		}
	@Test
	public void cloginfunction() {
		
		LoginPagePOM login = new LoginPagePOM(driver);
		logger.info("password missing");
		login.getUsername("Admin");
		login.getPass("");
		login.getLoginbtn();
		login.MsgRequired();
		}
	@Test
	public void dloginfunction() {
		
		LoginPagePOM login = new LoginPagePOM(driver);
		logger.info("user&password missing");
		login.getUsername("");
		login.getPass("");
		login.getLoginbtn();
		login.MsgRequired();
		}
	@Test
	public void eWrongPasswrd() {
		
		LoginPagePOM login = new LoginPagePOM(driver);
		logger.info("Error message = Invalid credentials ");
		login.getUsername("Admin");
		login.getPass("jfnjj");
		login.getLoginbtn();
		login.wrongpswd();
		}
}
