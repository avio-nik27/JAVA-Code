/*Problem statement
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3 */

// MAIN CODE

import java.util.Scanner;
public class Runner {

    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            System.out.println(Solution. duplicateNumber(arr));
           
            t -= 1;
        }
    }
}

// CODE


public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int size=arr.length;
        for(int i=0;i<size;i++){

            int j=0;
            while(j<size){
                
                if( i!=j && arr[i]==arr[j]){
                    return arr[i];

                }
                j++;
            }
        }
        return -1;
    }
}