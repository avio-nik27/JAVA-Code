/*Problem statement
Write a program to print parallelogram pattern for the given N number of rows.

For N = 4



The dots represent spaces.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    ***** 
    
    */

    //CODE

    import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			
			int j=1;
			while(j<=i-1){
				System.out.print(' ');
				j++;
			}
			


			 j=1;
			while(j<=n){
				System.out.print('*');
				j++;
			}
			


			System.out.println();
			i++;

		}
	}
}
