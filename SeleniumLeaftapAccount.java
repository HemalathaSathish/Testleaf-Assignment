package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumLeaftapAccount {

	public static void main(String[] args) {
		//Accessing Chrome using Chrome driver
//		ChromeDriver driver = new ChromeDriver();

		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");  
				  
		  //Instantiate the Browser 

		ChromeDriver driver = new ChromeDriver(option);
	
		//opening url using get method
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize(); // open window to maximum size
		
		String pageTitle = driver.getTitle();  //Getting page title
		System.out.println(pageTitle);
		
		// input user name value id="username"
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// input password value 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Clicking on login button using class="decorativeSubmit"
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Clicking on "CRM/SFA" link src="/opentaps_images/integratingweb/crm.png"
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Clicking on Account tab using link
		driver.findElement(By.linkText("Accounts")).click();
		
		//Clicking on create Account in Account tab
		driver.findElement(By.linkText("Create Account")).click();

		// Enter value to Account Name using id="accountName"
		driver.findElement(By.id("accountName")).sendKeys("Hemalatha");
		
		//Enter a description using name="description" as "Selenium Automation Tester." 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter a Number Of Employees using id="numberEmployees" as 12
		driver.findElement(By.id("numberEmployees")).sendKeys("12");
		
		// Enter a Site Name using name="officeSiteName"  as “LeafTaps"
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		
		// click on Create Account button using class="smallSubmit"
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
	}

}
