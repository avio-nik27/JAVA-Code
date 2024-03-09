/*Problem statement
Given a binary number as an integer N, convert it into decimal and print.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7 

*/

//CODE

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int pv=1,ld=0,ans=0;
	while(n!=0){

		ld=n%10;
		ans=ld*pv+ans;
		n=n/10;
		pv=pv*2;

	}
	System.out.println(ans);
	}
}
