package AllConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodOfSingleDD {
	static WebDriver driver;
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
 driver =new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
// Step1 : click the drop down

driver.findElement(By.id("justAnInputBox")).click();


By ListOfLocotors=By.xpath("//span[@class='comboTreeItemTitle']");
MethodSingleDD(ListOfLocotors, "choice 6 1");
	}
// step2:  Get value from DropDown

public static void MethodSingleDD(By locotors, String Text) {
List<WebElement>AllValueDD=driver.findElements(locotors);
int SizeOf=AllValueDD.size();
System.out.println(SizeOf);
//Step3: print the value

for(int i=0;i<AllValueDD.size();i++) {
String AllValue=	AllValueDD.get(i).getText();

System.out.println(AllValue);

if(AllValue.equals(Text)) {
	AllValueDD.get(i).click();

	break;
}
}
}


}

	
	
	

	
	





