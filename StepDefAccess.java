package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefAccess {
	ChromeDriver driver;

	@Given("Launch the Browser")
	public void launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		}
	
	@Given("Load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	
	@Given("Enter the userName {string}")
	public void enter_the_valid_user_name(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@Given("Enter the passWord {string}")
	public void enter_the_valid_pass_word(String uPword) {
		driver.findElement(By.id("password")).sendKeys(uPword);
	}
	
	@When ("Click on loginButton")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Click on LogoutPage")
	public void click_on_logout_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Then("Click on LogoutButton")
	public void click_on_logout_button() {
		driver.findElement(By.className("decorativeSubmit")).click();	
	}
}