/*Problem statement
You are given a matrix ‘MAT’. Print and return the transpose of the matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, transpose of a matrix A[][] is obtained by changing A[i][j] to A[j][i].

For example:
Let matrix be : 
1 2
3 4

Then transpose of the matrix will be: 
1 3
2 4
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= M, N <= 3*10^3
0 <= MAT[i][j] <= 10^7

Time Limit: 1 sec
Sample Input 1 :
2
2 2
1 2
3 4
3 2
1 2 
2 3
3 4
Sample Output 1 :
1 3
2 4
1 2 3
2 3 4
Explanation For Sample Input 1 :
For test case 1: 
The transpose of the matrix will be: 
1 3
2 4

For test case 2:    
The transpose of the matrix will be: 
1 2 3
2 3 4
Sample Input 2 :
2
2 3
1 2 3 
3 4 5
2 1
1
2
Sample Output 2 :
1 3
2 4 
3 5
1 2

 */

 // MAIN CODE

 import java.util.Scanner;

public class Runner 
{
    public static void main(String args[]) 
    {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            m = sr.nextInt();
            n = sr.nextInt();
            int ar[][] = new int[m][n]; // Swap n and m in array dimensions
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    ar[i][j] = sr.nextInt();
                }
            }
	        int ans[][]=new int[n][m];
            ans = Solution.transpose(m,n,ar);
    	    for(int i=0;i<n;i++)
    	    {	
        		for(int j=0;j<m;j++)
        		{
        			System.out.print(ans[i][j]+" ");
        		}
		        System.out.println();
	        }
        }
    }
}


// CODE

import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
		int ans[][]=new int[n][m];
		for(int i=0;i<m;i++){

			for(int j=0;j<n;j++){

				ans[j][i]=mat[i][j];
			}
		}
		return ans;
	}

}
