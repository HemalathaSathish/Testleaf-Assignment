package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMissElement {

public static void main(String[] args) {
		
		//Find Missing Element using List
		int[] array =  {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(array);
	
		//List created adding values to list
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.print("Sorted Array : ");
		for (int i = 0; i < array.length; i++) {
			 System.out.print(array[i] +", ");
			 int values=array[i];
			 list1.add(values);
		}
		System.out.println();
		System.out.println("Array Converted to list : "+list1 + " ");

		System.out.println();
		//Checking for size of list
		int size1 = list1.size();
		System.out.println("Size of List : " + size1 +" ");
		System.out.println();
		
		//list values are stored as in using get() method
		for (int i = 0; i < list1.size()-1; i++) {
			int currentNum = list1.get(i);
			int nextNum = list1.get(i+1);
			if ((currentNum+1)!=nextNum) {
		            System.out.println("Missing number: " + (currentNum+1));

			}
			
		}
		
	}
		
}	

