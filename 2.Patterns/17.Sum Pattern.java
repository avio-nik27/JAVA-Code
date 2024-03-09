/*Problem statement
Write a program to print triangle of user defined integers sum.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 */

 //CODE

 import java.util.Scanner;
public class Runner {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n){

			int j=1;
			
			while(j<=i){
				System.out.print(j);
				if(j<=i-1){
					System.out.print("+");
				}
				j++;
			}

		    sum=sum+i;
			System.out.print("="+(sum));
		
			i++;
			System.out.println();
		}
		
	}
}