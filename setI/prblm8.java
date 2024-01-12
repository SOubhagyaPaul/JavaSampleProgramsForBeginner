package day1;
import java.util.Scanner;

/*Write a Program in Python to find the sum of all the Prime numbers between a given range of numbers.*/

public class prblm8 {

	
	static boolean IsPrime(int n){
		 if(n==0||n==1){
			return false;
		}
		else{
			for(int i=2; i<=Math.sqrt(n);i++){
				if(n%i==0)
					return false;

			}
			return true;
		}
	
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the numbers range from 0 to ... you want to print : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=2;i<n;i++){
			if(IsPrime(i)){
				sum+=i;
			}
		}
		System.out.println("The sum of prime no in that range : "+sum);
		
		
	}

}


/*
 * output:
 *  Enter the numbers range from 0 to ... you want to print : 1
The sum of prime no in that range : 0
----------------------------------------------
 Enter the numbers range from 0 to ... you want to print : 99
The sum of prime no in that range : 1060
--------------------------------------------------
 Enter the numbers range from 0 to ... you want to print : 20
The sum of prime no in that range : 77
 * 
 * 
 * 
 */
