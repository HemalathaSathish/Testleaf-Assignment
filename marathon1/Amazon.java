package marathon1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String amzTitle = driver.getTitle();
		System.out.println("Title of the Current Web Page is : " +amzTitle );
		System.out.println();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
		
		/*
		 * String category = driver.findElement(By.xpath("//h2[contains(@class,'a-spacing-top-small')]/span[3]")).getText();
		 * System.out.println("Category of Search : " +category); System.out.println();
		 * 
		 * String numBags = driver.findElement(By.xpath("//h2[contains(@class,'a-spacing-top-small')]/span[1]")).getText();
		 * System.out.println("Number of Bags for Boys displayed from total number : " +numBags + " "+ category);
		 */
		
		// Above comentted can also be used to retrieve for below codes as 
		// create WebElement --> createListfor span--> access using get() ->display
		
		WebElement webEle= driver.findElement(By.xpath("//h2[contains(@class,'a-spacing-top-small')]")); //Parent tag
		
		List<WebElement> spans = webEle.findElements(By.tagName("span"));
		String child1 = spans.get(0).getText();			//child tag 1
		String child2 = spans.get(2).getText();			// child tag 2 - accessing both tag using 1 web element
		System.out.println("Number of Bags for Boys displayed from total number : " + child1 + " " + child2);
		System.out.println();
//----------------------------------------------------------------------------------------------------------------------
			//List of First 2 Brand Names Alone, List of Brand Names in first page
		List<WebElement> branlist = driver.findElements(By.xpath("//div[@id='brandsRefinements']//li//div/following-sibling::span"));
		
		int size1 = branlist.size();
		System.out.println("The size of brand list : " +size1);
		
		List<String> branNames = new ArrayList<String>();
		List<String> twoBranNames = new ArrayList<String>();

		for (int i = 0; i < branlist.size(); i++) {
			String text1 = branlist.get(i).getText();
			if(!text1.isEmpty()) {
				branNames.add(text1);
			}
		}
			for (int j = 0; j < branlist.size(); j++) {
				if(j<=1) {
					String text2 = branlist.get(j).getText();
					if(!text2.isEmpty()) {
						twoBranNames.add(text2);
				}
			}
		}		
		System.out.println("List of Brand Names in first page: " +branNames);
		System.out.println("List of First 2 Brand Names Alone: " +twoBranNames);
		
	//-----------------------------------------------------------------------------------------------------------	
		WebElement featuEle = driver.findElement(By.id("s-result-sort-select"));
		Select ele1 = new Select(featuEle);
		ele1.selectByIndex(4);
		
		driver.findElement(By.id("s-result-sort-select_4")).click();
		System.out.println("Newest Arival Selected");
		
	//----------------------------------------------------------------------------------------------------------
		//getting the span values of both children using webelement storing the tag in list and and retrieving child tag value
		
		String firstProd = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-4']//h2/span")).getText();
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-4']//div/a/span[@class='a-price']/span[2]"));
		List<WebElement> elements1 = price.findElements(By.tagName("span")); 
				String priceSym = elements1.get(0).getText(); 
				String priceVal = elements1.get(1).getText();
		 System.out.println("Name of First Product and Price : " + firstProd + " " + priceSym + priceVal);
		 driver.close();
		}
}