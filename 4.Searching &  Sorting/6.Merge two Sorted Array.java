/*Problem statement
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

Note:
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Note:
Consider the case when size of the two arrays is not same.
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13 
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90 */

// MAIN CODE

import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i] = sc.nextInt();
		    }
		    int m = sc.nextInt();
		    int[] arr2 = new int[m];
		    for(int i=0;i<m;i++)
		    {
		        arr2[i] = sc.nextInt();
		    }
		    int[] ans = new int[m+n];
		    ans = Solution.merge(arr1, arr2);
            for(int i=0;i<m+n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t-=1;
		}
		
		
	}
}


//CODE


public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3 = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){

            if(arr1[i]>arr2[j] ){
                arr3[k]=arr2[j];
                j++;
                k++;
                
            }else{
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        while(i<n){
            arr3[k]=arr1[i];
                i++;
                k++;
        }
        while(j<m){
              arr3[k]=arr2[j];
                    j++;
                    k++;
        }
     
        
        return arr3;
    }

}