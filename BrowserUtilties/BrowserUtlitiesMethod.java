package BrowserUtilties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtlitiesMethod {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String  browser="chrome";
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
	else if(browser.equals("edge")) {
		WebDriverManager.chromedriver().setup();
		 driver =new EdgeDriver();
	}
	else {
		System.out.println("using chrome or browser"+browser);
	}
	By username=By.id("username");
	By Pwd=By.id("password");
	
	driver.get("https://app.hubspot.com/login/");
	Entersendkeys(username,"viji");
	Entersendkeys(Pwd, "viji@423");
	
	}

	public  static  WebElement getelement(By Locotor) {
		return driver.findElement(Locotor);
	}
		
	public static  void Entersendkeys( By Locotors,String value) {
		getelement(Locotors).sendKeys(value);
	}
	
	/**
	 * Get the value from dropdown, link
	 * Return - Means provide all the value 
	 * 
	 */

public List<WebElement> ListOfWebElement(By Locotors) {
	return driver.findElements(Locotors);


}
}