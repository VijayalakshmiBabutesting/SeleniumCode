package GenericFunction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtili BU =new BrowserUtili();
		//To Call the browser using webdriver  & refrence name we can give any name
		WebDriver D=BU.WebdriverAll("edge");
		BU.GetUrl("https://www.tatacliq.com/");
		
		//To call the driver using refrence name
		ElementUtil EU= new ElementUtil(D);
		List<WebElement> Allimg=EU.GetTagName("img");
		
		int SizeofImage=Allimg.size();
		System.out.println(SizeofImage);
		for(WebElement w:Allimg) {
		System.out.println(w.getAttribute("src"));
		}
		BU.quit();
			
		}
	}


