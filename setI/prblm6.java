package day1;
import java.util.Scanner;

/*Write a program for determining whether a number is a Pearson number or not.
(e.g. 145 is a Pearson number because 1! + 4! + 5! =145.)*/
public class prblm6 {


	static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int s,sum=0;
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int copy=n;
		while(n>0){
			s=n%10;
			sum+=fact(s);
			n/=10;
		}
		if(sum==copy) {
			System.out.print("This is a pearson number.");
		}
		else
			System.out.print("This is not a pearson number.");
			
		

	}

}


/*
 * Enter the number : 145
This is a pearson number.
-----------------------------
Enter the number : 68
This is not a pearson number.

 */
