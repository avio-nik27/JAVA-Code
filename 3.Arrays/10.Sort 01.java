/*Problem statement
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 


 */

 //MAIN CODE

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
            Solution. sortZeroesAndOne(arr);
             for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
           
            t -= 1;
        }
    }
}



// CODE

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int size=arr.length;
        int temp=0,pz=0;
        for(int i=0;i<size;i++){
          
          if(arr[i]==0){
              temp=arr[i];
              arr[i]=arr[pz];
              arr[pz]=temp;
              pz++;

          }
            }
    }
}