/*Problem statement
For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136

*/

// MAIN CODE

import java.util.Scanner;

public class Runner {

    public static void main(String args[]) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            Solution.totalSum(ar);
        }
    }
}


//CODE


public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here

	int n= mat.length;
	int sum=0;

	for(int i=0;i<n;i++){       //top and bottom row

		sum=sum+mat[0][i];
		sum=sum+mat[n-1][i];
		
			
			}

	for(int i=1;i<n-1;i++){     // left & right diagonal

		sum=sum+mat[i][0];
		sum=sum+mat[i][n-1];

	}

	for(int i=1;i<n-1;i++){     //left diagonal & right diagonal

		sum=sum+mat[i][i];
		sum=sum+mat[i][n-1-i];
	}

	if(n%2!=0){                                         // to remove middle element as it already added in diagonal addition
		sum=sum-mat[n/2][n/2];
	}

	System.out.println(sum);
	}

}
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here

	int n= mat.length;
	int sum=0;

	for(int i=0;i<n;i++){       //top and bottom row

		sum=sum+mat[0][i];
		sum=sum+mat[n-1][i];
		
			
			}

	for(int i=1;i<n-1;i++){     // left & right diagonal

		sum=sum+mat[i][0];
		sum=sum+mat[i][n-1];

	}

	for(int i=1;i<n-1;i++){     //left diagonal & right diagonal

		sum=sum+mat[i][i];
		sum=sum+mat[i][n-1-i];
	}

	if(n%2!=0){                                         // to remove middle element as it already added in diagonal addition
		sum=sum-mat[n/2][n/2];
	}

	System.out.println(sum);
	}

}