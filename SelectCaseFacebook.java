package week2.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectCaseFacebook {

	public static void main(String[] args) {
			//Accessing Chrome using Chrome Driver
		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");
					
		ChromeDriver driver = new ChromeDriver(option);
				
			//Opening the url
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
			// Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
			// Enter the First name. name=firstname
		driver.findElement(By.name("firstname")).sendKeys("Yadav");
		
			// Enter the Surname. name="lastname" 
		driver.findElement(By.name("lastname")).sendKeys("Moorthy");
		
			// Handle all three dropdowns in Date of birth.  name="birthday_day"
		WebElement dayElement = driver.findElement(By.name("birthday_day"));
			Select dEle = new Select(dayElement);
			dEle.selectByIndex(19);
			
			//name="birthday_month"
		WebElement monthElement = driver.findElement(By.name("birthday_month"));
			Select monEle = new Select(monthElement);
			monEle.selectByVisibleText("Aug");
			
			// name="birthday_year"
		WebElement yearElement = driver.findElement(By.name("birthday_year"));
			Select yrsEle = new Select(yearElement);
			yrsEle.selectByValue("1991");	
			
			// Select the radio button in Gender.
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
			radioButtons.get(1).click();
				
			// Enter the Mobile number or email address. name="reg_email__""
		driver.findElement(By.name("reg_email__")).sendKeys("9972604809");
		
			// Enter the New password. id="password_step_input"
		driver.findElement(By.id("password_step_input")).sendKeys("Yad@moor123");
		
			
		


	}

}
