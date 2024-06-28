package WaitConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitForAlert {
// Alert is not a webelement
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
	Alert alertaccept=	wait.until(ExpectedConditions.alertIsPresent());
	//get text from the alert
	System.out.println(alertaccept.getText());
	//get accept from the alert
		alertaccept.accept();
		// get dismiss from the alert
		//alertaccept.dismiss();

	}

}
