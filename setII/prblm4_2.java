package day1;
import java.util.Scanner;
/*The formula for resistors connected in parallel is a little more complex. Given two resistors with resistances R1 and R2 connected in parallel the equivalent resistance is given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a program that calculates the resistance of a group of resistors arranged in parallel.*/

public class prblm4_2{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of resistors: ");
		int n=sc.nextInt();
		float sumOfR=0,R;
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the resistance of resistor "+(i+1)+": ");
			float r=sc.nextFloat();
			sumOfR+= 1.0/r;
		}
		R=(float)1/sumOfR;
		System.out.println("The  resistance of a group of resistors arranged in parallel is : "+R);
	
	}



}



/*
output:
Enter the number of resistors: 
3
Enter the resistance of resistor 1: 
3
Enter the resistance of resistor 2: 
4
Enter the resistance of resistor 3: 
5
The  resistance of a group of resistors arranged in parallel is : 1.2765957



*/