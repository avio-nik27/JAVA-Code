/*Problem statement
Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.



 Note:
Change in the input array/list itself. 


Example:
Input:
N = 5
arr = {8, 6, 2, 5, 1}

Output:
1 2 5 6 8 
Explanation: add-image

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6
2 13 4 1 3 6 
Sample Output 1:
1 2 3 4 6 13 
Explanation Of Sample Input 1:
 Select 1 and swap with element at index 0. arr= {1,13,4,2,3,6}

 Select 2 and swap with element at index 1. arr= {1,2,4,13,3,6}

 Select 3 and swap with element at index 2. arr= {1,2,3,13,4,6}

 Select 4 and swap with element at index 3. arr= {1,2,3,4,13,6}

 Select 6 and swap with element at index 4. arr= {1,2,3,4,6,13}
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Constraints :
1 <= N <= 10^3
0 <= arr[i] <= 10^5
Time Limit: 1 sec */

//MAIN CODE

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Runner {
    public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine());
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        String nextL() throws IOException {
            return br.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t;
    private static int []n;
    private static int [][]arr;

    private static void takeInput() throws IOException {
        t = 1;
        n = new int[t];
        arr = new int[t][];
        for (int i = 0; i < t; ++i) {
            n[i] = sc.nextInt();
            arr[i] = new int[n[i]];
            for(int j = 0; j < n[i]; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    private static void execute() {
        for (int i = 0; i < t; ++i) {
            Solution.selectionSort(arr[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; ++i) {
            Solution.selectionSort(arr[i]);
            for(int j : arr[i])
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        takeInput();
        executeAndPrintOutput();
    }

}

//CODE

public class Solution {
    public static void selectionSort(int[] arr) {
        
        int size=arr.length;
        int min=0,minIndex=0;
        for(int i=0;i<size;i++){

            min=arr[i];
            minIndex=i;
            for(int j=i+1;j<size;j++){

                if(min>arr[j]){

                    min=arr[j];
                    minIndex=j;
                }
            }

            if(minIndex!=i){

                arr[minIndex]=arr[i];
                arr[i]=min;
            }
            
        }
    }
}