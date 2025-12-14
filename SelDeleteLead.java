package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelDeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		
			// Click "Find leads" 
		driver.findElement(By.linkText("Find Leads")).click();	
			
			// Click on the "Phone" tab
		driver.findElement(By.linkText("Phone")).click();
		
			// Enter the phone number
		driver.findElement(By.name("phoneAreaCode")).sendKeys("001");
		driver.findElement(By.name("phoneNumber")).sendKeys("956 4721");
		
			// Click the "Find leads" button 
		driver.findElement(By.linkText("Find Leads")).click();
		
			// Capture the lead ID of the first resulting lead 
		WebElement capElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				String text1 = capElement.getText();
				System.out.println("First Lead id : " + text1);
		
			// Click the first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		         
		// Click the "Delete" button.ext-gen620
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
			// Click "Find leads" again
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
			// Enter the captured lead ID. 
		driver.findElement(By.name("id")).sendKeys(text1);
		
			// Click the "Find leads" button 
//driver.findElement(By.xpath("(//td[@class='x-btn-center']//button)[7]")).click(); ---Thsi is also correct.
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Displaying lead id availability : " +text2);
		
		
			

				
				
	}

}
