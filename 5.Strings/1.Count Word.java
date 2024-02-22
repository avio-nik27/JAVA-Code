/* Problem statement
For a given input string(str), find and return the total number of words present in it.

It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
Sample Input 2:
this is a sample string
Sample Output 2:
5   */

//MAIN CODE

import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner sr= new Scanner(System.in);
		String str = sr.nextLine();
		if(str==null)
		{
			str="";
		}
		int count = Solution.countWords(str);
		System.out.println(count);
	}
}

// CODE


public class Solution {

	public static int countWords(String str) {	
		//Your code goes here

		int ns=0;
		for(int i=0;i<str.length();i++){

				if(str.charAt(i)==' '){
					ns++;
				}
		}
		return ns+1;
	}

}