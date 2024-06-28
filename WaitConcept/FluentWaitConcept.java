package WaitConcept;

import java.time.Duration;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	/**
	 * Fluent wait -  parent class 
	 * Webdriver wait - child  
	 * wait is a interface (wait implementing webdriver & fluent wait
	 * 
	 * Advantage of fluent wait (
	 * 1)withtimeout- 10 second
	 * 2)polling time - divided the timeout
	 * 3)ignoring exception - assume what kind of kind we received , that exception we need to mention
	 * 4)message
	 * @param args
	 */
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://career.infosys.com/joblist");
	driver.findElement(By.linkText("Register")).click();
	///driver.findElement(By.name("")).sendKeys("xyz");
	Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(30))
	.pollingEvery(Duration.ofSeconds(5))
	.ignoring(Exception.class);// we can mention any type of exception
	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstnameX"))).sendKeys("xvbn");
	
	
	
	
	}

}
