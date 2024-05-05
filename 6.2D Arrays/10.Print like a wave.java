/*Problem statement
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4
Sample Input 2:
2
5 3 
1 2 3 
4 5 6 
7 8 9 
10 11 12 
13 14 15
3 3
10 20 30 
40 50 60
70 80 90
Sample Output 2:
1 4 7 10 13 14 11 8 5 2 3 6 9 12 15 
10 40 70 80 50 20 30 60 90 
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
            M = sr.nextInt();
            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            Solution.wavePrint(ar);
	    System.out.println();
        }
    }
}

//CODE


public class Solution {

	public static void wavePrint(int mat[][]){
			if (mat.length == 0) {
			return;
		}
		int i = 0;
		int j = 0;
		int count = mat[0].length;
		boolean flag = true;
		while (count >= 1) {
			if (flag) {
				while (i <= mat.length - 1) {
					System.out.print(mat[i][j] + " ");
					i++;
				}
				i = mat.length - 1;
				flag = false;
			} else {
				while (i >= 0) {
					System.out.print(mat[i][j] + " ");
					i--;
				}
				i = 0;
				flag = true;
			}
			j++;
			count--;
		}
	}

}
