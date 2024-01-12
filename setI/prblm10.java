package day1;
import java.util.Scanner;

/*Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the following series x – x3/3! + x5/5! - x7/7! ...*/

public class prblm10 {
	static int fact(int n){
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the no of element you want to calculate : ");
		int n=sc.nextInt();
		System.out.print(" Enter the value of x: ");
		int x=sc.nextInt();


		float sum=0;
		for(int i=1;i<=n;i++){
			
			int d = (2 * i) - 1;
			int denominator= fact(d);
			int expo = (2 * i) - 1;
			sum+= Math.pow(-1,i-1)* Math.pow(x,expo)/denominator;

		}
		System.out.print(" The sum is : "+sum);

	}

}


/*
 * output:
 *  Enter the no of element you want to calculate : 3
 Enter the value of x: 4
 The sum is : 1.8666668
 -----------------------------------------
  Enter the no of element you want to calculate : 3
 Enter the value of x: 2
 The sum is : 0.93333334
 ------------------------------------------
  Enter the no of element you want to calculate : 5
 Enter the value of x: 3
 The sum is : 0.14531247
 
 
 * 
 * 
 * 
 */