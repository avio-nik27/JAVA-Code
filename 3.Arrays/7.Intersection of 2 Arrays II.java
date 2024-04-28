/*Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1 sec 
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 4 3
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {

        int n=arr1.length;
        int m=arr2.length;
        
        for(int i=0;i<n;i++){


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
            int[] arr1=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr1[i]=sr.nextInt();
            }
            int m =sr.nextInt();
            int[] arr2=new int[m];
            for (int i =0 ; i<m;i++)
            {
                arr2[i]=sr.nextInt();
            }
            Solution. intersections(arr1, arr2);
            System.out .println();
            t -= 1;
        }
    }
}



// CODE


public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {

        int n=arr1.length;
        int m=arr2.length;
        
        for(int i=0;i<n;i++){

            int j=0;
           
            while(j<m){

                if(arr1[i]==arr2[j]){
                    
                    System.out.print(arr1[i] + " ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                    
                }
                j++;
            }
            
        }


    }
}