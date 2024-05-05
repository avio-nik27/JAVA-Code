/*Problem statement
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row or column) amongst all the rows/columns.

Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
3 2
6 9 
8 5 
9 2 
Sample Output 1:
column 0 23
Sample Input 2:
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 
Sample Output 2:
column 0 31
 */

 // MAIN CODE

 import java.util.Scanner;

public class Runner 
{

    public static void main(String args[]) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
		{
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) 
			{
                for (int j = 0; j < m; j++) 
				{
                    ar[i][j] = sr.nextInt();
                }
            }
            Solution.findLargest(ar);
        }
    }
}


//CODE


public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
		int max=Integer.MIN_VALUE;
		boolean isRow=true;
		int idx=0;

		int n=mat.length;
		if(n==0 ){
			System.out.print("row" + " " +idx+ " " + max);
			return;
		}
		int m=mat[0].length;
		
		for( int i=0;i<n;i++){

			int sum=0;
			for(int j=0;j<m;j++){
				sum=sum+mat[i][j];
			}

			if(sum>max){
				max=sum;
				idx=i;
			}
		}

		for(int i=0;i<m;i++){

			int sum=0;
			for(int j=0;j<n;j++){

				sum+=mat[j][i];
			}
			if(sum>max){
				max=sum;
				isRow=false;
				idx=i;
			}
		}
		if(isRow==true){
			System.out.print("row ");
		}else{
			System.out.print("column ");
		}
		System.out.println(idx + " " + max);
	}

}