package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HwActionAuto {
		
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			options.addArguments("--diable-notifications");
			options.addArguments("--diable-infobars");
			
		ChromeDriver driver =  new ChromeDriver(options);
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.amazon.in/");
			
			  for (int i = 0; i < 5; i++) {
				  driver.navigate().refresh();
				  Thread.sleep(3000); 
			  if (driver.getPageSource().contains("captcha")) {
				  driver.findElement(By.className("a-button-text")).click();
			  }else {
				break;
			}
			  
			  }
			 
				// Search "oneplus 9 pro"
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
			
			// Retriving the price 
			WebElement price = driver.findElement(By.xpath("//span[@class='a-price']/span[2]"));
			List<WebElement> elements = price.findElements(By.tagName("span"));
			
			int int1=0;
			for (int i = 0; i < elements.size(); i++) {
				String text1 = elements.get(0).getText();
				String text2 = elements.get(1).getText();
					if (!text2.contains("Sponsored") && !text2.isEmpty()) {
				        text2 = text2.replaceAll("[^0-9]", "").trim();
						int1 = Integer.parseInt(text2);
						System.out.println("The Price of first Product : " +text1 + " " +int1 );
						break;
			}
					
	  }			
			WebElement ele = driver.findElement(By.xpath("//div[@class='a-row a-size-small']/span[2]//i"));
			Actions act1 = new Actions(driver); 
			act1.moveToElement(ele).perform();
			
			ele.click();
			
			//Retrieving the rating for the product
			String rate = driver.findElement(By.xpath("//div[@class='a-row a-spacing-medium']/span")).getText();
			System.out.println("Number of people rated : "+rate);
			
			driver.findElement(By.xpath("//div[@class='puisg-col-inner']//div/a/h2/span")).click();
			
			//Switching the window from parent window to child window
			Set<String> windowHandles1 = driver.getWindowHandles();
			System.out.println("Window List : "+windowHandles1);
			List<String> winDet = new ArrayList<String>(windowHandles1);
			
			//Switching the driver focus to child window
			driver.switchTo().window(winDet.get(1));
			Thread.sleep(3000);
			
			//Printing the child window title
			String ChildTitle = driver.getTitle();
			System.out.println("Child page Title : " +ChildTitle);
			
			//Taking the screenshot and saving as .png file
			File screenshotSrc = driver.getScreenshotAs(OutputType.FILE);
			File screenshotDest = new File("./data/sample2.png");
			FileUtils.copyFile(screenshotSrc, screenshotDest);
			
			driver.findElement(By.id("add-to-cart-button")).click();
			
			//Retrieving the total amt of the product
			WebElement subtot = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']/span[2]"));
			List<WebElement> elements2 = subtot.findElements(By.tagName("span"));
			
			int int2=0;
			for (int i = 0; i < elements2.size(); i++) {
				String sym1 = elements2.get(0).getText();
				String pri = elements2.get(1).getText();
				if (!pri.contains("Sponsored") && !pri.isEmpty()) {
					pri = pri.replaceAll("[^0-9]", "");
					int2 = Integer.parseInt(pri.trim());
					System.out.println("The Price of first Product : " +sym1 + " " +int2);
					break;
		}
				
  }
			// Comparing the price of first product of Parent window to enlarged format in child window
			if (int1== int2) {
				System.out.println("Prices in both page are similar");
				
			}else {
				System.out.println("Prices in both page are NOT similar");
			}
			driver.close();	
		
	}

}
