package WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WedriverwaitVisiablity {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 114
		WebDriverManager.chromedriver().setup();
		//
		By clickelement=By.id("login-button");
		 driver= new ChromeDriver();
         driver.get("https://accounts.lambdatest.com/login?_gl=1*14vzjaa*_gcl_au*MTQ5MTYyMDU3My4xNjkyMTYyODQ3");		
         driver.findElement(By.id("email")).sendKeys("axa@sc.com");
         driver.findElement(By.id("password")).sendKeys("pwd@423");
        // WebDriverWait wait =new WebDriverWait(driver, 30);
        // wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
         
      Visiible(clickelement, 30); 
      driver.findElement(By.id("login-button")).click();

		
         
	}
	public static  WebElement Visiible(By locator, int timeout) {
		 WebDriverWait wait =new WebDriverWait(driver, timeout);
       return  wait.until(ExpectedConditions.elementToBeClickable(locator));

}
}
