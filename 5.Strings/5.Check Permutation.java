/*Problem statement
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.

Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false */

// MAIN CODE

import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
		boolean ans = Solution.isPermutation(str1, str2);

		System.out.println(ans);
		
	}
}

//CODE


public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here

		int count[]=new int[26];
		for(int i=0;i<str1.length();i++){
			count[str1.charAt(i)-'a'] +=1;
		}
			for(int i=0;i<str2.length();i++){
			count[str2.charAt(i)-'a'] -=1;
		}

		Boolean isPermutation=true;
		for(int i=0;i<26;i++){
			if(count[i]!=0){
				return false;
			}
		}
		return true;
	}

}