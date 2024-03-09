/*Problem statement
Write a program to print N number of rows for Half Diamond pattern using stars and numbers

Note : There are no spaces between the characters in a single line.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
 */

 //CODE

 import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n-1;
        int i=1;
        System.out.println('*');
        while(i<=n){

            System.out.print('*');

            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=1;
            int temp=i-1;
            while(j<=i-1){
                System.out.print(temp);
                temp--;
                j++;
            }
            System.out.println('*');
            i++;
        }
        i=1;
        while(i<=n1){
            System.out.print('*');

                int j=1;
                while(j<=(n1-i+1)){
                System.out.print(j);
                j++;
            }

            j=1;
            int temp=n1-i;
            while(j<=(n1-i)){
                System.out.print(temp);
                temp--;
                j++;
            }

            
           
            System.out.println('*');
            i++;
        }
        System.out.println('*');

        
    }
}