package GenericFunction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementUtil {
	
WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public  WebElement GetWebElement(By locotors){
		return driver.findElement(locotors);
	}
	public void EnterSendKeys(By locotors, String Value) {
		GetWebElement(locotors).sendKeys(Value);
	}
	
	public void Click (By locotors) {
		GetWebElement(locotors).click();
	}
	public boolean Displayed(By locotors) {
		return GetWebElement(locotors).isDisplayed();
		
	}
	public boolean  Enabled(By locotors) {
		return GetWebElement(locotors).isEnabled();
	}
	
	public boolean  Selected(By locotors) {
		return GetWebElement(locotors).isSelected();
	}
	/*
	 * List of webelement of locotor
	 */
	
	public List<WebElement> ListWebelemet(By Locotor) {
		return driver.findElements(Locotor);
	}
	/*
	 * List of webelement of Tagname 
	 * img = image
	 * a = all link
	 * input =
	 
	 */
	public List<WebElement> GetTagName(String Tagname) {
	 return	driver.findElements(By.tagName(Tagname));
		
	}
	public void GetUrl(String url) {
		driver.get(url);
	}
public void SelctDropDownText(By locotor, String Text) {
		
		Select select = new Select(GetWebElement(locotor));
		select.selectByVisibleText(Text);
		
	}
	
	
	public void SelectDropDownValue(By locotor,String Value ) {
		Select select =new Select(GetWebElement(locotor));
		select.selectByValue(Value);
	}


	public void SelectDropDownINDEX(By locotor,int index   ) {
		Select select =new Select(GetWebElement(locotor));
		select.deselectByIndex(index);
	}
		
		/*
		 * Wedriver wait (ElementtoClick)
		 */
	public   WebElement ElementtoClick(By locator, int timeout) {
		 WebDriverWait wait =new WebDriverWait(driver, timeout);
      return  wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
		
	




