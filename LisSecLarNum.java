package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LisSecLarNum {
	public static void main(String[] args) {	
		int[] array1=  {3, 2, 11, 4, 6, 7};
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < array1.length; i++) {
			int values = array1[i];
			list1.add(values);
		}	
		System.out.println("Numbers added to list are : " + list1+" ");
		System.out.println();
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("List of numbers in Descending order : " + list1+" ");
		System.out.println();
		System.out.println("The Second largest values : " +list1.get(1));		
	}
}
