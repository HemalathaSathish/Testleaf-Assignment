package week2.day1;

public class StringManipulation {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		//Spliting the string
		String[] sptext = text.split(" ");
	   
		for (int i = 0; i < sptext.length; i++) { //looping to compare
			int count =0;
			for (int j = 0; j <= sptext.length-1; j++) {
		   		if (sptext[i].equalsIgnoreCase(sptext[j])) {  // checking by ignoring case
					count++;
						if(count>1) {		// ignoring first occurance
							sptext[j]= " ";
						}					
				}
			}
		   	System.out.print(sptext[i]+" ");  //printing the text
		}
	}
}

