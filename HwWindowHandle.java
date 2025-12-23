package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HwWindowHandle {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		options.addArguments("--diable-notifications");
		options.addArguments("--disable-infobars");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
			//Clicking CRM/SFA button
		driver.findElement(By.id("button")).click();
		
			// receiving the title of driver focused page
		String title = driver.getTitle();
		System.out.println("Title of the page : " +title );		

			// Clicking on Contact tab
		driver.findElement(By.xpath("//ul[@class='sectionTabBar']/li[3]//a")).click();
		
			// Clicking on Merge Contact tab
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[4]")).click();
		
			// Click on Widget of From Contact
		driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr/td[2]/a")).click();
		
			// move driver focus to child window and accessing
		Set<String> childAccess = driver.getWindowHandles();
		List<String> childWin = new ArrayList<String>(childAccess);
		driver.switchTo().window(childWin.get(1));
		
		driver.manage().window().maximize();
		
			//Accessing first row for from
		WebElement tab1Value = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td//a"));
		String fromText = tab1Value.getText();
		
//driver.close(); //Closes the child window of FROM contact
	
			//moving driver focus to parent window
		driver.switchTo().window(childWin.get(0));
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']")).sendKeys(fromText);
		
			// Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr[2]/td[2]/a")).click();
		 
			// Moving driver focus to child window
		driver.switchTo().window(childWin.get(1));
		
		System.out.println("Received contact id from Child window for FROM Contact");
		driver.manage().window().maximize();
	
			//Accessing Second row for To contact
		WebElement tab2Value = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[2]//tbody//td/div"));
		String toText = tab2Value.getText();
			
//driver.close(); //Closes the child window of TO contact

		//moving driver focus to parent window
		driver.switchTo().window(childWin.get(0));
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']")).sendKeys(toText);
		
		System.out.println("Received contact id from Child window for TO Contact");

			//Clicking on Merge button
		driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr[4]/td[2]/a")).click();
		
			//Accepting the alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		System.out.println("Alert is closed");
		
			
	}

}
