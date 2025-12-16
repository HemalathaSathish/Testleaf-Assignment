package week3.day1;

public class ButtonSubClass extends WebElementBaseClass{
	
	// create submit()
	public void submit() {
		System.out.println("Application is submitted");
	}

	public static void main(String[] args) {
		ButtonSubClass butSub = new ButtonSubClass();
		click();
		butSub.setText("Pravan sent from Button Sub class");
		butSub.submit();
		

	}

}
