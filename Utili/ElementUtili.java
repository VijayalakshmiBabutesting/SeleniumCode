package Utili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtili {
	
	WebDriver driver; // global driver
	
	//whenver object will create constructor will call for driver
	//driver  is same as browser utilt driver then we will create constructor
	
	//  create  constructor to call the driver for browser utili.
	//bring driver in browser utili with the help of constructor in element
	public ElementUtili(WebDriver driver) {  //local driver
		this.driver=driver;
	}	
public WebElement Findlement(By locotors){
	return driver.findElement(locotors);
}
	public void EnterSendkeys(By locotor ,String value) {
		Findlement(locotor).sendKeys(value);
	}
	public void ClickIN(By locotor) {
		Findlement(locotor).click();
	}
	public void Submit(By locotor) {
		Findlement(locotor).submit();
		
	}
	
	
	
}

