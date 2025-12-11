package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccSelect {

	public static void main(String[] args) {
			//Accessing Chrome using Chrome Driver
		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");
					
		ChromeDriver driver = new ChromeDriver(option);
				
			//Opening the url
		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();
				
			//Displays page name
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
				
			//provide user name using id="username" attribute
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
			///provide user password using name="PASSWORD" attribute
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				
			// Click on Login button using class="decorativeSubmit"
		driver.findElement(By.className("decorativeSubmit")).click();
				
			//Click on CRM/SFA using partial text=CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
				
			//Clicking on Account tab using link
		driver.findElement(By.linkText("Accounts")).click();
				
			//Clicking on create Account in Account tab
		driver.findElement(By.linkText("Create Account")).click();

			// Enter value to Account Name using id="accountName"
		String name= "Pranav";
		driver.findElement(By.id("accountName")).sendKeys(name);
		

			//Enter a description using name="description" as "Selenium Automation Tester." 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				
		WebElement indusElement = driver.findElement(By.name("industryEnumId"));
			Select ie = new Select(indusElement);
			ie.selectByIndex(3);
		
		WebElement ownerElement = driver.findElement(By.name("ownershipEnumId"));
			Select oe = new Select(ownerElement);
			oe.selectByVisibleText("S-Corporation");
			
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
			Select se = new Select(sourceElement);
			se.selectByValue("LEAD_EMPLOYEE");
			
			//marketingCampaignId
		WebElement marcampEle = driver.findElement(By.id("marketingCampaignId"));
			Select mce = new Select(marcampEle);
			mce.selectByIndex(6);
			
			//generalStateProvinceGeoId
		WebElement stateProElement = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select spe = new Select(stateProElement);
			spe.selectByValue("TX");
			
			// click on Create Account button using class="smallSubmit"
		driver.findElement(By.className("smallSubmit")).click();
		
	//	driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
		
		String accName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
			System.out.println("Name : "+ accName);
			
			
		// driver.close();
		
			
	}

}
