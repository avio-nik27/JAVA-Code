/*Problem statement
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here

		String finalWord = "";
		String arr[] = input.split(" ");
		

		for(int i=arr.length-1; i>=0; i--){
			String cw = arr[i];

 */

 // MAIN CODE
 import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseWordWise(input));
	}
}


//CODE

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here

		String finalWord = "";
		String arr[] = input.split(" ");
		

		for(int i=arr.length-1; i>=0; i--){
			String cw = arr[i];
			finalWord += cw+ " ";
		}
		
		return finalWord;

	}
}
