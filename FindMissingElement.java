package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int numbers[] ={1, 4,3,2,8, 6, 7};
		
		//Sorting the numbers
		Arrays.sort(numbers);
		 System.out.print("Numbers after sorting : " );
		 for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}System.out.println();
				
		// Iterating and comparing iteration with values of array
		for (int i =0; i < numbers.length; i++) {
			if (numbers[i]==i+1) {
				System.out.println("Available : " + numbers[i]);
				}else {
					System.out.println("missing : " +(i+1));
					break;					
				}
		}	
	}
}
	

