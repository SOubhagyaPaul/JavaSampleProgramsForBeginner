package day1;
import java.util.Scanner;

/*Write a program for determining whether a number is a Perfect number or not. 
 (e.g. 28 is a Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)*/
public class prblm4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		for(int i=1; i<n;i++){
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println(" Perfect number");
		else
			System.out.println("Not Perfect number");
	}

}


/*
 *output:
 * Enter the number : 28
 Perfect number
--------------------------
Enter the number : 415
Not Perfect number
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
  */
