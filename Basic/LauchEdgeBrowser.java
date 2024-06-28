package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//driver,findelement is webelement
public class LauchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//webdriver is interface we cnnot create a object
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
driver.get("https://www.google.co.in/");
String Currenturl=driver.getCurrentUrl();
System.out.println(Currenturl);
if(driver.getCurrentUrl().contains("https://www.google.co.in")) {
	System.out.println("correct current url");
}
else {
	System.out.println("not correct current url");
}
driver.getTitle();

driver.getPageSource();
driver.close();

	}

}
