/*Problem statement
For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 2 
1 2 
3 4 
5 6 
7 8
Sample Output 1:
3 7 11 15 
Sample Input 2:
2
2 5 
4 5 3 2 6 
7 5 3 8 9
4 4
1 2 3 4
9 8 7 6
3 4 5 6
-1 1 -10 5
Sample Output 2:
20 32 
10 30 18 -5 
 */

 // MAIN CODE

 import java.util.Scanner;

public class Runner {
    

   public static void main(String args[]) 
    {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i][j]=sr.nextInt();
                }
            }
            int ans[]= new int[n*m];
            Solution.rowWiseSum(ar);
        }
    }
}


// CODE


public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here


		int m = mat.length;
        if (m == 0) {
        return;
        }
        int n=mat[0].length;
        
		
		for(int i=0;i<m;i++){
            
			int sumr=0;

			for(int j=0;j<n;j++){

				sumr=sumr+mat[i][j];

			}
			System.out.print(sumr + " ");
		}
        System.out.println();
	}

}