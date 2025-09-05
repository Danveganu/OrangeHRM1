package com.oranghehrm;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class BaseClass {
    	
	public static WebDriver driver;
	public org.apache.logging.log4j.Logger logger;
	public Properties p;
	@BeforeMethod
	@Parameters({"os", "browser"})
	public void setup(String os , String br) throws IOException {
		logger= LogManager.getLogger(this.getClass());
		//Loading properties file
		FileReader file= new FileReader("./src//test//resources//config.properties"); 
		p=new Properties();
		p.load(file);
		
	//WebDriverManager.chromedriver().setup();
		
		switch(br.toLowerCase()) {
		case "chrome" : 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); break;
		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(); break;
		case "firefox" : 
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(); break;
	    default :System.out.println("invalid browser name..");
	    return;
		
		
		}
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.get(p.getProperty("appURL"));
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	
	}


    @AfterClass
    public void tearDown() {
	//driver.close();
	//driver.quit();
}


}
