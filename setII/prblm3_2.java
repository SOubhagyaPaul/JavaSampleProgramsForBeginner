package day1;
import java.util.Scanner;
/*Write a program to evaluate, the following investment equation: V=P ( 1 + r )^n
and print the tables which would give the values of V for various combinations of the following values of P, r & n.
P : 1000,2000,3000,…,10,000 R : 0.10,0.11,0.12,….0.20 n : 1,2,3,…,10 */



public class prblm3_2{

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of combinations you want to see : ");
		int num= sc.nextInt();
		float p[]=new float[num];
		float r[]=new float[num];
		float n[]=new float[num];
		for(int i=0;i<num;i++){
			System.out.println("Enter the principal amount for "+(i+1)+" combinations : ");
			p[i]=sc.nextFloat();
			System.out.println("Enter the principal rate for "+(i+1)+" combinations : ");
			r[i]=sc.nextFloat();
			System.out.println("Enter the principal year for "+(i+1)+" combinations : ");
			n[i]=sc.nextFloat();
			
					
		}
		for(int i=0;i<num;i++){
			float v;
			v=p[i] *(float) (Math.pow(1+r[i],n[i]));
			System.out.println(" The principal amount is "+p[i]+"rate of interest "+r[i]+"year of investment "+n[i]+" The V is "+v);
		}


	}


}

/*
Enter the number of combinations you want to see : 
5
Enter the principal amount for 1 combinations : 
1000
Enter the principal rate for 1 combinations : 
.10
Enter the principal year for 1 combinations : 
2
Enter the principal amount for 2 combinations : 
1000
Enter the principal rate for 2 combinations : 
.10
Enter the principal year for 2 combinations : 
5
Enter the principal amount for 3 combinations : 
1000
Enter the principal rate for 3 combinations : 
.7
Enter the principal year for 3 combinations : 
2
Enter the principal amount for 4 combinations : 
2000
Enter the principal rate for 4 combinations : 
.5
Enter the principal year for 4 combinations : 
4
Enter the principal amount for 5 combinations : 
4000
Enter the principal rate for 5 combinations : 
.6
Enter the principal year for 5 combinations : 
5
 The principal amount is 1000.0rate of interest 0.1year of investment 2.0 The V is 1210.0
 The principal amount is 1000.0rate of interest 0.1year of investment 5.0 The V is 1610.5103
 The principal amount is 1000.0rate of interest 0.7year of investment 2.0 The V is 2890.0
 The principal amount is 2000.0rate of interest 0.5year of investment 4.0 The V is 10125.0
 The principal amount is 4000.0rate of interest 0.6year of investment 5.0 The V is 41943.043

*/