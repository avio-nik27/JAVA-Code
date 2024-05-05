/*Problem statement
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider:
Assume all the characters in the given string to be in lowercase always.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
 */

 // MAIN CODE

 import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char ans = Solution.highestOccuringChar(str);
		System.out.println(ans);
		
	}
}


//CODE

import java.util.*;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int count[]=new int[26];
		int maxfreq=0;
		for(int i=0;i<str.length();i++){

			count[str.charAt(i)-'a'] +=1;
			maxfreq=Math.max(maxfreq, count[str.charAt(i)-'a']);

		}
		for( int i=0;i<str.length();i++){
			
			if(count[str.charAt(i)-'a']==maxfreq){
				return str.charAt(i);
			}

			}

			return str.charAt(maxfreq+'a');       // need to understand this line
		
	}

}