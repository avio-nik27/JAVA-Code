/*Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
21
321
4321
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321 */

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
		int i=1,temp;
		while(i<=n){

			int j=1;
			temp=i;
			while(j<=i){

				System.out.print(temp);
				temp--;
				j++;
			}
			System.out.println();
			i++;
		
		}

		
	}

}
