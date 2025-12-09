package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test1 = "I am a software tester";
		
		//Split the string
		String[] spvalue = test1.split(" ");		
		
		// looping the String
		for (int i = 0; i <spvalue.length ; i++) {
		
			// Checking whether the index value of string is odd number
			if (i%2==0) { // if true execute if block
				System.out.print(spvalue[i] + " ");	
			} else{			//if condition is false execute else block
				String temp = spvalue[i]; 	//storing the string in variable
			
				//converting string to character
				char[] charvalue = temp.toCharArray();
				//looping the character
				for (int j = charvalue.length-1; j >=0 ; j--) {
					System.out.print(charvalue[j]);		//printing the character
				
			}
		}	System.out.print(" ");
	}
}
}

	
