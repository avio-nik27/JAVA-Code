/*Problem statement
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to change the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.

Example:
Input Sentence: "Hello I am Aadil"
The expected output will look, "olleH I ma lidaA".
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

All the words in string are separated by a single space.

String does not contain any leading or trailing spaces.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc */

// MAIN CODE

import java.util.Scanner;


public class Runner {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = Solution.reverseEachWord(str);
		System.out.println(ans);
		
	}
}

//CODE

import java.util.*;
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here

		String finalWord = "";
		String arr[] = str.split(" ");
		

		for(int i=0; i<=arr.length-1; i++){
			String cw = arr[i];
			String rw= reverseString(cw);
			finalWord += rw+ " ";
		}
		
		return finalWord;
	}
	public static String reverseString(String s){
		String reversed = "";
		for(int j=0 ; j<s.length() ; j++  ){
			reversed = s.charAt(j) + reversed;
		//	ans +=reversed ;
		}
		return reversed;	
	}

}