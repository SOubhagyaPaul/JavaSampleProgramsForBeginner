package day1;
import java.util.Scanner;

/*The nos. in the sequence 0 1 1 2 3 5 8 13 21............. are called Fibonacci nos.
Write aprogram to print the first n (to be taken as input) Fibonacci nos.*/
public class prblm3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		a=0;
		b=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		if(n==1)
			System.out.print(a+" ");
		else if(n==2){
			System.out.print(a+" ");
			System.out.print(b+" ");
		}
		else{
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=3; i<=n;i++){
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");				
			}
		}
		

	}

}


/*
 * output: 
 * Enter the number : 2
0 1 
-------------------------
Enter the number : 7
0 1 1 2 3 5 8 
-------------------------------
Enter the number : 1
0 
 * 
 */
