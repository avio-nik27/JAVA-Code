/*Problem statement
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
Explanation :
Input is 4 and print the first 4 numbers that are not divisible by 4 and are of the form 3N + 2, where k is a non-negative integer.    */

//CODE

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=1,num=0,count=0;
		while(count!=x){

			num=3*n+2;
			if((num%4)!=0){
				System.out.print(num + " ");
				count++;
			}
			n++;


		}

	}
}
