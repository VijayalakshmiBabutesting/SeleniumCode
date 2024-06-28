package AllConcept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOPtionMethod {
  
	
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

	}
	public void GetElement(By locators) {
		driver.findElement(locators);
	}
	public void GetOPtion(By locators) {
		WebElement DropDown= driver.findElement(By.id("Form_getForm_Country"));

		//Step1: value will be store in list
		 
	        List<String> StoreListoFvalue= new ArrayList<String>();
			 Select select =new Select(DropDown);


			List<WebElement> TocallAllValueFromList=select.getOptions();// to get all the value from the drop down
			System.out.println(TocallAllValueFromList.size());	
			for(WebElement e:TocallAllValueFromList ) {
		 
		 
		
		

	}


	}
}
