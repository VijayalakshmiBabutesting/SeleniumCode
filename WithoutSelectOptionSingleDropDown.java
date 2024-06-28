import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectOptionSingleDropDown {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		/*
		List<WebElement> OptionOfChoice= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		int SizeOfOPtion=OptionOfChoice.size();
		System.out.println(SizeOfOPtion);
		System.out.println(SizeOfOPtion);
		for (int i=0;i<OptionOfChoice.size();i++) {
			String text =OptionOfChoice.get(i).getText();
		
		if(text.equals("choice 4")) {
			OptionOfChoice.get(i).click();
			
		
			
		}
	}

	} */
		
		By ClickDropDown=By.id("justAnInputBox");
	By OverAllOption=By.xpath("//span[@class='comboTreeItemTitle']");
	
	SingleDropDown(OverAllOption, "choice 4");
		
	}
	

	
		
	
	
	
	public static List<WebElement> FindElements(By locator) {
		return driver.findElements(locator);
		
	}
public static void SingleDropDown(By locator, String Value){
	
	List<WebElement> OptionOfChoice= FindElements(locator);
	int SizeOfOPtion=OptionOfChoice.size();
	System.out.println(SizeOfOPtion);
	for (int i=0;i<OptionOfChoice.size();i++) {
		String text =OptionOfChoice.get(i).getText();
	
	if(text.equals(Value)) {
		OptionOfChoice.get(i).click();
		break;
}
}
}
}