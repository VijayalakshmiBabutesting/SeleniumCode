package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//// driver,findelement is webelement
public class FormOfCreation {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser ="chrome";
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
		else if(browser.equals("Edge")) {
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}
		else {
			System.out.println("this is not correct browser");
		}
		
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Fhomepage.html%2F%3Fie%3DUTF8%26adgrpid%3D1341405838299434%26hvadid%3D83838130693495%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D157614%26hvnetw%3Do%26hvqmt%3De%26hvtargid%3Dkwd-83838874655187%253Aloc-90%26hydadcr%3D28884_14559613%26ref%3Dpd_sl_6gwjrxu9p1_e%26tag%3Dhymsabk-20%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		WebElement FName=	driver.findElement(By.id("ap_customer_name"));
		FName.sendKeys("Manish");
		WebElement Contact=	driver.findElement(By.id("ap_email"));
		Contact.sendKeys("07123456789");
		
		
		/*if(Contact.equals("07123456789")) {
			System.out.println("correct Phone no");
		}
		else {
			System.out.println("Sorry wrong no");*/
		
	}

}

		
		//click the button  DOUBT
/*WebElement ButtonLink=driver.findElement(By.className("btn btn-ohrm btn-free-demo"));
                     ButtonLink.click(); 
	WebElement FName=	driver.findElement(By.id("Form_getForm_FullName"));
	FName.sendKeys("Manish");
	WebElement Contact=	driver.findElement(By.id("Form_getForm_Contact"));
	Contact.sendKeys("07123456789");
	
	if(Contact.equals("07123456789")) {
		System.out.println("correct Phone no");
	}
	else {
		System.out.println("Sorry wrong no");
	}
	}

}
/*Exception in thread "main" org.openqa.selenium.
 * NoSuchElementException: no such element: Unable to locate
 *  element: {"method":"css selector","selector":"#Form_getForm_FullName"}*/
