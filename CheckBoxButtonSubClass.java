package week3.day1;

public class CheckBoxButtonSubClass extends ButtonSubClass {

	// Create clickCheckButton()
	public void clickCheckButton() {
		System.out.println("Select the check box");
	}
	
	public static void main(String[] args) {
		CheckBoxButtonSubClass checkSub = new CheckBoxButtonSubClass();
		checkSub.clickCheckButton();
		click();
		checkSub.setText("Pravan sent from CheckBoxButtonSubClass");
		checkSub.submit();
	}

}
