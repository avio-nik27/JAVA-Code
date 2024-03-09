/*Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 4



The dots represent spaces.




Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654 */

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

			int j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			}
			j=1;
			int num=i;
			while(j<=i){
				System.out.print(num);
				num++;
				j++;
			}

			j=1;
			int temp=(i-1)*2;
			while(j<i){
				System.out.print(temp);
				j++;
				temp--;
			}
			System.out.println();
			i++;
		}
	}
}
