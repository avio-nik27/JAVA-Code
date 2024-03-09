/*
 * Problem statement
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

Print the prime numbers in different lines.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
 */

 //CODE

 import java.util.Scanner;
import java.lang.Boolean;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

	 for(int i = 1; i <= num; i++){

		if(isPrime(i)) {
		
		System.out.println(i);

	 }
	
	 }
		
	}

	
public static boolean isPrime(int num)	
	{
		if(num == 0 || num == 1)
		 	return false;

		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
