package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumCreateLead {

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
		
			// Click on leads tab using link value "Leads"
		driver.findElement(By.linkText("Leads")).click();
		
			// Click on Create leads using Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
			// Enter a FirstName using id="createLeadForm_firstName"
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pravan");
				
			// Enter a LastName using id="createLeadForm_lastName"
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathish");
				
			// Enter a CompanyName using id="createLeadForm_companyName"
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("P Square");
					
			// Click the "Create Lead" button using class="smallSubmit"
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
	
        }

}
