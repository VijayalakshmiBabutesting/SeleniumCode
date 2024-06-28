package WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictyWaitConcept {

		// TODO Auto-generated method stub
		
		/**
		 * 1)Dynamic wait
		 * 2)it is a custom wait for a specfic element
		 * 3)not a global wait 
		 * 4)Explicity wait two type 
		 * 
		 *   * web driver wait (Webelement,url and alert)
		 *   * fluent wait
		 *   only we can provide single webelement
		 *   within the second to the element or url . it will receive tie out exception
		 */
		
	/**
	 * webdriver wait pooling time method is available(default 500 ms)
	 * 
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromiumdriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://app.hubspot.com/login/");
			driver.findElement(By.id("username")).sendKeys("viji@gmail.com");
	       WebDriverWait wait =new WebDriverWait(driver, 10);
	       //2 contains means partail
	        wait.until(ExpectedConditions.titleContains("HubSpot"));
	        
	       String title= driver.getTitle();
	       System.out.println(title);
	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pwd@423");
	       // 3 is titile - full title
	       wait.until(ExpectedConditions.titleIs("HubSpot Login"));
	       
	       try {
	       String titles= driver.getTitle();
	       
	       }
	       catch(Exception e) {
	    	   e.printStackTrace();
	       }
	       }
		}



