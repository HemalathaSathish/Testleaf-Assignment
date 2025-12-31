package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HwActionSnapdeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		options.addArguments("--diable-notifications");
		options.addArguments("--disable-infobars");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Loading the URL
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
	
		// Hovering on Men's Fashion tab
		WebElement menHover = driver.findElement(By.xpath("//div[@id='tab-category-0']/div"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(menHover).perform();
		act1.pause(Duration.ofSeconds(3));
		
		// Selecting Sports Shoe under Men's Fashion Category
		driver.findElement(By.xpath("//div[@class='sc-98d0cbe0-5 fiQtWl'][2]//div[2]")).click();
		
		//Retrieving the Text and value for Sports shoe for men
		WebElement shoeEle = driver.findElement(By.xpath("//ul[@id='js-46105686-nav']//a"));
		List<WebElement> tagval = shoeEle.findElements(By.tagName("div"));
		String content = tagval.get(0).getText();
		String conVal = tagval.get(1).getText();
		System.out.println("The count of " +content + " : " + conVal);
		
		//Selecting the Training Shoes
		driver.findElement(By.xpath("//ul[@id='js-255-nav']//a/div")).click();
		
		//Retrieving the price as List for Training shoes based on popularity
		System.out.print("Training shoes based on Popularity : ");
		List<WebElement> popuEle = driver.findElements(By.xpath("//div[@class='lfloat marR10']/span[2]"));
		List<Integer> popPrice = new ArrayList<Integer>();
		
		for (int i = 0; i < popuEle.size(); i++) {
			String textStr = popuEle.get(i).getText();
				if (!textStr.isEmpty()) {
					String replaced = textStr.replaceAll("[^0-9]", "");
					int replacedPopInt = Integer.parseInt(replaced);
					popPrice.add(replacedPopInt);
					
				}
		}
		System.out.println(popPrice);
		
		Thread.sleep(3000);	

		//Sorting based on Fresh Arrival
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon-expand-arrow')]")).click();
		
		Thread.sleep(3000);	
		 WebElement spanEle = driver.findElement(By.xpath("(//li[@class='search-li'])[1][1]"));
		 driver.executeScript("arguments[0].click();", spanEle); // this will execute the jss script // all our web elements are accessing through HTML
		 
		Thread.sleep(3000);
		//Retrieving the price as List for Training shoes based on LOW TO HIGH
		System.out.print("Training shoes based on LOW TO HIGH : ");
		List<WebElement> lowEle = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> lowPrice = new ArrayList<Integer>();
		
		for (int i = 0; i < lowEle.size(); i++) {
			String textStr1 = lowEle.get(i).getText();
				if (!textStr1.isEmpty()) {
					String replaced1 = textStr1.replaceAll("[^0-9]", "");
					String replaced2 = replaced1.replaceAll("Rs", "");
					int replacedlowInt = Integer.parseInt(replaced2);
					lowPrice.add(replacedlowInt);
					
				}
		}
		System.out.println(lowPrice);
		
	
		
	}

}
