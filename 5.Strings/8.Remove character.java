/*Problem statement
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.

The input string will remain unchanged if the given character(X) doesn't exist in the input string.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
 */

 // MAIN CODE

 import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char x = sr.next().charAt(0);
		String ans = Solution.removeAllOccurrencesOfChar(str, x);
		System.out.println(ans);
		
	}
}

//CODE


public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans="";
		for(int i=0;i<str.length();i++){

				
			if(ch!=str.charAt(i)){

				ans=ans+str.charAt(i);
				
				
			}
		}
		return ans;
	}

}