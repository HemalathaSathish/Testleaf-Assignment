package week1.day2;

public class FibonacciSeries {
// 0,1,1,2,3,5,8- generate Fibonacci Series
	public static void main(String[] args) {
		int range = 8;  // intiating range 
		int f=0;		// initiating first number
		int s=1;
		int result=0;
		
		//looping to generate result
		for (int i = 1; i < range ; i++) {
			System.out.println(f);	
			result =f+s;
			f=s;	
			s=result;			// swapping the values to the variables
			}	
		}
	}

