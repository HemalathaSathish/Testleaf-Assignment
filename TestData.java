package week3.day1;

public class TestData {
		//Implement 2 methods: enterCredentials(), navigateToHomePage()
	
	public void enterCredentials() {
		System.out.println("User name ");
		System.out.println("Password ");

	}
	
	public void navigateToHomePage() {
		System.out.println("Moving to Home page ");

	}
	public static void main(String[] args) {
		TestData tdata = new TestData();
		tdata.enterCredentials();
		tdata.navigateToHomePage();

	}

}
