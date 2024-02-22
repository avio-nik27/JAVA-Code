/*Problem statement
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1



Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= x <= 8 
0 <= n <= 9
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32 */

// Code


import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pow=1;

       if(x==0 && n==1){
           System.out.println(0);
       }else{

        while(n!=0){

            pow=pow*x;
            n--;

        }

        System.out.println(pow);

       }
        
    }
}