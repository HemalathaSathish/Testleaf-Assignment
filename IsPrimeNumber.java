package week1.day2;

public class IsPrimeNumber {
// Program name : Check Number IsPrime
// Prime number : number divisible by 1 and itself
public static void main(String[] args) {

	int z=8;    //value is passed through code
	int count = 0;    // intialising the count of divisibility

	//starting the loop to check each number starting from 2 with initially passed value 
	for (int n = 2; n <= z; n++) {   
			if (z%n==0) {
				System.out.println("The given value " +z + " is divisible by " +n);
				count+=1; // to count number of times the given number is divisible 
			}else {
				System.out.println("The given value " +z + " is not divisible by " +n );
				
			} 
		  }
	// If the number divides with other number then it is not prime
		   if (count>1) {
			   System.out.println("The given number "+ z + " is Not Prime Number");
		  }else {
			   System.out.println("The given number "+ z + " is Prime Number");
				}
			
		  }	
		}
			
