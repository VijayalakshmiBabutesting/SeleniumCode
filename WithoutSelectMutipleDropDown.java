

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class WithoutSelectMutipleDropDown {
	static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			
			driver.findElement(By.id("justAnInputBox")).click();
			
				
			
				
		

			
			By ClickDropDown=By.id("justAnInputBox");
		By OverAllOption=By.xpath("//span[@class='comboTreeItemTitle']");
		
		SingleDropDown(OverAllOption, "choice 4", "choice 3");
			
		}
		

		
			
		
		
		
		public static List<WebElement> FindElements(By locator) {
			return driver.findElements(locator);
			
		}
		
		//string ... it's array we can use multiple option to click
		//( String  value ) all the drop down value will be store 
	public static void SingleDropDown(By locator, String... Value){  
		
		List<WebElement> OptionOfChoice= FindElements(locator);
		int SizeOfOPtion=OptionOfChoice.size();
		System.out.println(SizeOfOPtion);
		
		//Call all the value from dropdown
		for (int i=0;i<OptionOfChoice.size();i++) {
			String text =OptionOfChoice.get(i).getText();
			//multiple drop down need to select use array (string ... ). & to call the array use for loop
		for(int j=0; j<Value.length;j++) 
			
		if(text.equals(Value[j])) {  // mention array value
			OptionOfChoice.get(i).click();
			break;
	}
	}
	}
	}

	
