package AllConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithSelectGetOption {
/*
 * To call all the value from drop down using" getOption
 */
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//getOption -to get all the element
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.orangehrm.com/contact-sales/");
			WebElement DropDown= driver.findElement(By.id("Form_getForm_Country"));
			driver.manage().timeouts().implicitlyWait(0, null);
			//Store the webelemt in select to create a object
			
			Select select= new Select(DropDown);
			List<WebElement> AllDropDown=select.getOptions();// to get all the value from the drop down
		System.out.println(AllDropDown.size());	
			for(int i=0; i<AllDropDown.size(); i++) {
			String 	text=(AllDropDown.get(i).getText());
			System.out.println(text);
				if(text.equals("American Samoa")) {
					AllDropDown.get(i).click();
				}
				
				
			}
			/*
			for(WebElement e :AllDropDown) {
				
				System.out.println(e.getText());
			}
			
*/
	}

}
