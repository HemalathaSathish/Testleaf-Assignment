package week2.day1;

public class ChangeToUpcase {

	public static void main(String[] args) {
		
		String test= "changeme";
		
		// Convert to character
		char[] chvalue = test.toCharArray();
		
		// Looping to characters
		for (int i = 0; i < chvalue.length; i++) {
		// Checking the odd number 
			if (i%2 ==0) {
				System.out.print(chvalue[i]+" ");		
			} else {
				// convert char to string using toString method
				String str = Character.toString(chvalue[i]);	
				// convert string to upper case
				System.out.print(str.toUpperCase()+ " ");
			}
		}		
	}

}
