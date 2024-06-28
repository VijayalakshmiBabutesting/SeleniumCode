package GenericFunction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can call driver in browser utiltil so we can call it in any name like driver , d etc

		BrowserUtili BU= new BrowserUtili();
		
	// 	d as a driver to call the browser
	WebDriver d=	BU.WebdriverAll("chrome");
		BU.GetUrl("https://www.amazon.in/");

	
//to call the driver 
		// we can call driver in browser utiltil so we can call it in any name like driver , d etc
	
	ElementUtil Eu = new ElementUtil(d);
	List<WebElement> AllImg=Eu.GetTagName("a");
	
	int GetSize= AllImg.size();
	System.out.println(GetSize);
	
	
	for(WebElement w:AllImg ) {
		String Text=w.getText();
		if(!Text.isEmpty())
		System.out.println(Text);
		
		
	}
	BU.quit();
	
}
}