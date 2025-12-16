package week3.day1;

import java.util.Arrays;

public class TwoArray {

	public static void main(String[] args) {
		int array1[]={3,2,11,4,6,7};
		int array2[]= {1,2,8,4,9,7};
		//Sorted both Arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.print("Sorted Array 1 : " );
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");				
		}
		System.out.println();
		System.out.print("Sorted Array 2 : " );
		for (int j = 0; j < array2.length; j++) {
			System.out.print(array2[j] + " ");
		}
		System.out.println();
		System.out.print(" Mathching value : " );
		for (int k = 0; k < array1.length; k++) {
			for (int l = 0; l < array2.length; l++) {
				if (array1[k] == array2[l]) {
					System.out.print(array1[k] + " ");
				}
				
			}
			
		}
		
	}

}
