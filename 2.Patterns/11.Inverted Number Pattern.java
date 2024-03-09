/*Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
333
22
1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1 */

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
		while(i<=n){

			int j=1;
			while(j<=n-i+1){
				System.out.print(n-i+1);
				j++;
			}
			System.out.println();
			i++;
		}


		
	}

}
