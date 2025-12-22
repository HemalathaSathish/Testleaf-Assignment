package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
			//Accessing Chrome using Chrome Driver
		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");
			option.addArguments("--disable-geolocation");
			option.addArguments("--disable-notifications");
			
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("https://www.pvrcinemas.com/");
		String title1 = driver.getTitle();
		System.out.println("Title of this Page is : " +title1);
					
		driver.findElement(By.xpath("//h6[contains(text(),'Bengaluru')]")).click();
		System.out.println("Blr option is selected");
		
		driver.findElement(By.xpath("//div[@class='date-show']/span[2]")).click();
		System.out.println("Cinema option is selected");

			// Choosing hall name
		driver.findElement(By.xpath("//div[@id='cinema']/span")).click();	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']/ul/li[3]/span)")).click();
		
		// Selecting Date of show
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']/ul/li[2]/span)")).click();
		
		// Selecting movie name
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']/ul/li[4]/span)")).click();
		
		Thread.sleep(3000);
		//Selecting Time for movie
		driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']/ul/li[5]/span/span[1])")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Accepting age declaration
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='d-flex justify-content-center']/button[2]")).click();

		//Accepting Terms
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[2]")).click();
		
		// Selecting seat number and displaying
		driver.findElement(By.xpath("//td/span[@class='seat-current-pvr']")).click();
		
		//Click on proceed
		driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		
		driver.findElement(By.xpath("//span[text()='Skip & Proceed']")).click();
		
		// Retrieving seat number
		String seatNumFinal = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		String seatRow = driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText();
		System.out.println("Selected seat Row and Number is : " + seatRow +" " + seatNumFinal);

		String finalAmt = driver.findElement(By.xpath("//div[@class='all-grand']/div/h6[2]/span")).getText();
		System.out.println("Final Amount to be paid by customer is : " +finalAmt);
		
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();

		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		Thread.sleep(3000);
		
		System.out.println("PVR Session completed");
		
	
	}

}
