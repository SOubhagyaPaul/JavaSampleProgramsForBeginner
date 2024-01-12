package day1;
import java.util.Scanner;

/*Write a program to obtain the sum of the n terms (n to be taken from the user) of the following series 1 - 3^2/2 + 5^3/3 - 7^4/4.................................................*/

public class prblm9 {

	
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the no of element you want to calculate : ");
		int n=sc.nextInt();
		int x,y,f=1;
		float sum=0;
		for(int i=1;i<=n;i++){
			int numerator = (2 * i) - 1;
			sum+= Math.pow(-1,i-1)* Math.pow(numerator,i)/i;

		}
		System.out.print(" The sum is : "+sum);



		
	}

}


/*

output:

 Enter the no of element you want to calculate : 4
 The sum is : -562.0833
 ------------------------------------
 Enter the no of element you want to calculate : 5
 The sum is : 11247.717
 -------------------------------------------
 
 Enter the no of element you want to calculate : 3
 The sum is : 38.166668
 






*/