package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfLink {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://www.orange.com/en");
		
		
		By Tagname=By.tagName("a");
		
		DoAllList(Tagname);
	}
		public static  void DoAllList(By Locator) {
		List<WebElement> AllList=driver.findElements(Locator);
		int AllListSize=AllList.size();
		for(int i =0;i<AllList.size();i++) {
			if(AllList.equals("FR")) {
				
		AllList.get(i).click();
		      
			}
			
		
			

		}
		
		
		driver.quit();
		}
		;
	}


