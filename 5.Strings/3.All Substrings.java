/* Problem statement
For a given input string(str), write a function to print all the possible substrings.

Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:
a 
ab 
abc 
b 
bc 
c 
 Sample Input 2:
co
Sample Output 2:
c 
co 
o  */

// MAIN CODE

import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner sr =  new Scanner(System.in);
		String str = sr.next();

		Solution.printSubstrings(str);
		
	}
}

//CODE


public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here

		for(int i=0;i<str.length();i++){

			int j=i;
			while(j<str.length()){
				System.out.println(str.substring(i, j+1));
				j++;
			}

		}
	}

}