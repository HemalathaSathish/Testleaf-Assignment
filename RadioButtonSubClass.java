package week3.day1;

public class RadioButtonSubClass extends ButtonSubClass {
	
	// Create selectRadioButton() method
		public void selectRadioButton() {
		System.out.println("Radio Button is pressed");
	}
	
		
	public static void main(String[] args) {
		RadioButtonSubClass radioSub = new RadioButtonSubClass();
		radioSub.selectRadioButton();
		click();
		radioSub.setText("Radio button selection sent from RadioButtonSubClass");
		radioSub.submit();

	}

}
