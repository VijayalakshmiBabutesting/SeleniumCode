package AllConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutlipleDDUsingMethod {
static WebDriver driver;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
 driver =new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
By ClickDropDown=By.id("justAnInputBox1");
  By  AllOption  =By.xpath("//span[@class='comboTreeItemTitle']");
     SelectDropDown(ClickDropDown);
     GetAllMethod(AllOption);
     GetAllMethod(AllOption,"choice 6 1", "choice 6 2 3","choice 6 2" );

	}
	
	public static WebElement Findelement(By Locotors) {
		return driver.findElement(Locotors);
		
	}
	//Get DD form Locotors Using list 
	public static List<WebElement> ListEelement(By locotors) {
		return driver.findElements(locotors);
	}
	//ClickDropDown
public static void SelectDropDown(By Locotors) {
	Findelement(Locotors).click();
}

public static  void GetAllMethod(By locotors ,String... value) {
	
	List<WebElement> AllOption=ListEelement(locotors);
int TotalDD=	AllOption.size();
System.out.println(TotalDD);

for(int i=0;i<AllOption.size();i++) {
	String AllGetText=AllOption.get(i).getText();
	System.out.println(AllGetText);

	for(int j=0;j<value.length;j++) {
		
		if(AllGetText.equals(value[j])) {
			AllOption.get(i).click();
		}
			
		
		}
}
}
}



