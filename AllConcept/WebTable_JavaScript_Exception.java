package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_JavaScript_Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/contacts");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("manishchugh1981@gmail.com");
		driver.findElement(By.name("password")).sendKeys("iloveU@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		//String checkbox_xpath = "//a[text()='Tenveer Hussain']//parent::td//preceding-sibling::td//input[@type='checkbox' and @name='id']";
	 	driver.findElement(By.xpath("//input[@type='checkbox' and @name='id']")).click();
		// driver.findElement(By.xpath(checkbox_xpath)).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", ele);
	}
}

