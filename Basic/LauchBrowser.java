package Basic;
// 2 session 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchBrowser {
	// driver,findelement is webelement
	public static void main(String[] args) {
		
/*Webdriver driver =new webdriver
		we cannot create a object for interface
		*Webdriver =interface
		 *  driver =reference name
		 *   new to create a object
		 *   chromedriver =class 
		 */
		/*Two way to lauch the browser
		 * 1) download recent chrome version(do some changes in properties file manually(system.set property)
		 
		 *2) pom  mention the depencies (in pom we can change the version along
		 */ 
//WebDriver driver = new ChromeDriver(); //top casting
		WebDriverManager.chromedriver().setup();
		
		//latest of version no need this step WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://bonigarcia.dev/webdrivermanager/");
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equals("WebDriverManager")) {
			System.out.println("correct webdriver browser");
		}
			else {
				System.out.println("not correct");
			}
			
		
			
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			
			if(currenturl.equals("https://bonigarcia.dev/webdrivermanager/")) {
				System.out.println("correct current url");
				
			}
			else {
				System.out.println("not current url");
			}
			//<---------------------------------------------->
			if(driver.getCurrentUrl().contains("https://bonigarcia.dev/webdrivermanager/")) {
	System.out.println("correct contains  current url");
				
			}
			else {
				System.out.println("not current url");
			}
		String PageSource=	driver.getPageSource();
		System.out.println(PageSource);
			}
	
}
	

	





















/*The path to the driver executable must be set by the
 *  webdriver.chrome.driver system property; for more information,
 *   see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest
 *    version can be downloaded from http://chromedriver.storage.googleapis.com/
 *    index.html
 *    
 *    "We need to install chrome browser, if we  intergated chrommebrowser than launch 
 *    the browser 
 *    installl chrome browser 
 */

	


