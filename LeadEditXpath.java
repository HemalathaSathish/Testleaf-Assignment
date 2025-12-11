package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeadEditXpath {

	public static void main(String[] args) throws InterruptedException {
			//Accessing Chrome using Chrome Driver
		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");
					
		ChromeDriver driver = new ChromeDriver(option);
				
			//Opening the url
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
				
		// Get the Title of the Resulting Page
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
		
			// Click on leads tab using link value "Leads"
		driver.findElement(By.linkText("Leads")).click();
		
			// Click on Create leads using Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
			//Entering Company name using XPath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Cold Start");
		
			//Enter First name using XPath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pranav");
		
			// Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sathish");
		
			// Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Chintu");
		
			// Enter the Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finanace");
		
			// Enter the Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To bring Business");
	
			// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemajbhalan@gmail.com");
		
			// Select State/Province as NewYork Using Visible Text  ---id and name,xpath locator, not working
		WebElement stateLeadElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select spe = new Select(stateLeadElement);
			spe.selectByVisibleText("New York");
			
			// Click the "Create Lead" button using class="smallSubmit"
		driver.findElement(By.className("smallSubmit")).click();
		
			// Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(2000);
		
			// Clear the Description Field
		WebElement descClear = driver.findElement(By.id("updateLeadForm_description"));
		descClear.clear();
		
		Thread.sleep(2000);
			// Fill the Important Note Field with Any text updateLeadForm_importantNote
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description textbox is cleared");
		
		Thread.sleep(2000);
		
			//Click on the update button -- throws exception used id, xpath
		driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			//Close the browser window.
		driver.close();
		
		
	}

}
