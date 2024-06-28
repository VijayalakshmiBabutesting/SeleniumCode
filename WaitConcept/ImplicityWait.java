package WaitConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 *  1) Global wait 
 *  2) only for web element
 *  3)not for url,currently url , title etc
 *  4) it is dynamci wait . time is not fixed 
 * Ex: wait we gave 10 second 
 * within 5  second we found the web element it will not wait for reaming 5 second . 
 * 
 * polling time  500 ms =.5s
 */
public class ImplicityWait {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.accenture.com/in-en");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

	}

}
