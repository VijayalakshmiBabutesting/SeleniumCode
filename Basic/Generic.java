package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {

	WebDriver driver;
	public  WebDriver Webdriver(String browser) {
    
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			
		}
		else {
			System.out.println("can u browse chrome & edge"+ browser);
			
		}
		return driver;
	}
		
		public  WebElement SingleWebElement(By locotors){
			return driver.findElement(locotors);
		}
		public void EnterSendKeys(By locotors, String Value) {
			SingleWebElement(locotors).sendKeys(Value);
		}
		
		public void Click (By locotors) {
			SingleWebElement(locotors).click();
		}
		public boolean Displayed(By locotors) {
			return SingleWebElement(locotors).isDisplayed();
			
		}
		public boolean  Enabled(By locotors) {
			return SingleWebElement(locotors).isEnabled();
		}
		
		public boolean  Selected(By locotors) {
			return SingleWebElement(locotors).isSelected();
		}
		
		public List<WebElement> ListWebelemet(By Locotor) {
			return driver.findElements(Locotor);
		}
		public void GetUrl(String url) {
			driver.get(url);
		}
		
	}
	


