/*Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
A
BC
CDE
DEFG
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK */

//CODE

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		char ch='A';
		while(i<=n){
				
				int j=1;
				ch=(char)('A'+i-1);
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
