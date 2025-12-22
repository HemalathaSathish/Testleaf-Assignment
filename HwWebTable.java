package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HwWebTable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guests");
		options.addArguments("--diable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://finance.yahoo.com/");
		
		//Mouse hover action on more option
		Actions hover = new Actions(driver);
		WebElement eleHover = driver.findElement(By.xpath("//span[text()='More']"));
		hover.moveToElement(eleHover).perform();
		
			//Selecting crypto option
		driver.findElement(By.xpath("//li[@class='_yb_1vixdbi'][4]/ul/li[8]//a")).click();
		
		List<WebElement> nameEle = driver.findElements(By.xpath("//div[@class='tableContainer yf-1bczin']//table/tbody/tr/td[2]/div"));
		List<String> nameList = new ArrayList<String>();
		
		int nameEleSize = nameEle.size();
		System.out.println("Size of WebEle : " + nameEleSize);
		System.out.println();
		System.out.println("List of Crypto currency names :  ");
		for (int i = 0; i < nameEle.size(); i++) {
			String nameListSamp = nameEle.get(i).getText();
			nameList.add(nameListSamp);
			System.out.println();
		}
		System.out.println(nameList);

	}

}
