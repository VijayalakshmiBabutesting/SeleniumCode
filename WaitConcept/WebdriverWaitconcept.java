package WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWaitconcept {

	public static void main(String[] args) {
		By EnterUserName=By.xpath("//input[@id='password']");
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");
		// 1 :to wait  this element is present  on the screen or not 
		
		
		driver.findElement(By.id("username")).sendKeys("viji@gmail.com");
		WebDriverWait  wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(EnterUserName));
		 driver.findElement(EnterUserName).sendKeys("Pwd@423");
      
       }
	}

