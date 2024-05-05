/*Problem statement
Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix column-wise.

You must return an integer array of size ‘N’ * ‘M’ denoting the column-wise traversal of the matrix.

For example:

Input :
A = [ [1, 2, 3], [4, 5, 6] ]

Output :
1 4 2 5 3 6

Explanation: 
For the given matrix, the first column is [1, 4], the second is [2, 5] and the third is [3, 6].
For column-wise traversal, you must traverse the first column, the second column, and then the third.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N * M <= 10^5
1 <= A[ i ][ j ] <= 10^9
Time Limit: 1 sec
Sample Input 1 :
2
2 2 
4 3
2 1
5 1
1 
2 
3 
4 
5
Sample Output 1 :
4 2 3 1
1 2 3 4 5 
Explanation Of Sample Input 1 :
For test case one:
Input :
A = [ [4, 3], [2, 1] ]
Output :
4 2 3 1
Explanation: For the given matrix, the first column is [4, 2], and the second is [3, 1].
For column-wise traversal, you need to traverse the first column and then the second column.

For test case two:
Input :
A = [ [ 1 ], [ 2 ], [ 3 ], [ 4 ], [ 5 ] ]
Output :
1 2 3 4 5
Explanation: For the given matrix, the first column is [1, 2, 3, 4, 5].
For column-wise traversal, you need to traverse the first column.
Sample Input 2 :
2
1 1 
4
1 5
1 2 3 4 5
Sample Output 2 :
4
1 2 3 4 5  */


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
            ans= Solution.printColWise(ar);
           // System.out.print(ans.length);
            for(int i=0;i<ans.length;i++)
            {
                    System.out.print(ans[i]+" ");
            }
	    System.out.println();
               
        }
    }
}


// CODE

public class Solution {
    public static int[] printColWise(int [][]a) {
        // Write your code here.

        int n=a.length;
        int m=a[0].length;
        int k=0;
        int ans[]=new int[n*m];
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                ans[k]=a[j][i];
                k++;
            }
        }

        return ans;
    }
}