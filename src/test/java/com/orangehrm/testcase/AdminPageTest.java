package com.orangehrm.testcase;

import org.testng.annotations.Test;

import com.oranghehrm.AdminPagePOM;
import com.oranghehrm.BaseClass;
import com.oranghehrm.LoginPagePOM;

public class AdminPageTest extends BaseClass {
	
	
	@Test
	public void admin() throws InterruptedException {
		
		
		LoginPagePOM login = new LoginPagePOM(driver);
		login.getUsername("Admin");
		login.getPass("admin123");
		login.getLoginbtn();
		System.out.println("User login sucessfully");
		
		AdminPagePOM admin=new AdminPagePOM(driver);
		
		admin.clicklink_admin();
		admin.click_usermanagement();
		admin.click_user();
		admin.click_onAdd();
		admin.select_userrole1();
		
		Thread.sleep(300);
		
		//admin.employeeName("Bhakti Danve");
		admin.selectstatus();
		admin.username("bhakti1");
		admin.passwrd("Bhakti123");
		admin.cofirmpasswrd("Bhakti123");
		admin.clicksave();
		}
		

}
