package week3.day1;

public class LoginTestDataSubClass extends TestData {
	//enterUsername() - enterPassword()
	public void enterUsername() {
		System.out.println("Hemalatha");

	}

	public void enterPassword() {
		System.out.println("abc@123");
	}
	
	public static void main(String[] args) {
		LoginTestDataSubClass logtest = new LoginTestDataSubClass();
		logtest.enterUsername();
		logtest.enterPassword();
		logtest.enterCredentials();
		logtest.navigateToHomePage();

	}

}
