/*Problem statement
Print the following pattern

Pattern for N = 4




Hint
As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
The dots represent spaces.




Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 
 */

 //CODE

 import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){

			int spaces=1;
			int j=1;
			while(j<=n-i){
				System.out.print(" ");
				spaces++;
				j++;
			}
			j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			
			j=1;
			while(j<=i-1){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		
	}

}
