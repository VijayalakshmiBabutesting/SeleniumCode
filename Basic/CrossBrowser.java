package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/* driver,findelement is webelement
 * one if condition {} is we can consider as block inside a braces , so cannot access outside
 * driver is common for inside or outside block .
 * we access driver then we mention as global variabel
 * In global variable mention Static webdriver driver, because main method you have static .
 * if you using main method(static) for driver
 * without static we can create method & acesse driver
 * locally it is fine 
 * if you want use  multiple method  then we can declare the global variable
 */
public class CrossBrowser {
	

	static WebDriver driver;
	public static void main(String[] args) {//safari there is no webdrivermanager
		
		String browser="Edege";
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}
		else if(browser.equals("Edege")) {
			WebDriverManager.edgedriver().setup();
			 driver =new EdgeDriver();
		}
		else {
			System.out.println("please use chrome & edge ");
		
	}
		driver.get("https://www.google.co.in/");
		String Currenturl=driver.getCurrentUrl();
		System.out.println(Currenturl);
		driver.quit();

}
}


