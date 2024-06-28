
// Element is not interactable when ever we select all in drop down or link etc


	package AllConcept;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class ElementNotInteractableException{

		static WebDriver driver;
		

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

			Thread.sleep(2000);
			driver.findElement(By.id("justAnInputBox")).click();


			By choice_span = By.xpath("//span[@class='comboTreeItemTitle']");
		
			
			selectChoiceFromDropDown(choice_span, "all");
			
			//////////////////// all => representing single a[0]

		}

		public static void selectChoiceFromDropDown(By locator, String... value) {

			List<WebElement> choiceList = driver.findElements(locator);
			System.out.println(choiceList.size());

			//Step2: if you select single or mutliple drop down
			if(!value[0].equals("all")) {

				for (int i = 0; i < choiceList.size(); i++) {
					String text = choiceList.get(i).getText();
					System.out.println(text);

					for (int j = 0; j < value.length; j++) {
						if (text.equals(value[j])) {
							choiceList.get(i).click();
							break;
						}

					}
			
				}
		}
			else {
				try {
				//for(WebElement e: choiceList) {
				//	e.click();
				
				for (int e = 0; e < choiceList.size(); e++) {
					choiceList.get(e).click();
				}
				}
				catch(Exception e) {
			
				}
		
	}}
	}
	
			

