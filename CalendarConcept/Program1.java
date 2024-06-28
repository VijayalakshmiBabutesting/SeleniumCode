package CalendarConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
 driver.get("https://www.ixigo.com/?utm_source=bing&utm_medium=paid_search_google&utm_campaign=Ixigo_Brand&utm_source=Bing&utm_medium=paid_search_Bing&utm_campaign=brand_search_flights&msclkid=168dc7c6f8571855be76a3233ae285b9&utm_term=ixigo&utm_content=Ixigo%20India");
 //click the start  date
 driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
 List<WebElement> DepartDate=driver.findElements(By.xpath("//div[@class='rd-month'][2]/table//div[@class='day has-info']"));
 for(WebElement e :DepartDate) {
if(e.getText().equals("25")) {
	e.click();
	break;
}
 }
 /**
  * Jan - 1 
  * feb -2
  * if u select feb month then it will turn to 3 
  * 
  * 
  * 
  */
	driver.findElement(By.xpath("//input[@placeholder='Return' and @type='text']")).click();

	Thread.sleep(2000);
	// end date
	List<WebElement> endDateList = driver
			.findElements(By.xpath("(//div[@class='rd-month'])[3]/table//div[@class='day has-info']"));

	for (WebElement e : endDateList) {
		if (e.getText().equals("30")) {
			e.click();
			break;
}
 }
       }
       
	}


