package Utili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestMethod {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtili BU= new BrowserUtili();
		
		// we can call driver in browser utiltil so we can call it in any name like driver , d etc
		//In element utilti if you create a object that what we are mentioning webdriver driver 
		WebDriver driver=BU.InitBrowser("chrome"); // browser will return driver
		BU.GetUrl("https://app.hubspot.com/login/");
		
		
	
		
		

	


	//step1: to call the driver from browser utili with the help of constructor
		// step2: to create a object to automatically   constructor will call for driver
		// in broswe we need to mention webdriver 
		
		// we can call driver in browser utiltil so we can call it in any name like driver , d etc

	ElementUtili EU= new ElementUtili(driver);// we need to use the parameter for driver
	
	By username=By.id("username");
	By Pwd= By.id("password");
	By ssoBtn= By.id("ssoBtn");
	
	EU.EnterSendkeys(username, "Email@manish.com");
	EU.EnterSendkeys(Pwd, "manish@com");
	EU.ClickIN(ssoBtn);
	
	
	}
}

