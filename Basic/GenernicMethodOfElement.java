package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenernicMethodOfElement {
	static WebDriver driver;
	public static void main(String[] args) {
		//main method using static , global variable we are mentioning static WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");
		
		//locotors
		
		By username=By.id("username");
		By Pwd=By.id("password");
		
		//action
		GenernicMethodOfElement GME=new GenernicMethodOfElement();
		
		//4 type
		GME.getelement(username).sendKeys("viji@cts.com");
		GME.getelement(Pwd).sendKeys("97890");
		// 5 type
		GME.DoSendKey(username, "Perinath@CTS.COM");
		GME.geturl("https://app.hubspot.com/login/");
		GME.NavigateRefresh();

	}

		//Which action doing continous we need to mention generic(common)- create method
		//webelement
	
	//no need static method for calling driver
		public  WebElement getelement(By locotor){// driver,findelement is webelement
			return driver.findElement(locotor);
		}
		public void DoSendKey(By Locotor, String value) {
			 getelement(Locotor).sendKeys(value);//Locotor and send key does not provide return type
			 
			
		}
		public void DoClick(By locotor) {
			getelement(locotor).click();
		}
			public void geturl(String url) {
				driver.get(url);
			}
			public void NavigateRefresh() {
				driver.navigate().refresh();
			}
			public String gettitle() {
				return driver.getCurrentUrl();
}
}
			
			
	
	



