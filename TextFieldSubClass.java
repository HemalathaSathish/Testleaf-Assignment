package week3.day1;

public class TextFieldSubClass extends WebElementBaseClass{
		// Create getText() method
	public void getText() {
		System.out.println("Getting Text from Applications");
}
	
	public static void main(String[] args) {
		TextFieldSubClass textSub = new TextFieldSubClass();
		textSub.getText();
		click();
		textSub.setText("Sathish sent from TextField Sub Class");
	}

}
