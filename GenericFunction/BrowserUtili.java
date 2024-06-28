package GenericFunction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtili {
	WebDriver driver;
	public  WebDriver WebdriverAll(String browser) {
    
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

	public void GetUrl(String url) {
		driver.get(url);
	}
	
	public void Forward() {
		driver.navigate().forward();
	}
	public void Backward() {
	driver.navigate().back();
}
	public void NavigateUrl(String Url) {
	driver.navigate().to(Url);
}
	public void quit() {
		driver.quit();
	}
	public void close() {
		driver.close();
		
		
	
}
	/*
	 * alert for wait - non element
	 */
	public Alert alertmethod(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
	 return wait.until(ExpectedConditions.alertIsPresent());
	}
}