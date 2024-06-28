package AllConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
	/*	// Step1: Webelement
		WebElement DropDown= driver.findElement(By.id("Form_getForm_Country"));
		//Store the webelemt in select to create a object
		
	Select select =new Select(DropDown);
	//select.selectByVisibleText("Algeria");
	//select.selectByValue("Anguilla");
	//select.selectByIndex(3); 
	
	*/
	
	By Country=By.id("Form_getForm_Country");
	By Employee= By.id("Form_getForm_NoOfEmployees");
	
	DropDownList DD =new DropDownList();
	DD.SelctDropDownText(Country, "India");
	DD.SelectDropDownValue(Employee,"251 - 300" );
	//DD.SelectDropDownINDEX(Employee, 0)
	}
	
	

	public WebElement getelement(By locotor) {
	return	driver.findElement(locotor);
		
		
	
	}
	public void SelctDropDownText(By locotor, String Text) {
		
		Select select = new Select(getelement(locotor));
		select.selectByVisibleText(Text);
		
	}
	
	
	public void SelectDropDownValue(By locotor,String Value ) {
		Select select =new Select(getelement(locotor));
		select.selectByValue(Value);
	}


	public void SelectDropDownINDEX(By locotor,int index   ) {
		Select select =new Select(getelement(locotor));
		select.deselectByIndex(index);
	}
	


}


