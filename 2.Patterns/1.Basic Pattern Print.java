/* 
Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 3
###
###
###
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 50
Sample Input1:
5
Sample Output 1:
#####
#####
#####
#####
#####
Sample Input 2:
4
Sample Output 2:
####
####
####
####
*/

//code

import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n){
				System.out.print('#');
				j++;
			}

			System.out.println();
			i++;
			
		}


	}
}