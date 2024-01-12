package day1;
import java.util.Scanner;

/*Write a program to find the prime factors of the given number . 
 (e.g. Input : 315 Output: 3 3 5 7*/


public class prblm5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
			
				while(n%i==0){
					System.out.print(i+" ");
					n/=i;
				}
		}
		if(n>2)
			System.out.print(n);
	}
}





/*
output:
Enter the number : 315
3 3 5 7
---------------------------------
Enter the number : 97
97
---------------------------
Enter the number : 84
2 2 3 7




*/