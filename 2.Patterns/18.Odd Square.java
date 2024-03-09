/*Problem statement
Write a program to print the pattern for the given N number of rows.

For N = 4

1357
3571
5713
7135
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
 */

 //CODE

 import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args) 
	{
	 // write your code logic here !!
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	while(i<=n){

		int num=(2*i)-1;
		int j=n;

		while(j>0){
			System.out.print(num);
			num=num+2;

			int maxVal=(2*n)-1;
			if(num>maxVal){
				num=1;
			}
			j--;
		}

	    System.out.println();
		i++;
		
	}
    }
}