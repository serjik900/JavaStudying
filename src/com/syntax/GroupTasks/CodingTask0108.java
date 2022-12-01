package GroupTasks;

public class CodingTask0108 {

/*Fibonacci Number Series: a series of numbers in which each number is the sum of 
* the two preceding numbers. 0, 1, 1, 2, 3, 5, 8, 13, 21, …. “3” is obtained by adding 
*  the third and fourth term (1+2) and so on. For example, the next term after 21 can be 
* found by adding 13 and 21. Therefore, the next term in the sequence is 34.
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstTenNumbers = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + firstTenNumbers + " numbers are: ");

		for (int i = 1; i <= firstTenNumbers; ++i) {
			System.out.print(previousNumber + " ");
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

}
