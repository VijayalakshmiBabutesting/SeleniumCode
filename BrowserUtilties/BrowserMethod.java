package BrowserUtilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethod {
	WebDriver driver;
	public WebDriver InitDriver(String Browser) {
		if(Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(Browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
		}
		else {
			System.out.println("Please use correct" + Browser);
			
			}
		return driver;
	}
	
	public void GetUrl(String url) {
		driver.get(url);
	}
	public String GetTtitle() {
		return  driver.getTitle();
		
		
}
	public String GetCurrentUrl(){
		 return driver.getCurrentUrl();
	}
	public void Refresh() {
		driver.navigate().refresh();
	}
	public void Backward() {
		driver.navigate().back();
	}
	public void Forward() {
		driver.navigate().forward();
	}
	public void quit() {
		driver.quit();
	}
}
