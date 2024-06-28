package AllConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleDDWithoutMethod {

static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		//Click the drop down
		driver.findElement(By.id("justAnInputBox")).click();
		GetMutilpeMethod("choice 4", "choice 3");
	}
		public static void GetMutilpeMethod(String...value) {
		//get the value from dd
		List<WebElement> GetDDValue=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		int TotalSizeDD=GetDDValue.size();
		System.out.println(TotalSizeDD);
		// print the dd
		for(int i=0;i<GetDDValue.size();i++) {
			String GetAllText=GetDDValue.get(i).getText();
			System.out.println(GetAllText);
			
			for(int j=0;j<value.length;j++) {
				if(GetAllText.equalsIgnoreCase(value[j])) {
				GetDDValue.get(i).click();
			}
			
			
			
		}
		}


	}

}
