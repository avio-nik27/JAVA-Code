/*Problem statement
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.

Note :
Given array/list can contain duplicate elements.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 50
0 <= N <= 10^2
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11) */


// MAIN CODE

import java.util.Scanner;
public class Runner 
{

    public static void main(String[] args) 
    {
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
            int x =sr.nextInt();
            System.out.println((Solution. findTriplet(arr,x)));
            
            t -= 1;
        }
    }
}



//CODE


public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int size=arr.length;
        int count=0;
        for(int i=0;i<size;i++){

            int j=i+1;
            while(j<size){
                int k=j+1;
                while(k<size){

                    if((arr[i]+arr[j]+arr[k])==x){
                        count++;
                    }
                    k++;
                }
                j++;
            }
        }
        return count;
    }

}