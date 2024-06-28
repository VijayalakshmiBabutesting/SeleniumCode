package AllConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectSingleDropDown {
static WebDriver driver;
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
// Step1 : click the drop down
driver.findElement(By.id("justAnInputBox")).click();

// step2:  Get value from DropDown
List<WebElement>AllValueDD=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
int SizeOf=AllValueDD.size();
System.out.println(SizeOf);
//Step3: print the value

for(int i=0;i<AllValueDD.size();i++) {
String AllValue=	AllValueDD.get(i).getText();

System.out.println(AllValue);

if(AllValue.equals("choice 6 1")) {
	AllValueDD.get(i).click();

	break;
}
}


}
}

	
	
	

	
	



