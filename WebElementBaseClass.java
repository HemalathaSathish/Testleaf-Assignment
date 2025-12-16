package week3.day1;

public class WebElementBaseClass {
	
	// create common methods such as click() and setText(String text).
	public static void click() {
		System.out.println("Click is initiated");
	}
	
	public void  setText(String text1) {
		System.out.println("Receiving text : " +text1);
	}
	
	
	public static void main(String[] args) {
		WebElementBaseClass webase = new WebElementBaseClass();
		click();
		webase.setText("Hemalatha Sent from Base Class");

	}

}
