package Basic;
//// driver,findelement is webelement
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWayToFindElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
        driver.get("https://app.hubspot.com/login/");
		
/* 1)Usailabity code.We can call refrence name any time, but use mutilpe data
 * 
		WebElement FName=	driver.findElement(By.id("ap_customer_name"));
		FName.sendKeys("Manish");
		WebElement Contact=	driver.findElement(By.id("ap_email"));
	    Contact.sendKeys("07123456789");
	    ----------------> mutiple data  ---------------------->
		FName.sendKeys("subhas");
		Contact.sendKeys("123456789");*/
/* 2)mutiple time to create a code
 * 
 * driver.findElement(By.id("ap_customer_name")).sendKeys("Manish")
 * driver.findElement(By.id("ap_email")).sendKeys("07123456789");
 */
        
        // 3 Method using By , By return type By
         //Locator
        By Email=By.id("username");
        By Pwd=By.id("password");
        
        //Webelement
       WebElement EnterEmail= driver.findElement(Email);
       WebElement Password= driver.findElement(Pwd);
       
       //Action
       EnterEmail.sendKeys("Manish@cts.com");
       Password.sendKeys("manish@423");
       
        
        

	}

}
