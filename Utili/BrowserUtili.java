package Utili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtili {
	
	WebDriver driver;
	public WebDriver InitBrowser(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		
		}
		else {
			System.out.println("This is not correct browser"+ browser);
		}
		return driver;
		}
	public void GetUrl(String url) {
		driver.get(url);
	}
	public String GetCurrentUrl() {
	return driver.getCurrentUrl();
	}
 
	public String GetTitle() {
	return driver.getTitle();
}
	
	public void NavigateToUrl(String ToUrl) {
		driver.navigate().to(ToUrl);
}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void Forward() {
		driver.navigate().forward();
	}
	public void Back() {
		driver.navigate().back();
	}
	public void quit() {
		driver.quit();
}
	public void clsoe() {
driver.close();
	}
	public    WebElement getelement(By Locotor) {
		return driver.findElement(Locotor);
	}
	
	public   void Entersendkeys( By Locotors,String value) {
		getelement(Locotors).sendKeys(value);
	}
	
	}


	


