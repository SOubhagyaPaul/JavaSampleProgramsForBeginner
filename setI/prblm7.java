package day1;
import java.util.Scanner;

/*Write a program to find all Armstrong numbers in the range 1 to M, where M is taken as input.*/

public class prblm7 {

	static boolean IsArmstrong(int n, int ord) {
		
		int digit,sum=0,copy;
		copy=n;
		while(copy>0) {
			digit=copy%10;
			sum +=(Math.pow(digit,ord));
			copy/=10;
		}
		if(sum==n)
			return true;
		else
			return false;
		
	}
	
	static int order(int n) {
		
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the range from 1 upto you want to print : ");
		int n=sc.nextInt();
		int ord;
		for(int i=0;i<=n;i++) {
			ord=order(i);
			if(IsArmstrong(i,ord)) {
				System.out.print(i+ " ");
			}
			
		}
	}

}



/*
 * output:
 * Enter the range from 1 upto you want to print : 1
0 1 
------------------------------------
Enter the range from 1 upto you want to print : 99
0 1 2 3 4 5 6 7 8 9 
 * 
 *
 * 
 */
