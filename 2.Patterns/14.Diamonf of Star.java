/*Problem statement
Print the following pattern for the given number of rows.

Note: N is always odd.


Pattern for N = 5



The dots represent spaces.




Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
   */

   //CODE

   import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=(n/2+1);
        int n2=n1-1;
        int i=1;
        while(i<=n1){

            int j=1;
            while(j<=n1-i){
                System.out.print(' ');
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print('*');
                j++;
            }
            j=1;
            while(j<=i-1){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
           i=1;

        while(i<=n2){
            int j=1;
            while(j<=i){
                System.out.print(' ');
                j++;
            }
            j=1;
            while(j<=(n2-i+1)){
                System.out.print('*');
                j++;
                
            }
            j=1;
            while(j<=n2-i){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}