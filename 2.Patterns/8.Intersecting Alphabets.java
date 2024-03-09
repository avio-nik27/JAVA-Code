/*Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG */

//CODE

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		char ch;
		while(i<=n){

			ch=(char)('A' + n-i);
			int j=1;
			while(j<=i){
				System.out.print(ch);
				ch=(char)(ch+1);
				j++;
			}
	
			System.out.println();
			i++;
			
		}
	}
}