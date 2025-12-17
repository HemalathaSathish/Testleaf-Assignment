package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HwSortCollectio {

	public static void main(String[] args) {
	String[] companies =	{"HCL", "Wipro", "Aspire Systems", "CTS"};
	
	List<String> values = new ArrayList<String>();
	
	for (int i = 0; i < companies.length; i++) {
		values.add(companies[i]);
	}
	System.out.println(values);
	Collections.sort(values,Collections.reverseOrder());
	System.out.println(values);
	}
}
