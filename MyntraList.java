package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraList {

	public static void main(String[] args) throws InterruptedException {
		//Accessing Chrome using Chrome Driver
		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");
			
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Opening the url
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//-------------------------------------------------------------------------------------------------
		//search box --> bags --> Gender --> Men --> Category --> Laptop bags
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
	//	Thread.sleep(6000);
		// here skipping input and accessing text directly from label to text andcliking radio
		driver.findElement(By.xpath("//label[contains(@class,'gender-label')][.//text()='Men']")).click();
		System.out.println("Men radio button clicked");
		Thread.sleep(3000);
		
		// here skipping input and accessing text directly from label to text andcliking checkbox
		driver.findElement(By.xpath("//label[contains(@class,'vertical-filters-label')][.//text()='Laptop Bag']")).click();
		System.out.println("Laptobag check box clicked");
		
		List<String> frstPageBranList =new ArrayList<String>();

		List<WebElement> firstPagBran = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
	
		//	System.out.println(firstPagBran); This will show the reference of the location of names
		//the count of the items found
		int frstPagBransize = firstPagBran.size();
		System.out.println("Number of branded products displayed in the first Page : " +frstPagBransize);
		Thread.sleep(3000);
			System.out.print("List of Brands for Luggage Bag : ");
			
		//Receiving the value for list of brand of the products displayed in the page and print the list.
		for (int i = 0; i < firstPagBran.size(); i++) {
			 String listname =driver.findElements(By.xpath("//h3[@class='product-brand']")).get(i).getText();
			  if (!listname.isEmpty()) { 
				  frstPageBranList.add(listname); }
			 }
		  System.out.println(frstPageBranList);

		Collections.sort(frstPageBranList);
		System.out.println();
		System.out.println("Luggage Bag Sorted list : " +frstPageBranList);
		System.out.println();

	//---------------------------------------------------------------------------------------------------------------------
		//Get the list of names of the bags and print it
		
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
		List<String> frstPageBagList =new ArrayList<String>();

		List<WebElement> firstPagBag = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h4"));
	
		//	System.out.println(firstPagBran); This will show the reference of the location of names
		int firstPagBagSize = firstPagBag.size();
		System.out.println("Number of branded products displayed in the first Page : " +firstPagBagSize);
		Thread.sleep(3000);
			System.out.print("List of Bag Brands : ");
		for (int i = 0; i < firstPagBag.size(); i++) {
			 String listnameBag =driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h4")).get(i).getText();
			  if (!listnameBag.isEmpty()) { 
				  frstPageBagList.add(listnameBag); }
			 }
		  System.out.println(frstPageBagList);

		Collections.sort(frstPageBagList);
		System.out.println();
		System.out.println("Bag Sorted list : " +frstPageBagList);

		
		Thread.sleep(3000);
		// driver.close();

	}

}
