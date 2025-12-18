package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterTwoArray {

	public static void main(String[] args) {
		// Array values stored
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		// Creating list to add array values
		List<Integer> val1 = new ArrayList<Integer>();
		List<Integer> val2 = new ArrayList<Integer>();

		// Adding numbers to list
		for (int j = 0; j < array1.length; j++) {
			int number1 = array1[j];
			val1.add(number1);
		}
		for (int i = 0; i < array2.length; i++) {
			int number2 = array2[i];
			val2.add(number2);
		}
		//Printing numbers in list
		System.out.println("Numbers in List 1: " + val1);
		System.out.println("Numbers in List 2: " + val2);
		System.out.println();
		//Sorting & Printing the numbers in list
		Collections.sort(val1);
		Collections.sort(val2);
		System.out.println("Numbers in List 1 after Sorting : " + val1);
		System.out.println("Numbers in List 2 after Sorting : " + val2);
		System.out.println();
		//Checking & Printing the size of the number
		int size1 = val1.size();
		int size2 = val2.size();
		System.out.println("Size of List 1 : " + size1);
		System.out.println("Size of List 2 : " + size2);
		System.out.println();
		//Comparing list1 to list2 ; comparing list2 to list 1 for any missing numbers; Printing the results
		System.out.print("Missing number in List1 compared to list2 : ");
		for (Integer i : val1) {
			if(!val2.contains(i)) {
				System.out.print(i +", ");
			}
		}
			System.out.println();
		
		System.out.print("Missing number in List2 compared to list1 : ");
		for (Integer j : val2) {
			if(!val1.contains(j)) {
				System.out.print(j+ ", ");
			}
		}
			System.out.println();	
	}
}
			
