package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//driver,findelement is webelement
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Fhomepage.html%2F%3Fie%3DUTF8%26adgrpid%3D1341405838299434%26hvadid%3D83838130693495%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D157614%26hvnetw%3Do%26hvqmt%3De%26hvtargid%3Dkwd-83838874655187%253Aloc-90%26hydadcr%3D28884_14559613%26ref%3Dpd_sl_6gwjrxu9p1_e%26tag%3Dhymsabk-20%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		WebElement FName=	driver.findElement(By.id("ap_customer_name"));
		FName.sendKeys("Manish");
		WebElement Contact=	driver.findElement(By.id("ap_email"));
		Contact.sendKeys("07123456789");
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
	
		driver.navigate().refresh();
		//again we need to inspect & mention the action 
	/*	FName.sendKeys("Manish");
		 1)Enter the value in textbox
	 * 2)then refresh
	 * 3) then again enter the value from textbox
	 * 
	 * Outupt: we received stale element exception( element is not available in DOM)
	 * 
	 * Reason: first time enter the value that one is v1 version
	 *         after refresh u will received v2 version
	 *         
	 *  Home to resolved: we need to inspect , mention the webelemnt using locoators
	 *       // Element is not attached to the page document 

				*/
		Thread.sleep(3000);
		WebElement Name=	driver.findElement(By.id("ap_customer_name"));
		Name
		
		.sendKeys("Manish");
		
	}

}
