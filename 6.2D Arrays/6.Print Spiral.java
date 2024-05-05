/*Problem statement
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:

a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.

Refer to the Image:
Spiral path of a matrix

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 
 */

 // MAIN CODE

 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            Solution.spiralPrint(mat);
            System.out.println();

            t -= 1;
        }
    }
}

//CODE


public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here

		int nRows=matrix.length;
		if(nRows==0){
			return;
		}
		int mCols=matrix[0].length;
		int count=0;
		int element=nRows*mCols;
		int rowStart=0,colStart=0;
		while(count<element){

			//left--->right
			for(int i=colStart; count<element && i<mCols;i++){
				System.out.print(matrix[rowStart][i]+" ");
				count++;
			}
			rowStart++;
			//top-->bottom
				for(int i=rowStart;count<element && i<nRows;i++){
					System.out.print(matrix[i][mCols-1]+" ");
					count++;
				}
				mCols--;

			//right-->left
			for(int i=mCols-1;count<element && i>=colStart;i--){
				System.out.print(matrix[nRows-1][i]+" ");
				count++;
			}
			nRows--;

			//bottom-->top

			for(int i=nRows-1;count<element && i>=rowStart;i--){
				System.out.print(matrix[i][colStart]+" ");
				count++;			
				}
				colStart++;

		}


	}
}