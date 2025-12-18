package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameAlertVerifi {

	public static void main(String[] args) {
		//Accessing Chrome using Chrome Driver
		ChromeOptions option = new ChromeOptions();
			option.addArguments("--guest");
			
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
			//Opening the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// 1st way - directly using the action in handling alert
		System.out.println("First Method of displaying");
		String text1 = driver.switchTo().alert().getText();
		System.out.println("Displayed value : " + text1);
		driver.switchTo().alert().accept();
		System.out.println("You pressed OK!");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("You pressed Cancel!");
		System.out.println();
		// 2nd way - using the action in handling alert using variable
		System.out.println("Second Method of displaying");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1 = driver.switchTo().alert();
		String text2 = alert1.getText();
		System.out.println("Displayed value : " + text2);
		alert1.accept();
		System.out.println("You pressed OK!");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		alert1.dismiss();
		System.out.println("You pressed Cancel!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.quit();
		System.out.println();
		System.out.println("Application closed");
	}

}
