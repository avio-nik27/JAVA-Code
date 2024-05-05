/*Problem statement
You are given an integer array 'arr' of size 'N'.



You must sort this array using 'Insertion Sort' recursively.



 Note:
Change in the input array itself. You don't need to return or print the elements.
Example:
Input: ‘N’ = 7
'arr' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying insertion sort on the input array, the output is [1 2 3 4 6 13 28].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
9 3 6 2 0
Sample Output 1:
0 2 3 6 9
Sample Input 2:
4
4 3 2 1
Sample Output 2:
1 2 3 4 
Constraints :
0 <= N <= 10^3
0 <= arr[i] <= 10^5
Time Limit: 1 sec */

// MAIN CODE

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
            for(int j = 0; j < n[i]; j++)
                arr[i][j] = sc.nextInt();
        }
    }

    private static void execute() {
        for (int i = 0; i < t; ++i) {
            Solution.insertionSort(arr[i], n[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; ++i) {
            Solution.insertionSort(arr[i], n[i]);
            for(int j : arr[i]){
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        takeInput();
        executeAndPrintOutput();
    }

}


//CODE

public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=1;i<size;i++){

            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}