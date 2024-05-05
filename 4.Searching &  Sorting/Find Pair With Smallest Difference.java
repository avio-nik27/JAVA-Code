/*Problem statement
Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference is the smallest, and return the min difference.

Example :
N = 3, arr1 = [10, 20, 30]
M = 2, arr2 = [17, 15]
The smallest difference pair is (20, 17) with an absolute difference of 3. So, the answer is 3.
Note :
Both the arrays are unsorted, and all array elements are non-negative integers.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N, M <= 1000
0 <= arr1[i], arr2[i] <=10^6

Time Limit: 1 second
Sample input 1 :
2
3 3
12 7 5
4 4 6
3 2
10 20 30 
17 15
Sample output 1 :
1
3
Explanation For Sample Input 1 :
Test Case 1 :
The smallest difference pairs are (7, 6) and (5, 6) with an absolute difference of 1, so the answer is 1.

Test Case 2 :
The smallest difference pair is (20, 17) with an absolute difference of 3, so the answer is 3.
Sample input 2 :
2
4 4
1 5 12 3
16 9 10 20
2 4
20 10
10 13 19 16
Sample output 2 :
2
0 */

// MAIN CODE

import java.util.Scanner;
public class Runner
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        int t= sr.nextInt();
        while(t > 0)
        {
            int n=sr.nextInt();
            int m = sr.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i<n ;i++)
            {
                a[i] = sr.nextInt();
            }
            
            int b[] =new int[m];
            //int index=0;
            for(int i=0;i<m;i++)
            {
                b[i]=sr.nextInt();
            }
            int ans;
            ans =Solution.smallestDifferencePair(a, n, b, m);
            System.out.println(ans);
            t = t-1;
        }
    }
}


// CODE

import java.util.Arrays;
import java.util.*;
public class Solution {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int idx1=0,idx2=0;
        int mindiff=Math.abs(arr1[0]-arr2[0]);
    
        while(idx1<n && idx2<m){

            mindiff=Math.min(mindiff, Math.abs(arr1[idx1]-arr2[idx2]));
           
            if(arr1[idx1]<arr2[idx2]){
                idx1++;
            }else{
                idx2++;
            }
        }
        return mindiff;

    }
}